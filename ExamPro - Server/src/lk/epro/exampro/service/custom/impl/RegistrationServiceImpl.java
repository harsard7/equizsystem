/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.exampro.buisness.BOFactory;
import lk.ijse.exampro.buisness.custom.RegistrationBO;

import lk.ijse.exampro.dto.RegistrationDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.reservation.impl.ReservationImpl;
import lk.ijse.exampro.service.custom.RegistrationService;

/**
 *
 * @author Hafees
 */
public class RegistrationServiceImpl extends UnicastRemoteObject implements RegistrationService, Subject {

    private RegistrationBO registrationBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<RegistrationService> registrationResBook = new ReservationImpl<>();

    public RegistrationServiceImpl() throws RemoteException {
        registrationBO = (RegistrationBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.REGISTRATION);
    }

    @Override
    public boolean addRegistration(RegistrationDTO registration) throws Exception {
      
        boolean registrationS = registrationBO.addRegistration(registration);
         
       // notifyAllObservers();
        return registrationS;
    }
    
    @Override
    public List<RegistrationDTO> getAllRegistration() throws Exception {
       return registrationBO.getAllRegistration();
    }

  

    @Override
    public void registerObserver(Observer observer) throws Exception {
        alObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
        alObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() throws Exception {
        new Thread(() -> {
            for (Observer observer : alObservers) {
                try {
                    observer.update(null);
                } catch (Exception ex) {
                    Logger.getLogger(RegistrationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public boolean updateRegistration(RegistrationDTO registration) throws Exception {
        boolean registrationS = false;
        if (registrationResBook.reserve(registration.getRegid(), this, true)) {
            registrationS = registrationBO.updateRegistration(registration);
            //notifyAllObservers();
            if (registrationResBook.isReservedInternally(registration.getRegid())){
                registrationResBook.release(registration.getRegid());
            }
        }
        return registrationS;
    }

    @Override
    public boolean deleteRegistration(String registrationID) throws Exception {
        boolean registration = false;
        if (registrationResBook.reserve(registrationID, this, true)) {
            registration = registrationBO.deleteRegistration(registrationID);
           // notifyAllObservers();
            if (registrationResBook.isReservedInternally(registrationID)){
                registrationResBook.release(registrationID);
            }            
        }
        return registration;
    }

    @Override
    public boolean reserve(Object id) throws Exception {
         System.out.println("id-reg serimpl 111  "+id);
        
        boolean reserve = registrationResBook.reserve(id, this,false);
        System.out.println("id-reg serimpl 2222  "+reserve);
        
        return registrationResBook.reserve(id, this,false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return registrationResBook.release(id);
    }

    @Override
    public boolean deleteRegistration(RegistrationDTO registrationDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationDTO SearchRegistration(String regID) throws Exception {
         RegistrationDTO Searchregisteration = registrationBO.SearchRegistration(regID);
       
       // notifyAllObservers();
        return Searchregisteration;
    }

    @Override
    public void setAnnouncements(String announcements) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

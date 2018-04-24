/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.exampro.buisness.BOFactory;
import lk.ijse.exampro.buisness.custom.ExaminationBO;
import lk.ijse.exampro.dto.ExaminationDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.reservation.impl.ReservationImpl;
import lk.ijse.exampro.service.custom.ExaminationService;

/**
 *
 * @author Hafees
 */
public class ExaminationServiceImpl extends UnicastRemoteObject implements ExaminationService, Subject {
    private static String announcement;
    private ExaminationBO examinationBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<ExaminationService> examinationResBook = new ReservationImpl<>();

    public ExaminationServiceImpl() throws RemoteException {
        examinationBO = (ExaminationBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.EXAMINATION);
    }

    @Override
    public boolean addExamination(ExaminationDTO examination) throws Exception {
      
        boolean result = examinationBO.addExamination(examination);
        notifyAllObservers();
        return result;
    }
     @Override
    public List<ExaminationDTO> getAllExamination() throws Exception {
        return examinationBO.getAllExamination();
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
                    observer.update(announcement);
                } catch (Exception ex) {
                    Logger.getLogger(ExaminationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public boolean updateExamination(ExaminationDTO examination) throws Exception {
        boolean result = false;
        if (examinationResBook.reserve(examination.getEid(), this, true)) {
            result = examinationBO.updateExamination(examination);
           // notifyAllObservers();
            if (examinationResBook.isReservedInternally(examination.getEid())){
                examinationResBook.release(examination.getEid());
            }
        }
        return result;
    }

    @Override
    public boolean deleteExamination(String examinationID) throws Exception {
        boolean result = false;
        if (examinationResBook.reserve(examinationID, this, true)) {
            result = examinationBO.deleteExamination(examinationID);
           // notifyAllObservers();
            if (examinationResBook.isReservedInternally(examinationID)){
                examinationResBook.release(examinationID);
            }            
        }
        return result;
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return examinationResBook.reserve(id, this,false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return examinationResBook.release(id);
    }

    

    @Override
    public boolean deleteExamination(ExaminationDTO examination) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExaminationDTO SearchExamination(String eid) throws Exception {
        ExaminationDTO Searchexamination = examinationBO.SearchExamination(eid);
        System.out.println("   exam impl 111   rtrtr");
       
        //notifyAllObservers();
         System.out.println("   exam impl  222   rtrtr");
        return Searchexamination;
    }

    @Override
    public void setAnnouncements(String announcements) throws Exception {
       this.announcement=announcements;
         //System.out.println("setAnnouncements  srvice  "+announcements);
    }

   

   

}


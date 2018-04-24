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
import lk.ijse.exampro.buisness.custom.AdminBO;
import lk.ijse.exampro.dto.AdminDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.reservation.impl.ReservationImpl;
import lk.ijse.exampro.service.custom.AdminService;

/**
 *
 * @author Hafees
 */


public class AdminServiceImpl extends UnicastRemoteObject implements AdminService, Subject {

    private AdminBO AdminBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<AdminService> adminResBook = new ReservationImpl<>();

    public AdminServiceImpl() throws RemoteException {
        AdminBO = (AdminBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ADMIN);
    }

    @Override
    public boolean addAdmin(AdminDTO admin) throws Exception {
        boolean result = AdminBO.addAdmin(admin);
        notifyAllObservers();
        return result;
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
                    Logger.getLogger(AdminServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public boolean updateAdmin(AdminDTO admin) throws Exception {
        boolean result = false;
        if (adminResBook.reserve(admin.getUserId(), this, true)) {
            result = AdminBO.updateAdmin(admin);
            notifyAllObservers();
            if (adminResBook.isReservedInternally(admin.getUserId())){
                adminResBook.release(admin.getUserId());
            }
        }
        return result;
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return adminResBook.reserve(id, this,false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return adminResBook.release(id);
    }

    @Override
    public boolean deleteAdmin(AdminDTO adminID) throws Exception {
         boolean result = false;
        if (adminResBook.reserve(adminID, this, true)) {
            result = AdminBO.deleteAdmin(adminID);
            notifyAllObservers();
            if (adminResBook.isReservedInternally(adminID)){
                adminResBook.release(adminID);
            }            
        }
        return result;
    }

    

    @Override
    public List<AdminDTO> getAllAdmin() throws Exception {
        return AdminBO.getAllAdmin();
    }

    @Override
    public boolean deleteAdmin(String adminID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdminDTO SearchAdmin(String adminID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAnnouncements(String announcements) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

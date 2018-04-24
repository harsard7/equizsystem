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
import lk.ijse.exampro.buisness.custom.ResultBO;
import lk.ijse.exampro.dto.ResultDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.reservation.impl.ReservationImpl;
import lk.ijse.exampro.service.custom.ResultService;

/**
 *
 * @author Hafees
 */
public class ResultServiceImpl extends UnicastRemoteObject implements ResultService, Subject {

    private ResultBO resultBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<ResultService> resultResBook = new ReservationImpl<>();

    public ResultServiceImpl() throws RemoteException {
        resultBO = (ResultBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.RESULT);
    }

    @Override
    public boolean addResult(ResultDTO result) throws Exception {
        boolean resultS = resultBO.addResult(result);
        notifyAllObservers();
        return resultS;
    }
    
     @Override
    public List<ResultDTO> getAllResult() throws Exception {
        return resultBO.getAllResult();
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
                    Logger.getLogger(ResultServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public boolean updateResult(ResultDTO result) throws Exception {
        boolean resultS = false;
        if (resultResBook.reserve(result.getRsid(), this, true)) {
            resultS = resultBO.updateResult(result);
            notifyAllObservers();
            if (resultResBook.isReservedInternally(result.getRsid())){
                resultResBook.release(result.getRsid());
            }
        }
        return resultS;
    }

    @Override
    public boolean deleteResult(String resultID) throws Exception {
        boolean result = false;
        if (resultResBook.reserve(resultID, this, true)) {
            result = resultBO.deleteResult(resultID);
            notifyAllObservers();
            if (resultResBook.isReservedInternally(resultID)){
                resultResBook.release(resultID);
            }            
        }
        return result;
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return resultResBook.reserve(id, this,false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return resultResBook.release(id);
    }

   

    @Override
    public boolean deleteResult(ResultDTO result) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultDTO SearchResult(String resid) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAnnouncements(String announcements) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}

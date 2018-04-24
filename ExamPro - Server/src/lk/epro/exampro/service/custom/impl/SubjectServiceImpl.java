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
import lk.ijse.exampro.buisness.custom.SubjectsBO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.entity.Subjects;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.reservation.impl.ReservationImpl;
import lk.ijse.exampro.service.custom.SubjectsService;

/**
 *
 * @author Hafees
 */
public class SubjectServiceImpl extends UnicastRemoteObject implements SubjectsService, Subject {

    private SubjectsBO subjectsBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<SubjectsService> subjectResBook = new ReservationImpl<>();

    public SubjectServiceImpl() throws RemoteException {
        subjectsBO = (SubjectsBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SUBJECTS);
    }
     @Override
    public boolean addSubjects(SubjectsDTO subject) throws Exception {
         boolean result = subjectsBO.addSubjects(subject);
        notifyAllObservers();
        return result;
    }

  
    @Override
    public List<SubjectsDTO> getAllSubject() throws Exception {
         return subjectsBO.getAllSubjects();
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
                    Logger.getLogger(SubjectServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
     @Override
    public boolean updateSubjects(SubjectsDTO subject) throws Exception {
         boolean result = false;
        if (subjectResBook.reserve(subject.getSubid(), this, true)) {
            result = subjectsBO.updateSubjects(subject);
            notifyAllObservers();
            if (subjectResBook.isReservedInternally(subject.getSubid())){
                subjectResBook.release(subject.getSubid());
            }
        }
        return result;
    }
     @Override
    public boolean deleteSubjects(String subID) throws Exception {
         boolean result = false;
        if (subjectResBook.reserve(subID, this, true)) {
            result = subjectsBO.deleteSubjects(subID);
            notifyAllObservers();
            if (subjectResBook.isReservedInternally(subID)){
                subjectResBook.release(subID);
            }            
        }
        return result;
    }

   

   
    @Override
    public boolean reserve(Object id) throws Exception {
        return subjectResBook.reserve(id, this,false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return subjectResBook.release(id);
    }

   

   

    @Override
    public boolean deleteSubjects(SubjectsDTO subject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public SubjectsDTO SearchSubjects(String subID) throws Exception {
         
        SubjectsDTO SearchSubjects = subjectsBO.SearchSubjects(subID);
       
        notifyAllObservers();
        return SearchSubjects;
    }

    @Override
    public void setAnnouncements(String announcements) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}

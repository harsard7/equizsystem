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
import lk.ijse.exampro.buisness.custom.QuestionBO;
import lk.ijse.exampro.dto.QuestionDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.reservation.impl.ReservationImpl;
import lk.ijse.exampro.service.custom.QuestionService;

/**
 *
 * @author Hafees
 */
public class QuestionServiceImpl extends UnicastRemoteObject implements QuestionService, Subject {

    private QuestionBO questionBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();
    private static ReservationImpl<QuestionService> questionResBook = new ReservationImpl<>();

    public QuestionServiceImpl() throws RemoteException {
        questionBO = (QuestionBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.QUESTION);
    }

    @Override
    public boolean addQuestion(QuestionDTO question) throws Exception {
        boolean questions = questionBO.addQuestion(question);
        notifyAllObservers();
        return questions;
    }
    @Override
    public List<QuestionDTO> getAllQuestion() throws Exception {
          return questionBO.getAllQuestion();
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
                    Logger.getLogger(QuestionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    @Override
    public boolean updateQuestion(QuestionDTO questions) throws Exception {
        boolean question = false;
        if (questionResBook.reserve(questions.getQid(), this, true)) {
            question = questionBO.updateQuestion(questions);
            notifyAllObservers();
            if (questionResBook.isReservedInternally(questions.getQid())){
                questionResBook.release(questions.getQid());
            }
        }
        return question;
    }

    @Override
    public boolean deleteQuestion(String questionID) throws Exception {
        boolean question = false;
        if (questionResBook.reserve(questionID, this, true)) {
            question = questionBO.deleteQuestion(questionID);
            notifyAllObservers();
            if (questionResBook.isReservedInternally(questionID)){
                questionResBook.release(questionID);
            }            
        }
        return question;
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return questionResBook.reserve(id, this,false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return questionResBook.release(id);
    }

    

    @Override
    public boolean deleteQuestion(QuestionDTO question) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public QuestionDTO SearchQuestion(String qid) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QuestionDTO> getAllQuestionByid(String subid) throws Exception {
        return questionBO.getAllQuestionByid(subid);
    }

    @Override
    public void setAnnouncements(String announcements) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

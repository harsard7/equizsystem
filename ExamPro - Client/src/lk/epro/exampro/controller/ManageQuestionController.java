/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.controller;

import java.util.List;
import lk.ijse.exampro.dto.QuestionDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.proxy.ProxyHandler;
import lk.ijse.exampro.service.ServiceFactory;
import lk.ijse.exampro.service.custom.QuestionService;

/**
 *
 * @author Hafees
 */
public class ManageQuestionController {
    
    public static boolean addQuestion(QuestionDTO Question) throws Exception{
        QuestionService QuestionService = (QuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        return QuestionService.addQuestion(Question);
    }
    
    public static boolean updateQuestion(QuestionDTO Question) throws Exception{
        QuestionService QuestionService = (QuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        return QuestionService.updateQuestion(Question);
    }

    public static boolean deleteQuestion(String QuestionId) throws Exception{
        QuestionService QuestionService = (QuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        return QuestionService.deleteQuestion(QuestionId);
    }    
    
    public static List<QuestionDTO> getAllQuestions() throws Exception{
        QuestionService QuestionService = (QuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        return QuestionService.getAllQuestion();
    }
    
    public static void registerObserver(Observer observer) throws Exception{
        Subject QuestionService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        QuestionService.registerObserver(observer);
    }
    
    public static void unregisterObserver(Observer observer) throws Exception{
        Subject QuestionService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        QuestionService.unregisterObserver(observer);
    }
    
    public static boolean reserveQuestion(String QuestionId) throws Exception{
        QuestionService QuestionService = (QuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        return QuestionService.reserve(QuestionId);
    }
    
    public static boolean releaseQuestion(String QuestionId) throws Exception{
        QuestionService QuestionService = (QuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        return QuestionService.release(QuestionId);        
    }
    public static List<QuestionDTO> getAllQuestionsById(String sid) throws Exception{
        QuestionService QuestionService = (QuestionService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.QUESTION);
        return QuestionService.getAllQuestionByid(sid);
    }

    public static QuestionDTO searchQuestion(String qid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


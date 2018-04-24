/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.controller;

import java.util.List;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.proxy.ProxyHandler;
import lk.ijse.exampro.service.ServiceFactory;
import lk.ijse.exampro.service.custom.SubjectsService;

/**
 *
 * @author Hafees
 */
public class ManageSubjectsController {
    
    public static boolean addSubjects(SubjectsDTO Subjects) throws Exception{
        SubjectsService SubjectsService = (SubjectsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        return SubjectsService.addSubjects(Subjects);
    }
    
    public static boolean updateSubjects(SubjectsDTO Subjects) throws Exception{
        SubjectsService SubjectsService = (SubjectsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        return SubjectsService.updateSubjects(Subjects);
    }

    public static boolean deleteSubjects(String SubjectsId) throws Exception{
        SubjectsService SubjectsService = (SubjectsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        return SubjectsService.deleteSubjects(SubjectsId);
    }    
    
    public static List<SubjectsDTO> getAllSubjectss() throws Exception{
        SubjectsService SubjectsService = (SubjectsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        return SubjectsService.getAllSubject();
    }
    
    public static void registerObserver(Observer observer) throws Exception{
        Subject SubjectsService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        SubjectsService.registerObserver(observer);
    }
    
    public static void unregisterObserver(Observer observer) throws Exception{
        Subject SubjectsService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        SubjectsService.unregisterObserver(observer);
    }
    
    public static boolean reserveSubjects(String SubjectsId) throws Exception{
        SubjectsService SubjectsService = (SubjectsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        return SubjectsService.reserve(SubjectsId);
    }
    
    public static boolean releaseSubjects(String SubjectsId) throws Exception{
        SubjectsService SubjectsService = (SubjectsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        return SubjectsService.release(SubjectsId);        
    }
      public static SubjectsDTO searchSubjects(String sid) throws Exception{
        SubjectsService SubjectsService = (SubjectsService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.SUBJECTS);
        SubjectsDTO SearchSubjects = SubjectsService.SearchSubjects(sid);
        return SubjectsService.SearchSubjects(sid);
    }
    
}


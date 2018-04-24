/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.controller;

import java.util.List;
import lk.ijse.exampro.dto.ExaminationDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.proxy.ProxyHandler;
import lk.ijse.exampro.service.ServiceFactory;
import lk.ijse.exampro.service.custom.ExaminationService;
import lk.ijse.exampro.service.custom.SubjectsService;

/**
 *
 * @author Hafees
 */
public class ManageExaminationController {
    
    public static boolean addExamination(ExaminationDTO Examination) throws Exception{
        ExaminationService ExaminationService = (ExaminationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        return ExaminationService.addExamination(Examination);
    }
    
    public static boolean updateExamination(ExaminationDTO Examination) throws Exception{
        ExaminationService ExaminationService = (ExaminationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        return ExaminationService.updateExamination(Examination);
    }

    public static boolean deleteExamination(String ExaminationId) throws Exception{
        ExaminationService ExaminationService = (ExaminationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        return ExaminationService.deleteExamination(ExaminationId);
    }    
    
    public static List<ExaminationDTO> getAllExaminations() throws Exception{
        ExaminationService ExaminationService = (ExaminationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        return ExaminationService.getAllExamination();
    }
    
    public static void registerObserver(Observer observer) throws Exception{
        Subject ExaminationService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        ExaminationService.registerObserver(observer);
    }
    
    public static void unregisterObserver(Observer observer) throws Exception{
        Subject ExaminationService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        ExaminationService.unregisterObserver(observer);
    }
    
    public static boolean reserveExamination(String ExaminationId) throws Exception{
        ExaminationService ExaminationService = (ExaminationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        return ExaminationService.reserve(ExaminationId);
    }
    
    public static boolean releaseExamination(String ExaminationId) throws Exception{
        ExaminationService ExaminationService = (ExaminationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        return ExaminationService.release(ExaminationId);        
    }
     public static ExaminationDTO searchExamination(String eid) throws Exception{
        ExaminationService examinationService = (ExaminationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
        ExaminationDTO examinationDTO = examinationService.SearchExamination(eid);
        return examinationDTO;
    }
      public static void setAnnouncements(String announcements) throws Exception{
          System.out.println("setAnnouncements   "+announcements);
        Subject examinationService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.EXAMINATION);
                    examinationService.setAnnouncements(announcements);
       
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.exampro.service.ServiceFactory;
import lk.ijse.exampro.service.SuperService;
import lk.ijse.exampro.service.custom.AdminService;
import lk.ijse.exampro.service.custom.ExaminationService;
import lk.ijse.exampro.service.custom.QuestionService;
import lk.ijse.exampro.service.custom.RegistrationService;
import lk.ijse.exampro.service.custom.ResultService;
import lk.ijse.exampro.service.custom.SubjectsService;

/**
 *
 * @author ranjith-suranga
 */
public class ProxyHandler implements ServiceFactory{
    
    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private AdminService asdminService;
    private RegistrationService registrationService;
    private QuestionService questionService;
    private ResultService resultService;
    private ExaminationService examinationService;
    private SubjectsService subjectsService;
    //private ItemService itemService;
    
    private ProxyHandler(){
        try {
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:5050/Exampro");
            asdminService = (AdminService) serviceFactory.getService(ServiceTypes.ADMIN);
           registrationService = (RegistrationService) serviceFactory.getService(ServiceTypes.REGISTRATION);
           questionService = (QuestionService) serviceFactory.getService(ServiceTypes.QUESTION);
           resultService = (ResultService) serviceFactory.getService(ServiceTypes.RESULT);
           examinationService = (ExaminationService) serviceFactory.getService(ServiceTypes.EXAMINATION);
           subjectsService = (SubjectsService) serviceFactory.getService(ServiceTypes.SUBJECTS);
        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ProxyHandler getInstance(){
        if (proxyHandler == null){
            proxyHandler = new ProxyHandler();
        }
        return proxyHandler;
    }

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch(type){
            case ADMIN:
                return  asdminService;
            case SUBJECTS:
                return subjectsService;
             case REGISTRATION:
                return registrationService;
            case EXAMINATION:
                return examinationService;
            case RESULT:
                return resultService;
            case QUESTION:
                return questionService;
            default:
                return null;
        }
    }
 
}

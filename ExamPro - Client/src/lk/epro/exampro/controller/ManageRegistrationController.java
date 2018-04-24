/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.controller;

import java.util.List;
import lk.ijse.exampro.dto.RegistrationDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.proxy.ProxyHandler;
import lk.ijse.exampro.service.ServiceFactory;
import lk.ijse.exampro.service.custom.RegistrationService;
import lk.ijse.exampro.service.custom.SubjectsService;

/**
 *
 * @author Hafees
 */
public class ManageRegistrationController {
    
    public static boolean addRegistration(RegistrationDTO Registration) throws Exception{
        RegistrationService RegistrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return RegistrationService.addRegistration(Registration);
    }
    
    public static boolean updateRegistration(RegistrationDTO Registration) throws Exception{
        RegistrationService RegistrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return RegistrationService.updateRegistration(Registration);
    }

    public static boolean deleteRegistration(String RegistrationId) throws Exception{
        RegistrationService RegistrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return RegistrationService.deleteRegistration(RegistrationId);
    }    
    
    public static List<RegistrationDTO> getAllRegistrations() throws Exception{
        RegistrationService RegistrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return RegistrationService.getAllRegistration();
    }
    
    public static void registerObserver(Observer observer) throws Exception{
        Subject RegistrationService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        RegistrationService.registerObserver(observer);
    }
    
    public static void unregisterObserver(Observer observer) throws Exception{
        Subject RegistrationService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        RegistrationService.unregisterObserver(observer);
    }
    
    public static boolean reserveRegistration(String RegistrationId) throws Exception{
        RegistrationService RegistrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
       
        System.out.println("RegistrationId  contrller  "+RegistrationId);
        boolean reserve = RegistrationService.reserve(RegistrationId);
         System.out.println("RegistrationId  boolwean  "+reserve);
        return RegistrationService.reserve(RegistrationId);
    }
    
    public static boolean releaseRegistration(String RegistrationId) throws Exception{
        RegistrationService RegistrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        return RegistrationService.release(RegistrationId);        
    }

    public static RegistrationDTO searchRegistration(String rid) throws Exception {
        RegistrationService registrationService = (RegistrationService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        RegistrationDTO searchregistration = registrationService.SearchRegistration(rid);
        return registrationService.SearchRegistration(rid);
    }
    
    
}


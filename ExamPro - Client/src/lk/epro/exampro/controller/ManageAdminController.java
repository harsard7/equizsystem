/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.controller;

import java.util.List;
import lk.ijse.exampro.dto.AdminDTO;

import lk.ijse.exampro.observer.Observer;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.proxy.ProxyHandler;
import lk.ijse.exampro.service.ServiceFactory;
import lk.ijse.exampro.service.custom.AdminService;


/**
 *
 * @author Hafees
 */
public class ManageAdminController {
    
    public static boolean addAdmin(AdminDTO Admin) throws Exception{
        AdminService adminService = (AdminService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        return adminService.addAdmin(Admin);
    }
    
    public static boolean updateAdmin(AdminDTO Admin) throws Exception{
        AdminService AdminService = (AdminService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        return AdminService.updateAdmin(Admin);
    }

    public static boolean deleteAdmin(String AdminId) throws Exception{
        AdminService AdminService = (AdminService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        return AdminService.deleteAdmin(AdminId);
    }    
    
    public static List<AdminDTO> getAllAdmins() throws Exception{
        AdminService AdminService = (AdminService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        return AdminService.getAllAdmin();
    }
    
    public static void registerObserver(Observer observer) throws Exception{
        Subject AdminService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        AdminService.registerObserver(observer);
    }
    
    public static void unregisterObserver(Observer observer) throws Exception{
        Subject AdminService = (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        AdminService.unregisterObserver(observer);
    }
    
    public static boolean reserveAdmin(String AdminId) throws Exception{
        AdminService AdminService = (AdminService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        return AdminService.reserve(AdminId);
    }
    
    public static boolean releaseAdmin(String AdminId) throws Exception{
        AdminService AdminService = (AdminService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceTypes.ADMIN);
        return AdminService.release(AdminId);        
    }
    
}

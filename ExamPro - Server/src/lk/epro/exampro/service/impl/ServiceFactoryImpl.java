/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.exampro.service.ServiceFactory;
import lk.ijse.exampro.service.SuperService;
import lk.ijse.exampro.service.custom.impl.AdminServiceImpl;
import lk.ijse.exampro.service.custom.impl.ExaminationServiceImpl;
import lk.ijse.exampro.service.custom.impl.QuestionServiceImpl;
import lk.ijse.exampro.service.custom.impl.RegistrationServiceImpl;
import lk.ijse.exampro.service.custom.impl.ResultServiceImpl;
import lk.ijse.exampro.service.custom.impl.SubjectServiceImpl;

/**
 *
 * @author Hafees
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory{
    
    public static ServiceFactory serviceFactory;
    
    private ServiceFactoryImpl() throws RemoteException{
        
    }
    
    public static ServiceFactory getInstance() throws RemoteException{
        if (serviceFactory == null){
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch(type){
          
            case ADMIN:
                return new AdminServiceImpl();
            case SUBJECTS:
                return new SubjectServiceImpl();
             case REGISTRATION:
                return new RegistrationServiceImpl();
            case EXAMINATION:
                return new ExaminationServiceImpl();
            case RESULT:
                return new ResultServiceImpl();
            case QUESTION:
                return new QuestionServiceImpl();
            default:
                return null;
        }
    }
    
}

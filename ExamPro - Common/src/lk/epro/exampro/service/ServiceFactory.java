/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.service;

import java.rmi.Remote;

/**
 *
 * @author Hafees
 */
public interface ServiceFactory extends Remote{
    
    public enum ServiceTypes{
        ADMIN,SUBJECTS,REGISTRATION,EXAMINATION,RESULT,QUESTION
    }
    
    public SuperService getService(ServiceTypes type) throws Exception;
    
}

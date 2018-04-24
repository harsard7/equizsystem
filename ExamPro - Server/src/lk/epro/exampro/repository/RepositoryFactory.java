/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.repository;

import lk.ijse.exampro.repository.custom.impl.AdminRepositoryImpl;
import lk.ijse.exampro.repository.custom.impl.ExaminationRepositoryImpl;
import lk.ijse.exampro.repository.custom.impl.QuestionRepositoryImpl;
import lk.ijse.exampro.repository.custom.impl.RegistrationRepositoryImpl;
import lk.ijse.exampro.repository.custom.impl.ResultRepositoryImpl;
import lk.ijse.exampro.repository.custom.impl.SubjectsRepositoryImpl;


/**
 *
 * @author Hafees
 */
public class RepositoryFactory {
    
    public enum RepositoryTypes{
      ADMIN,SUBJECTS,REGISTRATION,EXAMINATION,RESULT,QUESTION
    }
    
    public static RepositoryFactory repositoryFactory;
    
    private RepositoryFactory(){
        
    }
    
    public static RepositoryFactory getInstance(){
        if (repositoryFactory == null){
            repositoryFactory = new RepositoryFactory();
        }
        return repositoryFactory;
    }
    
    public SuperRepository getRepository(RepositoryTypes type){
        switch(type){
          
            case ADMIN:
                return new AdminRepositoryImpl();
            case SUBJECTS:
                return new SubjectsRepositoryImpl();
             case REGISTRATION:
                return new RegistrationRepositoryImpl();
            case EXAMINATION:
                return new ExaminationRepositoryImpl();
            case RESULT:
                return new ResultRepositoryImpl();
            case QUESTION:
                return new QuestionRepositoryImpl();
            default:
                return null;
        }
    }
    
}

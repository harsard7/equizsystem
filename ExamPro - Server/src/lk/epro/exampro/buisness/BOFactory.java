/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness;

import lk.ijse.exampro.buisness.custom.impl.AdminBOImpl;
import lk.ijse.exampro.buisness.custom.impl.ExaminationBOImpl;
import lk.ijse.exampro.buisness.custom.impl.QuestionBOImpl;
import lk.ijse.exampro.buisness.custom.impl.RegistrationBOImpl;
import lk.ijse.exampro.buisness.custom.impl.ResultBOImpl;
import lk.ijse.exampro.buisness.custom.impl.SubjectsBOImpl;


/**
 *
 * @author Hafees
 */
public class BOFactory {
    
    public enum BOTypes{
        ADMIN,SUBJECTS,REGISTRATION,EXAMINATION,RESULT,QUESTION
    }
    
    private static BOFactory boFactory;
    
    private BOFactory(){
        
    }
    
    public static BOFactory getInstance(){
        if (boFactory == null){
            boFactory = new BOFactory();
        }
        return boFactory;
    }
    
    public SuperBO getBO(BOTypes type){
        switch(type){
          
            case ADMIN:
                return new AdminBOImpl();
            case SUBJECTS:
                return new SubjectsBOImpl();
             case REGISTRATION:
                return new RegistrationBOImpl();
            case EXAMINATION:
                return new ExaminationBOImpl();
            case RESULT:
                return new ResultBOImpl();
            case QUESTION:
                return new QuestionBOImpl();
            default:
                return null;
        }
    }
}

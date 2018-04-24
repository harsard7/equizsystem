/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.service.custom;

import java.util.List;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.service.SuperService;

/**
 *
  * @author Hafees
 */
public interface SubjectsService extends SuperService{
    
    public boolean addSubjects(SubjectsDTO subject)throws Exception;
    
    public boolean updateSubjects(SubjectsDTO subject) throws Exception;
    
    public boolean deleteSubjects(SubjectsDTO subject)throws Exception;
    
    public boolean deleteSubjects(String subID)throws Exception;
    
    public SubjectsDTO SearchSubjects(String subID) throws Exception;
    
    public List<SubjectsDTO> getAllSubject() throws Exception;
    
  
    
}

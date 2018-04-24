/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom;

import java.util.List;
import lk.ijse.exampro.buisness.SuperBO;
import lk.ijse.exampro.dto.SubjectsDTO;

/**
 *
 * @author Hafees
 */
public interface SubjectsBO extends SuperBO{
    
    public boolean addSubjects(SubjectsDTO subject)throws Exception;
    
    public boolean updateSubjects(SubjectsDTO subject) throws Exception;
    
    public boolean deleteSubjects(SubjectsDTO subject)throws Exception;
    
    public boolean deleteSubjects(String subID) throws Exception;
    
    public SubjectsDTO SearchSubjects(String subID) throws Exception;
    
    public List<SubjectsDTO> getAllSubjects() throws Exception;
    
}

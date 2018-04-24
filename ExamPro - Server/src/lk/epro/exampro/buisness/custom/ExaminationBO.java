/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom;

import java.util.List;
import lk.ijse.exampro.buisness.SuperBO;
import lk.ijse.exampro.dto.ExaminationDTO;

/**
 *
 * @author Hafees
 */
public interface ExaminationBO extends SuperBO{
    
    public boolean addExamination(ExaminationDTO examination)throws Exception;
    
    public boolean updateExamination(ExaminationDTO examination) throws Exception;
    
    public boolean deleteExamination(ExaminationDTO examination)throws Exception;
    
    public boolean deleteExamination(String eid) throws Exception;
    
    public ExaminationDTO SearchExamination(String eid) throws Exception;
    
    public List<ExaminationDTO> getAllExamination() throws Exception;
            
}

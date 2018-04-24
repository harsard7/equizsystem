/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom;

import java.util.List;
import lk.ijse.exampro.buisness.SuperBO;
import lk.ijse.exampro.dto.QuestionDTO;

/**
 *
 * @author Hafees
 */
public interface QuestionBO extends SuperBO{
    
    public boolean addQuestion(QuestionDTO question)throws Exception;
    
    public boolean updateQuestion(QuestionDTO question) throws Exception;
    
    public boolean deleteQuestion(QuestionDTO question)throws Exception;
    
    public boolean deleteQuestion(String qid) throws Exception;
    
    public QuestionDTO SearchQuestion(String qid) throws Exception;
    
    public List<QuestionDTO> getAllQuestion() throws Exception;
    
    public List<QuestionDTO> getAllQuestionByid(String subid) throws Exception;
    
    public List<QuestionDTO> getAllQuestionByname(String name,String id) throws Exception;
            
}


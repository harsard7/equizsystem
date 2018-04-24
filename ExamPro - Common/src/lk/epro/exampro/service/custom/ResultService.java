/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.service.custom;

import java.util.List;
import lk.ijse.exampro.dto.ResultDTO;
import lk.ijse.exampro.service.SuperService;

/**
 *
 * @author Hafees
 */
public interface ResultService extends SuperService{
    
    public boolean addResult(ResultDTO result)throws Exception;
    
    public boolean updateResult(ResultDTO result) throws Exception;
    
    public boolean deleteResult(ResultDTO result)throws Exception;
 
   public boolean deleteResult(String resid)throws Exception;
    
    public ResultDTO SearchResult(String resid) throws Exception;
    
    public List<ResultDTO> getAllResult() throws Exception;
            
}

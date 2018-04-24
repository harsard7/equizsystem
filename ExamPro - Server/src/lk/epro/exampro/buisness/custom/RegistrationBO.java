/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom;

import java.util.List;
import lk.ijse.exampro.buisness.SuperBO;
import lk.ijse.exampro.dto.RegistrationDTO;
import lk.ijse.exampro.service.SuperService;

/**
 *
 * @author Hafees
 */
public interface RegistrationBO extends SuperBO{
    
    public boolean addRegistration(RegistrationDTO registrationDTO)throws Exception;
    
    public boolean updateRegistration(RegistrationDTO registrationDTO) throws Exception;
    
    public boolean deleteRegistration(RegistrationDTO registrationDTO)throws Exception;
    
    public boolean deleteRegistration(String regID) throws Exception;
    
    public RegistrationDTO SearchRegistration(String regID) throws Exception;
    
    
    public List<RegistrationDTO> getAllRegistration() throws Exception;
    
}

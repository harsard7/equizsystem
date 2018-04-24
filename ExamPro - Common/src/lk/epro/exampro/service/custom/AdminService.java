/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.service.custom;

import java.util.List;
import lk.ijse.exampro.dto.AdminDTO;
import lk.ijse.exampro.service.SuperService;

/**
 *
 * @author Hafees
 */
public interface AdminService extends SuperService{
    
    public boolean addAdmin(AdminDTO admin)throws Exception;
    
    public boolean updateAdmin(AdminDTO admin) throws Exception;
    
    public boolean deleteAdmin(String adminID)throws Exception;
    
    public boolean deleteAdmin(AdminDTO admin)throws Exception;
    
    public AdminDTO SearchAdmin(String adminID) throws Exception;
    
    public List<AdminDTO> getAllAdmin() throws Exception;
            
}

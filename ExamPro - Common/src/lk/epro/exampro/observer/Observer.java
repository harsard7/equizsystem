/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.observer;

import java.rmi.Remote;
import java.util.Set;

/**
 *
 * @author Hafees
 */
public interface Observer extends Remote{
    
    public void update(String announcemts)throws Exception;
    
}

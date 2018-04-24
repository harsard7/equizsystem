/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.repository.custom.impl;

import lk.ijse.exampro.entity.Admin;
import lk.ijse.exampro.repository.SuperRepositoryImpl;
import lk.ijse.exampro.repository.custom.AdminRepository;

/**
 *
 * @author Hafees
 */
public class AdminRepositoryImpl extends SuperRepositoryImpl<Admin, String> implements AdminRepository {

    public AdminRepositoryImpl() {
        System.out.println("Admin Repository IMPL : " + this);
    }

    
}

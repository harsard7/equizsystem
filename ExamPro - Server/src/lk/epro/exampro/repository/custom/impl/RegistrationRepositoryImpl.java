/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.repository.custom.impl;

import lk.ijse.exampro.entity.Registration;
import lk.ijse.exampro.repository.SuperRepositoryImpl;
import lk.ijse.exampro.repository.custom.RegistrationRepository;

/**
 *
 * @author Hafees
 */
public class RegistrationRepositoryImpl extends SuperRepositoryImpl<Registration, String> implements RegistrationRepository {

    public RegistrationRepositoryImpl() {
        System.out.println("Registration Repository IMPL : " + this);
    }

    
}

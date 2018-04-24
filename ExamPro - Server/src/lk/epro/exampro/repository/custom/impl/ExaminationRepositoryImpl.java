/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.repository.custom.impl;

import lk.ijse.exampro.entity.Admin;
import lk.ijse.exampro.entity.Examination;
import lk.ijse.exampro.repository.SuperRepositoryImpl;
import lk.ijse.exampro.repository.custom.AdminRepository;
import lk.ijse.exampro.repository.custom.ExaminationRepository;

/**
 *
 * @author Hafees
 */
public class ExaminationRepositoryImpl extends SuperRepositoryImpl<Examination, String> implements ExaminationRepository {

    public ExaminationRepositoryImpl() {
        System.out.println("Examination Repository IMPL : " + this);
    }

    
}

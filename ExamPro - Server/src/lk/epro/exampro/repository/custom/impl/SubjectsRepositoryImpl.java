/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.repository.custom.impl;

import lk.ijse.exampro.entity.Subjects;
import lk.ijse.exampro.repository.SuperRepositoryImpl;
import lk.ijse.exampro.repository.custom.SubjectsRepository;

/**
 *
 * @author Hafees
 */
public class SubjectsRepositoryImpl extends SuperRepositoryImpl<Subjects, String> implements SubjectsRepository {

    public SubjectsRepositoryImpl() {
        System.out.println("Subject Repository IMPL : " + this);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.repository.custom.impl;

import lk.ijse.exampro.entity.Result;
import lk.ijse.exampro.repository.SuperRepositoryImpl;
import lk.ijse.exampro.repository.custom.ResultRepository;

/**
 *
 * @author Hafees
 */
public class ResultRepositoryImpl extends SuperRepositoryImpl<Result, String> implements ResultRepository {

    public ResultRepositoryImpl() {
        System.out.println("Result Repository Impl : " + this);
    }

    
}

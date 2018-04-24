/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.repository.custom.impl;

import lk.ijse.exampro.entity.Question;
import lk.ijse.exampro.repository.SuperRepositoryImpl;
import lk.ijse.exampro.repository.custom.QuestionRepository;

/**
 *
 * @author Hafees
 */
public class QuestionRepositoryImpl extends SuperRepositoryImpl<Question, String> implements QuestionRepository {

    public QuestionRepositoryImpl() {
        System.out.println("Question Repository IMPL : " + this);
    }

    
}

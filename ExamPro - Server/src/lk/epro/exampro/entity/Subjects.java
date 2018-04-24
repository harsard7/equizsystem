/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Hafees
 */
@Entity
public class Subjects {
    
     @Id
@GeneratedValue(generator="increment")
@GenericGenerator(name="increment", strategy = "increment")
    private int subid;
    private String subjectname;

    public Subjects() {
    }

    public Subjects(int subid, String subjectname) {
        this.subid = subid;
        this.subjectname = subjectname;
    }

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    @Override
    public String toString() {
        return "Subject{" + "subid=" + subid + ", subjectname=" + subjectname + '}';
    }
    
}

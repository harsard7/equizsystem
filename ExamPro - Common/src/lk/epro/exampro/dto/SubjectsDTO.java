/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.dto;

/**
 *
 * @author ranjith-suranga
 */

public class SubjectsDTO extends SuperDTO{
    
  
    private int subid;
    private String subjectname;

    public SubjectsDTO() {
    }

    public SubjectsDTO(int subid, String subjectname) {
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

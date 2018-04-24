/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.dto;




/**
 *
 * @author Hafees
 */
public class ExaminationDTO extends SuperDTO {
   
    private int eid;
    private SubjectsDTO subjectsDTO;
    private String date;

    public ExaminationDTO(int eid, SubjectsDTO subjectsDTO, String date) {
        this.eid = eid;
        this.subjectsDTO = subjectsDTO;
        this.date = date;
    }

    public ExaminationDTO() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public SubjectsDTO getSubjectsDTO() {
        return subjectsDTO;
    }

    public void setSubjectsDTO(SubjectsDTO subjectsDTO) {
        this.subjectsDTO = subjectsDTO;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExaminationDTO{" + "eid=" + eid + ", subjectsDTO=" + subjectsDTO + ", date=" + date + '}';
    }

  
   
    
}

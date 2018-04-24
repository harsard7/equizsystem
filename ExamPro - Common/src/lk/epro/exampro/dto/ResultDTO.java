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

public class ResultDTO extends SuperDTO{
    
    
    private int rsid;
    private ExaminationDTO examination;
    private RegistrationDTO registration;
    private double percentage;
    private String status;

    public ResultDTO(int rsid, ExaminationDTO examination, RegistrationDTO registration, double percentage, String status) {
        this.rsid = rsid;
        this.examination = examination;
        this.registration = registration;
        this.percentage = percentage;
        this.status = status;
    }

    public ResultDTO() {
    }

    public int getRsid() {
        return rsid;
    }

    public void setRsid(int rsid) {
        this.rsid = rsid;
    }

    public ExaminationDTO getExamination() {
        return examination;
    }

    public void setExamination(ExaminationDTO examination) {
        this.examination = examination;
    }

    public RegistrationDTO getRegistration() {
        return registration;
    }

    public void setRegistration(RegistrationDTO registration) {
        this.registration = registration;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResultDTO{" + "rsid=" + rsid + ", examination=" + examination + ", registration=" + registration + ", percentage=" + percentage + ", status=" + status + '}';
    }

   
}

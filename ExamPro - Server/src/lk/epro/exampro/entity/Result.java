/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Hafees
 */
@Entity 
public class Result {
    
     @Id
@GeneratedValue(generator="increment")
@GenericGenerator(name="increment", strategy = "increment")
    private int rsid;
    //@ManyToOne(cascade = CascadeType.ALL)
     @ManyToOne(cascade = CascadeType.DETACH)
    private Examination examination;
    
   // @ManyToOne(cascade = CascadeType.ALL)
     @ManyToOne(cascade = CascadeType.DETACH)
    private Registration registration;
   
    private double percentage;
    private String status;

    public Result(int rsid, Examination examination, Registration registration, double percentage, String status) {
        this.rsid = rsid;
        this.examination = examination;
        this.registration = registration;
        this.percentage = percentage;
        this.status = status;
    }

    public Result() {
    }

    public int getRsid() {
        return rsid;
    }

    public void setRsid(int rsid) {
        this.rsid = rsid;
    }

    public Examination getExamination() {
        return examination;
    }

    public void setExamination(Examination examination) {
        this.examination = examination;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
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
        return "Result{" + "rsid=" + rsid + ", examination=" + examination + ", registration=" + registration + ", percentage=" + percentage + ", status=" + status + '}';
    }
    

}

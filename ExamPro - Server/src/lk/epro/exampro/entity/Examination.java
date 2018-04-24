/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.entity;


import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Hafees
 */
@Entity
public class Examination {
   

     @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
     @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private int eid;
   //@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.LAZY)
   // @ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.DETACH)
    private Subjects subjects;
    private String date;

    public Examination(int eid, Subjects subjects, String date) {
        this.eid = eid;
        this.subjects = subjects;
        this.date = date;
    }

    public Examination() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects Subjects) {
        this.subjects = Subjects;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Examination{" + "eid=" + eid + ", subjects=" + subjects + ", date=" + date + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.entity;


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
public class Question {
    @Id
@GeneratedValue(generator="increment")
@GenericGenerator(name="increment", strategy = "increment")
    private int qid;
    @ManyToOne(cascade = CascadeType.DETACH)
   // @OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.LAZY)
    //@ManyToOne(cascade = CascadeType.ALL)
    private Subjects subjects;
    private String Question;
    private String option1;
    private String option2;
    private String option3;
    private String answers;

    public Question(int qid, Subjects subject, String Question, String option1, String option2, String option3, String answers) {
        this.qid = qid;
        this.subjects = subjects;
        this.Question = Question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.answers = answers;
    }

    public Question() {
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public Subjects getSubject() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" + "qid=" + qid + ", Subjects=" + subjects + ", Question=" + Question + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", answers=" + answers + '}';
    }
   
    
    
    
}

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

public class QuestionDTO extends SuperDTO {
   
    private int qid;
    private SubjectsDTO subjectsDTO;
    private String Question;
    private String option1;
    private String option2;
    private String option3;
    private String answers;

    public QuestionDTO(int qid, SubjectsDTO subjectsDTO, String Question, String option1, String option2, String option3, String answers) {
        this.qid = qid;
        this.subjectsDTO = subjectsDTO;
        this.Question = Question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.answers = answers;
    }

    public QuestionDTO() {
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public SubjectsDTO getSubjectsDTO() {
        return subjectsDTO;
    }

    public void setSubjectsDTO(SubjectsDTO subjectsDTO) {
        this.subjectsDTO = subjectsDTO;
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
        return "QuestionDTO{" + "qid=" + qid + ", subjectsDTO=" + subjectsDTO + ", Question=" + Question + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", answers=" + answers + '}';
    }

   
}

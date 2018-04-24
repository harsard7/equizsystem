/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.exampro.buisness.custom.QuestionBO;
import lk.ijse.exampro.dto.QuestionDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.entity.Question;
import lk.ijse.exampro.entity.Subjects;
import lk.ijse.exampro.repository.RepositoryFactory;
import lk.ijse.exampro.repository.custom.QuestionRepository;
import lk.ijse.exampro.resource.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

/**
 *
 * @author Hafees
 */
public class QuestionBOImpl implements QuestionBO {
    private Session session;

    private QuestionRepository questionRepository;

    public QuestionBOImpl() {
        this.questionRepository = (QuestionRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.QUESTION);
    }

    @Override
    public boolean addQuestion(QuestionDTO question) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            questionRepository.setSession(session);
              Question c = new Question();
              c.setQid(question.getQid());
              Subjects s=new Subjects();
              s.setSubid(question.getSubjectsDTO().getSubid());
              s.setSubjectname(question.getSubjectsDTO().getSubjectname());
              c.setSubjects(s);
              c.setQuestion(question.getQuestion());
              c.setOption1(question.getOption1());
              c.setOption2(question.getOption2());
              c.setOption3(question.getOption3());
              c.setAnswers(question.getAnswers());
//            Question c = new Question(
//                    question.getQid(),
//                    question.get,
//                    question.getAddress(),
//                    question.getSalary());
            boolean questions = questionRepository.save(c);
            session.getTransaction().commit();
            return questions;
        }
    }
    
     @Override
    public List<QuestionDTO> getAllQuestion() throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            questionRepository.setSession(session);
            session.beginTransaction();
            List<Question> questions = questionRepository.findAll();
                System.out.println(" bo impl before "+questions);
            session.getTransaction().commit();
            if (questions != null) {

                List<QuestionDTO> alQuestions = new ArrayList<>();

                for (Question question : questions) {
                    QuestionDTO dto=new QuestionDTO();
                    dto.setQid(question.getQid());
                     SubjectsDTO sdto=new SubjectsDTO();
                     sdto.setSubid(question.getSubject().getSubid());
                     sdto.setSubjectname(question.getSubject().getSubjectname());
                     dto.setSubjectsDTO(sdto);
                     dto.setQuestion(question.getQuestion());
                     dto.setOption1(question.getOption1());
                     dto.setOption2(question.getOption2());
                     dto.setOption3(question.getOption3());
                     dto.setAnswers(question.getAnswers());
                    
//                    QuestionDTO dto = new QuestionDTO(question.getId(),
//                            question.getName(),
//                            question.getAddress(),
//                            question.getSalary());
                    alQuestions.add(dto);
                }
                System.out.println(" bo impl "+alQuestions);
                return alQuestions;

            } else {

                return null;
            }
        }
    }

   

    @Override
    public boolean updateQuestion(QuestionDTO question) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            questionRepository.setSession(session);
            session.beginTransaction();
           Question c = new Question();
              c.setQid(question.getQid());
              Subjects s=new Subjects();
              s.setSubid(question.getSubjectsDTO().getSubid());
              s.setSubjectname(question.getSubjectsDTO().getSubjectname());
              c.setSubjects(s);
              c.setQuestion(question.getQuestion());
              c.setOption1(question.getOption1());
              c.setOption2(question.getOption2());
              c.setOption3(question.getOption3());
              c.setAnswers(question.getAnswers());              
            questionRepository.update(c);
            
            session.getTransaction().commit();
             
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteQuestion(String id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            questionRepository.setSession(session);
            session.beginTransaction();
            Question question = questionRepository.findById(id);
            if (question != null) {
                questionRepository.delete(question);
                session.getTransaction().commit();
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

   

    @Override
    public boolean deleteQuestion(QuestionDTO question) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public QuestionDTO SearchQuestion(String qid) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QuestionDTO> getAllQuestionByid(String subid) throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            questionRepository.setSession(session);
            session.beginTransaction();
            List<Question> questions = questionRepository.findAllById(subid);
            session.getTransaction().commit();
            if (questions != null) {

                List<QuestionDTO> alQuestions = new ArrayList<>();

                for (Question question : questions) {
                    QuestionDTO dto=new QuestionDTO();
                    dto.setQid(question.getQid());
                     SubjectsDTO sdto=new SubjectsDTO();
                     sdto.setSubid(question.getSubject().getSubid());
                     sdto.setSubjectname(question.getSubject().getSubjectname());
                     dto.setQuestion(question.getQuestion());
                     dto.setOption1(question.getOption1());
                     dto.setOption2(question.getOption2());
                     dto.setOption3(question.getOption3());
                     dto.setAnswers(question.getAnswers());
                    
//                    QuestionDTO dto = new QuestionDTO(question.getId(),
//                            question.getName(),
//                            question.getAddress(),
//                            question.getSalary());
                    alQuestions.add(dto);
                }

                return alQuestions;

            } else {

                return null;
            }
        }
    }

    @Override
   
        
    public List<QuestionDTO> getAllQuestionByname(String in, String out) throws Exception {
//        @SuppressWarnings("deprecation")
//        NativeQuery sqlQuery=session.createSQLQuery ("SELECT qId from question where vehicleId not in(Select vehicleId from Reservation Where (startDate<='" + in + "' && endDate>='" + in + "') || (startDate<='" + out + "' && endDate>='" + out + "') || (startDate>='" + in + "' && endDate<='" + out + "') || (endDate='" + in + "' && endDate='" + out + "') || (startDate='" + out + "' && startDate='" + out + "'))");
//        @SuppressWarnings("unchecked")
//        List<Object[]> list = sqlQuery.list();
//        List<QuestionDTO>l=new ArrayList<>();
//        for (Object row : list) {
//            QuestionDTO reservation=new QuestionDTO();
//            reservation.setReseveId(Integer.parseInt(row[0].toString()));
//            reservation.setStartDate(row[1].toString());
//            reservation.setEndDate(row[2].toString());
//            reservation.setPrice(Double.parseDouble(row[3].toString()));
//            
//            Customer customer=new Customer();
//            customer.setCustId(Integer.parseInt(row[4].toString()));
//            reservation.setCustomer(customer);
            
//            QuestionDTO question=new QuestionDTO();
//            question.setVehicleId(Integer.parseInt(row.toString()));
//            reservation.setVehicle(vehicle);
//            
//            l.add(reservation);
//        }
//        return l;
           return null;
    }
}
    
        
        
        
        
        
        
        
        
        
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.exampro.buisness.custom.SubjectsBO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.entity.Subjects;
import lk.ijse.exampro.observer.Subject;
import lk.ijse.exampro.repository.RepositoryFactory;
import lk.ijse.exampro.repository.custom.SubjectsRepository;
import lk.ijse.exampro.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Hafees
 */
public class SubjectsBOImpl implements SubjectsBO {

    private SubjectsRepository subjectRepository;

    public SubjectsBOImpl() {
        this.subjectRepository = (SubjectsRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.SUBJECTS);
    }

    
  
    public List<SubjectsDTO> getAllSubjects() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            subjectRepository.setSession(session);
            session.beginTransaction();
            List<Subjects> subjects = subjectRepository.findAll();
            session.getTransaction().commit();
            if (subjects != null) {

                List<SubjectsDTO> alSubjects = new ArrayList<>();

                for (Subjects subject : subjects) {
                    SubjectsDTO dto = new SubjectsDTO(
                            subject.getSubid(),
                    subject.getSubjectname());
                    alSubjects.add(dto);
                }

                return alSubjects;

            } else {

                return null;
            }
        }
    }
     @Override
    public boolean updateSubjects(SubjectsDTO subject) throws Exception {
       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            subjectRepository.setSession(session);
            session.beginTransaction();
            Subjects c = new Subjects(
                     subject.getSubid(),
                    subject.getSubjectname());
            subjectRepository.update(c);
            session.getTransaction().commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        } 
    }
     @Override
    public boolean deleteSubjects(String subID) throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            subjectRepository.setSession(session);
            session.beginTransaction();
            Subjects subject = subjectRepository.findById(subID);
            if (subject != null) {
                subjectRepository.delete(subject);
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
    public boolean addSubjects(SubjectsDTO subject) throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            subjectRepository.setSession(session);
            Subjects c = new Subjects(
                    subject.getSubid(),
                    subject.getSubjectname());
                    
            boolean result = subjectRepository.save(c);
            session.getTransaction().commit();
            return result;
        }
    }

   

    @Override
    public boolean deleteSubjects(SubjectsDTO subject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SubjectsDTO SearchSubjects(String subID) throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            subjectRepository.setSession(session);
           session.beginTransaction();
           Subjects subjects = subjectRepository.findById(subID);
           session.getTransaction().commit();
            if (subjects != null) {                
                    SubjectsDTO dto = new SubjectsDTO(
                            subjects.getSubid(),
                    subjects.getSubjectname());
 
                return dto;

            } else {

                return null;
            }
        }
    }

   
}

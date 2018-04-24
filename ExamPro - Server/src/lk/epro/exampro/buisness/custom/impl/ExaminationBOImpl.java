/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.exampro.buisness.custom.ExaminationBO;
import lk.ijse.exampro.dto.ExaminationDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.entity.Examination;
import lk.ijse.exampro.entity.Subjects;
import lk.ijse.exampro.repository.RepositoryFactory;
import lk.ijse.exampro.repository.custom.ExaminationRepository;
import lk.ijse.exampro.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Hafees
 */
public class ExaminationBOImpl implements ExaminationBO {

    private ExaminationRepository examinationRepository;

    public ExaminationBOImpl() {
        this.examinationRepository = (ExaminationRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.EXAMINATION);
    }

    @Override
    public boolean addExamination(ExaminationDTO examination) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            examinationRepository.setSession(session);
        
         Examination c = new Examination();
         c.setEid(examination.getEid());
         
          Subjects s=new Subjects();
           s.setSubid(examination.getSubjectsDTO().getSubid());
           s.setSubjectname(examination.getSubjectsDTO().getSubjectname());
           
         c.setSubjects(s);
         c.setDate(examination.getDate());
            
//            Examination c = new Examination(
//                    examination.getEid(),
//                    examination.getSubjectsDTO(s),
//                    examination.getDate());
            boolean examinations = examinationRepository.save(c);
            session.getTransaction().commit();
            return examinations;
        }
    }
    @Override
    public List<ExaminationDTO> getAllExamination() throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            examinationRepository.setSession(session);
            session.beginTransaction();
            List<Examination> examinations = examinationRepository.findAll();
            session.getTransaction().commit();
            if (examinations != null) {

                List<ExaminationDTO> alExaminations = new ArrayList<>();

                for (Examination examination : examinations) {
                    
                     ExaminationDTO dto = new ExaminationDTO();
         dto.setEid(examination.getEid());
          SubjectsDTO s=new SubjectsDTO();
           s.setSubid(examination.getSubjects().getSubid());
           s.setSubjectname(examination.getSubjects().getSubjectname());
        dto.setSubjectsDTO(s);
        dto.setDate(examination.getDate());
//                    ExaminationDTO dto = new ExaminationDTO(examination.getId(),
//                            examination.getName(),
//                            examination.getAddress(),
//                            examination.getSalary());
                    alExaminations.add(dto);
                }

                return alExaminations;

            } else {

                return null;
            }
        }
    }

    

    @Override
    public boolean updateExamination(ExaminationDTO examination) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            examinationRepository.setSession(session);
            session.beginTransaction();
             Examination c = new Examination();
         c.setEid(examination.getEid());
          Subjects s=new Subjects();
           s.setSubid(examination.getSubjectsDTO().getSubid());
           s.setSubjectname(examination.getSubjectsDTO().getSubjectname());
         c.setSubjects(s);
           
            examinationRepository.update(c);
            session.getTransaction().commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteExamination(String id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            examinationRepository.setSession(session);
            session.beginTransaction();
            Examination examination = examinationRepository.findById(id);
            if (examination != null) {
                examinationRepository.delete(examination);
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
    public boolean deleteExamination(ExaminationDTO examination) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExaminationDTO SearchExamination(String eid) throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            examinationRepository.setSession(session);
           session.beginTransaction();
           Examination examination = examinationRepository.findById(eid);
           session.getTransaction().commit();
            if (examination != null) {                
                    ExaminationDTO dto = new ExaminationDTO();
                    dto.setEid(examination.getEid());
                    SubjectsDTO s=new SubjectsDTO();
                    s.setSubid(examination.getSubjects().getSubid());
                    s.setSubjectname(examination.getSubjects().getSubjectname());
                    dto.setSubjectsDTO(s);
                    dto.setDate(examination.getDate());
 
                return dto;

            } else {

                return null;
            }
        }
    }

    

}

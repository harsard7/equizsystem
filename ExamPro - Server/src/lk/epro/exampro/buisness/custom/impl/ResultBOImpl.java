/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.exampro.buisness.custom.ResultBO;
import lk.ijse.exampro.dto.ExaminationDTO;
import lk.ijse.exampro.dto.RegistrationDTO;
import lk.ijse.exampro.dto.ResultDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.entity.Examination;
import lk.ijse.exampro.entity.Registration;
import lk.ijse.exampro.entity.Result;
import lk.ijse.exampro.entity.Subjects;
import lk.ijse.exampro.repository.RepositoryFactory;
import lk.ijse.exampro.repository.custom.ResultRepository;
import lk.ijse.exampro.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Hafees
 */
public class ResultBOImpl implements ResultBO {

    private ResultRepository resultRepository;

    public ResultBOImpl() {
        this.resultRepository = (ResultRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.RESULT);
    }

    @Override
    public boolean addResult(ResultDTO result) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            resultRepository.setSession(session);
            
           Result r=new Result();
           r.setRsid(result.getRsid());
           
            Examination e=new Examination();
            e.setEid(result.getExamination().getEid());
           
            
            Subjects s=new Subjects();
            s.setSubid(result.getExamination().getSubjectsDTO().getSubid());
            s.setSubjectname(result.getExamination().getSubjectsDTO().getSubjectname());
            e.setSubjects(s);
            e.setDate(result.getExamination().getDate());
            r.setExamination(e);
            Registration rg=new Registration();
            rg.setRegid(result.getRegistration().getRegid());
            rg.setFname(result.getRegistration().getFname());
            rg.setLname(result.getRegistration().getLname());
            rg.setPhone(result.getRegistration().getPhone());
            rg.setDob(result.getRegistration().getDob());
            rg.setEmail(result.getRegistration().getEmail());
            rg.setUsername(result.getRegistration().getUsername());
            rg.setPassword(result.getRegistration().getPassword());
            r.setRegistration(rg);
            r.setPercentage(result.getPercentage());
            r.setStatus(result.getStatus());
            
            System.out.println("ResultBOImpl result is ="+result);
                    
            
            boolean results = resultRepository.save(r);
            session.getTransaction().commit();
            return results;
        }
    }
     @Override
    public List<ResultDTO> getAllResult() throws Exception {
       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            resultRepository.setSession(session);
            session.beginTransaction();
            List<Result> results = resultRepository.findAll();
            session.getTransaction().commit();
            if (results != null) {

                List<ResultDTO> alResults = new ArrayList<>();

                for (Result result : results) {
                    
            ResultDTO r=new ResultDTO();
           r.setRsid(result.getRsid());
           
            ExaminationDTO e=new ExaminationDTO();
            e.setEid(result.getExamination().getEid());
           
            
            SubjectsDTO s=new SubjectsDTO();
            s.setSubid(result.getExamination().getSubjects().getSubid());
            s.setSubjectname(result.getExamination().getSubjects().getSubjectname());
            e.setSubjectsDTO(s);
            e.setDate(result.getExamination().getDate());
            
            r.setExamination(e);
            
            RegistrationDTO rg=new RegistrationDTO();
            rg.setRegid(result.getRegistration().getRegid());
            rg.setFname(result.getRegistration().getFname());
            rg.setLname(result.getRegistration().getLname());
            rg.setPhone(result.getRegistration().getPhone());
            rg.setDob(result.getRegistration().getDob());
            rg.setEmail(result.getRegistration().getEmail());
            rg.setUsername(result.getRegistration().getUsername());
            rg.setPassword(result.getRegistration().getPassword());
            
            r.setRegistration(rg);
            
            r.setPercentage(result.getPercentage());
            r.setStatus(result.getStatus());
                    alResults.add(r);
                }

                return alResults;

            } else {

                return null;
            }
        }
    }

   
    

    @Override
    public boolean updateResult(ResultDTO result) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            resultRepository.setSession(session);
            session.beginTransaction();
             Result r=new Result();
           r.setRsid(result.getRsid());
           
            Examination e=new Examination();
            e.setEid(result.getExamination().getEid());
           
            
            Subjects s=new Subjects();
            s.setSubid(result.getExamination().getSubjectsDTO().getSubid());
            s.setSubjectname(result.getExamination().getSubjectsDTO().getSubjectname());
            e.setSubjects(s);
            e.setDate(result.getExamination().getDate());
            r.setExamination(e);
            Registration rg=new Registration();
            rg.setRegid(result.getRegistration().getRegid());
            rg.setFname(result.getRegistration().getFname());
            rg.setLname(result.getRegistration().getLname());
            rg.setPhone(result.getRegistration().getPhone());
            rg.setDob(result.getRegistration().getDob());
            rg.setEmail(result.getRegistration().getEmail());
            rg.setUsername(result.getRegistration().getUsername());
            rg.setPassword(result.getRegistration().getPassword());
            r.setRegistration(rg);
            r.setPercentage(result.getPercentage());
            r.setStatus(result.getStatus());
            
            resultRepository.update(r);
            session.getTransaction().commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteResult(String id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            resultRepository.setSession(session);
            session.beginTransaction();
            Result result = resultRepository.findById(id);
            if (result != null) {
                resultRepository.delete(result);
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
    public boolean deleteResult(ResultDTO result) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultDTO SearchResult(String resid) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.exampro.buisness.custom.RegistrationBO;
import lk.ijse.exampro.dto.RegistrationDTO;
import lk.ijse.exampro.dto.SubjectsDTO;
import lk.ijse.exampro.entity.Registration;
import lk.ijse.exampro.entity.Subjects;
import lk.ijse.exampro.repository.RepositoryFactory;
import lk.ijse.exampro.repository.custom.RegistrationRepository;
import lk.ijse.exampro.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Hafees
 */
public class RegistrationBOImpl implements RegistrationBO {

    private RegistrationRepository registrationRepository;

    public RegistrationBOImpl() {
        this.registrationRepository = (RegistrationRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.REGISTRATION);
    }

    @Override
    public boolean addRegistration(RegistrationDTO registration) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            registrationRepository.setSession(session);
            Registration c = new Registration(
                    registration.getRegid(),
                    registration.getFname(),
                    registration.getLname(),
                    registration.getEmail(),
                    registration.getDob(),
                    registration.getPhone(),
                    registration.getUsername(),
                    registration.getPassword(),
                    registration.getUserimage(),
                    registration.getGender());
            
           
            boolean registrationS = registrationRepository.save(c);
           
            session.getTransaction().commit();
           
            return registrationS;
        }
    }
    @Override
    public List<RegistrationDTO> getAllRegistration() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            registrationRepository.setSession(session);
            session.beginTransaction();
            List<Registration> registrations = registrationRepository.findAll();
            session.getTransaction().commit();
            if (registrations != null) {

                List<RegistrationDTO> alRegistrations = new ArrayList<>();

                for (Registration registration : registrations) {
                    RegistrationDTO dto = new RegistrationDTO(
                    registration.getRegid(),
                    registration.getFname(),
                    registration.getLname(),
                    registration.getEmail(),
                    registration.getDob(),
                    registration.getPhone(),
                    registration.getUsername(),
                    registration.getPassword(),
                    registration.getUserimage(),
                    registration.getGender());
                   
                    alRegistrations.add(dto);
                }

                return alRegistrations;

            } else {

                return null;
            }
        }
    }

   

    @Override
    public boolean updateRegistration(RegistrationDTO registration) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            registrationRepository.setSession(session);
            session.beginTransaction();
            Registration c = new Registration(
                    registration.getRegid(),
                    registration.getFname(),
                    registration.getLname(),
                    registration.getEmail(),
                    registration.getDob(),
                    registration.getPhone(),
                    registration.getUsername(),
                    registration.getPassword(),
                    registration.getUserimage(),
                    registration.getGender());
            registrationRepository.update(c);
            session.getTransaction().commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteRegistration(String id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            registrationRepository.setSession(session);
            session.beginTransaction();
            Registration registration = registrationRepository.findById(id);
            if (registration != null) {
                registrationRepository.delete(registration);
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
    public RegistrationDTO SearchRegistration(String regID) throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            registrationRepository.setSession(session);
           session.beginTransaction();
           Registration registration = registrationRepository.findById(regID);
           session.getTransaction().commit();
            if (registration != null) {                
                    RegistrationDTO dto = new RegistrationDTO(
                            registration.getRegid(),
                            registration.getFname(),
                            registration.getLname(),
                            registration.getEmail(),
                            registration.getDob(),
                            registration.getPhone(),
                            registration.getUsername(),
                            registration.getPassword(),
                            registration.getUserimage(),
                            registration.getGender());
                return dto;

            } else {

                return null;
            }
        }
    }

    @Override
    public boolean deleteRegistration(RegistrationDTO registrationDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

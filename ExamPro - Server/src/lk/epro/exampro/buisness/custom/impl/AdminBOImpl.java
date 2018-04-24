/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.exampro.buisness.custom.AdminBO;
import lk.ijse.exampro.dto.AdminDTO;
import lk.ijse.exampro.entity.Admin;
import lk.ijse.exampro.repository.RepositoryFactory;
import lk.ijse.exampro.repository.custom.AdminRepository;
import lk.ijse.exampro.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Hafees
 */
public class AdminBOImpl implements AdminBO {

    private AdminRepository adminRepository;

    public AdminBOImpl() {
        this.adminRepository = (AdminRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ADMIN);
    }

    @Override
    public boolean addAdmin(AdminDTO admin) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            adminRepository.setSession(session);
            Admin c = new Admin(
                    admin.getUserId(),
                    admin.getUsername(),
                    admin.getPassword(),
                    admin.getAdminimage());      
            
            boolean result = adminRepository.save(c);
            session.getTransaction().commit();
            return result;
        }
    }
    @Override
    public List<AdminDTO> getAllAdmin() throws Exception {
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            adminRepository.setSession(session);
            session.beginTransaction();
            List<Admin> admins = adminRepository.findAll();
            session.getTransaction().commit();
            if (admins != null) {

                List<AdminDTO> alAdmins = new ArrayList<>();

                for (Admin admin : admins) {
                    AdminDTO dto = new AdminDTO(
                    admin.getUserId(),
                    admin.getUsername(),
                    admin.getPassword(),
                    admin.getAdminimage());      
                    alAdmins.add(dto);
                }

                return alAdmins;

            } else {

                return null;
            }
        }
    }

   

    @Override
    public boolean updateAdmin(AdminDTO admin) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            adminRepository.setSession(session);
            session.beginTransaction();
            Admin c = new Admin(
                     admin.getUserId(),
                    admin.getUsername(),
                    admin.getPassword(),
                    admin.getAdminimage());      
            adminRepository.update(c);
            session.getTransaction().commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteAdmin(String id) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            adminRepository.setSession(session);
            session.beginTransaction();
            Admin admin = adminRepository.findById(id);
            if (admin != null) {
                adminRepository.delete(admin);
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
    public boolean deleteAdmin(AdminDTO admin) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdminDTO SearchAdmin(String adminID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

}

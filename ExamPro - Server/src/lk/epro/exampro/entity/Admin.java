/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Hafees
 */
@Entity
public class Admin {
    
   @Id
@GeneratedValue(generator="increment")
@GenericGenerator(name="increment", strategy = "increment")
    private int userId;
    private String username;
    private String password;
    @Lob
    @Column(columnDefinition="mediumblob")
    private byte[] adminimage;

    public Admin(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public Admin(int userId, String username, String password, byte[] adminimage) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.adminimage = adminimage;
    }

    public Admin() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getAdminimage() {
        return adminimage;
    }

    public void setAdminimage(byte[] adminimage) {
        this.adminimage = adminimage;
    }

    @Override
    public String toString() {
        return "Admin{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", adminimage=" + adminimage + '}';
    }

   
   

   
}

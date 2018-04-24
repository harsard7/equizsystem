/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.dto;



/**
 *
 * @author ranjith-suranga
 */

public class AdminDTO extends SuperDTO {
    private int userId;
    private String username;
    private String password;
    private byte[] adminimage;

    public AdminDTO(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public AdminDTO(int userId, String username, String password, byte[] adminimage) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.adminimage = adminimage;
    }

    public AdminDTO() {
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
        return "AdminDTO{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", adminimage=" + adminimage + '}';
    }

    
   
}

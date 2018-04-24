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

public class RegistrationDTO extends SuperDTO {
    private int regid;
    private String fname;
    private String lname;
    private String email;
    private String dob;
    private int phone;
    private String username;
    private String password;
    private byte[] userimage;
    private String gender;
    
    public RegistrationDTO(int regid, String fname, String lname, String email, String dob, int phone, String username, String password) {
        this.regid = regid;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public RegistrationDTO(int regid, String fname, String lname, String email, String dob, int phone, String username, String password, byte[] userimage, String gender) {
        this.regid = regid;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.userimage = userimage;
        this.gender = gender;
    }

  
    

    public RegistrationDTO() {
    }

    public int getRegid() {
        return regid;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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

    public byte[] getUserimage() {
        return userimage;
    }

    public void setUserimage(byte[] userimage) {
        this.userimage = userimage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "RegistrationDTO{" + "regid=" + regid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", dob=" + dob + ", phone=" + phone + ", username=" + username + ", password=" + password + ", userimage=" + userimage + ", gender=" + gender + '}';
    }

  

   

   
}

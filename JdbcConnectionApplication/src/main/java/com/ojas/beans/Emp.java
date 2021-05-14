package com.ojas.beans;

public class Emp {
    private int id;    
    private String name;    
    private float salary;    
    private String designation;
    private String Phoneno;
    private String Email;
    public String getPhoneno() {
        return Phoneno;
    }
    public void setPhoneno(String phoneno) {
        Phoneno = phoneno;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    

 

}
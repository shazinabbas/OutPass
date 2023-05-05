package com.example.may.Models;


public class UserStudent {
    //    private final String world;
    public String userName;
    public String mail;
    public String password;
    public String rollNum;
    public String roomNum;
    public String hostelName;
    public String world;



    public String contactNum;
    public String userType;

    public UserStudent( String rollNum,String userName, String mail, String password,String contactNum, String hostelName, String roomNum) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.rollNum = rollNum;
        this.roomNum = roomNum;
        this.hostelName = hostelName;
        this.contactNum = contactNum;
        this.userType = "Student";
    }

    public UserStudent(){}

    //SignUp Constructor
    public UserStudent(String userName, String mail, String password) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.world="Helloooo";
    }

}

package com.example.may;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;


public class StudentDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);


        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Users").child("Student");
//        Query checkUser = reference.orderByChild("username").equalTo(userEnteredUsername);
    }
}
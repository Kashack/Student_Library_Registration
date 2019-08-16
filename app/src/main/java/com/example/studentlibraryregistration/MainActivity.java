package com.example.studentlibraryregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    TextView matric,pass;
    String checkMatric;
    String checkpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        matric = (TextView) findViewById(R.id.matric_main);
        pass = (TextView) findViewById(R.id.password);
    }

//    protected void Authentication(){
//        checkMatric = matric.getText().toString().toLowerCase();
//
//        String pattern = "(^p|f)(\\t+)(^nd|hnd)(.[0-9])";
//
//        Pattern r = Pattern.compile(pattern);
//
//        Matcher m = r.matcher(checkMatric);
//
////        String confimMatric =
//    }
    public void reg(View view) {
        checkMatric = matric.getText().toString();
        String re = "k";
        if (checkMatric == re) {
            Intent intent = new Intent(this, RegistrationPage.class);
            startActivity(intent);
            Toast error = Toast.makeText(this, "Right Password" + checkMatric, Toast.LENGTH_LONG);
            error.show();
        }
        else if (checkMatric != re){
            Toast error = Toast.makeText(this, "Wrong Password " + checkMatric, Toast.LENGTH_LONG);
            error.show();
        }

    }

    public void clearScreen(View view) {
        matric.setText("");
        pass.setText("");
    }
}

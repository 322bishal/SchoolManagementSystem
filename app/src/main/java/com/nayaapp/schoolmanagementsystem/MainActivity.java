package com.nayaapp.schoolmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Button btnLogin,btnSignUp;
EditText userName,userPass;
ImageView userNameimg,userPassimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=findViewById(R.id.UserName);
        userPass=findViewById(R.id.UserPass);
        btnLogin=findViewById(R.id.btnlogin);
        btnSignUp=findViewById(R.id.btnSignUp);
        userNameimg=findViewById(R.id.Uimg);
        userPassimg=findViewById(R.id.Pimg);
        userName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (count > 0) {
                    userNameimg.setImageResource(R.drawable.userpic);
                } else if(start==0) {
                    userPassimg.setImageResource(R.drawable.lock);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}

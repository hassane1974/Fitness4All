package com.example.khouni.fitness4all;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private Button Login;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.epassword);
        Login = (Button)findViewById(R.id.btlogin);
        Info = (TextView)findViewById(R.id.tvresult);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vallogin(Username.getText().toString(),Password.getText().toString());
            }
        });
    }

    private void vallogin (String UserName,  String uPassword){

        if (UserName.equals("JDOE")&& uPassword.equals("welcome1")) {

            Intent intent = new Intent(login.this , SuccessfulLogin.class);
           startActivity(intent);
           // Info.setText("Login successfully");
        }
        else{

            Info.setText("Failed login repeat again");
        }
    }
}

package edu.divyagyan.loginsignupexample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private EditText passwordEditText;

    private Button loginButton;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //find view by id
       userNameEditText = findViewById(R.id.userNameEditText);
       passwordEditText = findViewById(R.id.passwordEditText);
       loginButton = findViewById(R.id.loginButton);



        loginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
            String userName = userNameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

                Log.d("Username", userName);
                Log.d("Password",password);

            }
        });



    }


}

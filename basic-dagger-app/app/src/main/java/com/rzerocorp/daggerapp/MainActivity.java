package com.rzerocorp.daggerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rzerocorp.daggerapp.ui.credentials.CredentialsViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {
    @Inject
    CredentialsViewModel credentialsViewModel;

    private EditText txtEmail, txtPassword;
    private TextView lblEmail, lblPassword;
    private Button btnLogin;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = findViewById(R.id.txtEmailAddress);
        txtPassword = findViewById(R.id.txtPassword);

        lblEmail = findViewById(R.id.lblEmailAnswer);
        lblPassword = findViewById(R.id.lblPasswordAnswer);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Email = txtEmail.getText().toString().trim();
                String Password = txtPassword.getText().toString().trim();

                credentialsViewModel.setStrUsername(Email);
                credentialsViewModel.setStrPassword(Password);

                lblEmail.setText(credentialsViewModel.getStrUsername());
                lblPassword.setText(credentialsViewModel.getStrPassword());

            }
        });

    }
}

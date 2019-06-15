package com.mrlonewolfer.example55;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRegister, btnLogin;
    Fragment fragment;
    DialogFragment dialogFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegister = findViewById(R.id.btnRegister);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogin) {

           dialogFragment = LoginFragment.newInstance();
            ( (LoginFragment)dialogFragment).setCallback(new LoginFragment.Callback() {
                @Override
                public void onActionClick(String name) {
                    Toast.makeText(MainActivity.this, "Please Fill Detail Correctly", Toast.LENGTH_SHORT).show();

                }
            });

            dialogFragment.show(getSupportFragmentManager(), "tag");


        }
        if(v.getId()==R.id.btnRegister){
            dialogFragment = RegisterFragment.newInstance();
            ( (RegisterFragment)dialogFragment).setCallback(new RegisterFragment.Callback() {
                @Override
                public void onActionClick(String name) {
                    Toast.makeText(MainActivity.this, "Please Enter Username and Password", Toast.LENGTH_SHORT).show();
                }
            });

            dialogFragment.show(getSupportFragmentManager(), "tag");

        }
    }
}

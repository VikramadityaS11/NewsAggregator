package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.myapplication.databinding.LoginActivityBinding;

public class Login extends AppCompatActivity {
    private LoginActivityBinding binding;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = LoginActivityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Glide.with(Login.this).asGif().load(R.raw.login_logo).diskCacheStrategy(DiskCacheStrategy.DATA).into(binding.imageView);
        binding.loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateForm()) {
                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, signUp.class);
                Login.this.startActivity(i);
            }
        });
    }

    private boolean validateForm() {
        String email = binding.userEmail.getText().toString().trim();
        String password = binding.userPassword.getText().toString().trim();
        if (TextUtils.isEmpty(email)) {
            binding.userEmail.setError("Email is required");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.userEmail.setError("Invalid email format");
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            binding.userPassword.setError("Password is required");
            return false;
        } else if (password.length() < 6) {
            binding.userPassword.setError("Password must be at least 6 characters long");
            return false;
        }
        return true;
    }
    }


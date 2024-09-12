package com.example.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.databinding.ActivitySignUpBinding;
import com.example.myapplication.databinding.ActivityWelcomePageBinding;

public class signUp extends AppCompatActivity {
    private ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        EdgeToEdge.enable(this);
        setContentView(view);
        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validateForm()){
                    Toast.makeText(signUp.this,"sign up successfully",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean validateForm() {
        String firstname = binding.firstName.getText().toString().trim();
        String lastname = binding.lastName.getText().toString().trim();
        String email = binding.email.getText().toString().trim();
        String password = binding.password.getText().toString().trim();
        if(TextUtils.isEmpty(firstname)){
            binding.firstName.setError("First Name is required");
            return false;
        }
        if(TextUtils.isEmpty(lastname)){
            binding.lastName.setError("Last Name is required");
            return false;
        }
        if(TextUtils.isEmpty(email)){
            binding.lastName.setError("Last Name is required");
            return false;
        } else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.email.setError("Email is invalid");
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            binding.password.setError("Password is required");
            return false;
        } else if (password.length() < 6) {
            binding.password.setError("Password must be at least 6 characters");
            return false;
        } else if (!password.matches(".*\\d.*")) {
            binding.password.setError("Password must contain at least one number");
            return false;
        }
        return true;
    }
}
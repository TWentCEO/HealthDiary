package com.twent.healthdiary.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.twent.healthdiary.R
import com.twent.healthdiary.databinding.ActivityLoginBinding
import com.twent.healthdiary.databinding.ActivityMainBinding
import java.util.zip.Inflater

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            login()
        }
    }

    private fun login() {
        
    }
}
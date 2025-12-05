package com.example.ailoanadvisor

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ailoanadvisor.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvNotifications.setOnClickListener {
            Toast.makeText(this, "Notifications Clicked", Toast.LENGTH_SHORT).show()
        }

        binding.tvPrivacy.setOnClickListener {
            Toast.makeText(this, "Privacy & Security Clicked", Toast.LENGTH_SHORT).show()
        }

        binding.tvAbout.setOnClickListener {
            Toast.makeText(this, "About App Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}

package com.example.caesarcipher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caesarcipher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        binding.viewModel=VigenereCipherViewModel()
        setContentView(binding.root)
    }
}
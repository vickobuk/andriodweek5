package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
        private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name= intent.getStringExtra("name")
        val othername= intent.getStringExtra("othername")
        val lasttime= intent.getStringExtra("lasttime")
        val imageId= intent.getIntExtra("imageId",R.drawable.a)





    }
}
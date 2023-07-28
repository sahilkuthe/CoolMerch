package com.thegreatsahil.coolmerch.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.thegreatsahil.coolmerch.R
import com.thegreatsahil.coolmerch.databinding.ActivityProductBinding
import com.thegreatsahil.coolmerch.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
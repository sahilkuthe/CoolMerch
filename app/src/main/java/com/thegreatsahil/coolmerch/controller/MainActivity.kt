package com.thegreatsahil.coolmerch.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.thegreatsahil.coolmerch.adapters.CategoryAdapter
import com.thegreatsahil.coolmerch.databinding.ActivityMainBinding
import com.thegreatsahil.coolmerch.services.DataServices

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        adapter = CategoryAdapter(this, DataServices.categories)
        binding.categoryListView.adapter = adapter
    }
}
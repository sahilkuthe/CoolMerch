package com.thegreatsahil.coolmerch.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.thegreatsahil.coolmerch.databinding.ActivityMainBinding
import com.thegreatsahil.coolmerch.model.Category
import com.thegreatsahil.coolmerch.services.DataServices

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var adapter: ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataServices.Categories
            )
        binding.categoryList.adapter = adapter
    }
}
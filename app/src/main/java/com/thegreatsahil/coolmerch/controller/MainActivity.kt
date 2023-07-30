package com.thegreatsahil.coolmerch.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thegreatsahil.coolmerch.R
import com.thegreatsahil.coolmerch.adapters.CategoryAdapter
import com.thegreatsahil.coolmerch.adapters.CategoryRecycleAdapter
import com.thegreatsahil.coolmerch.databinding.ActivityMainBinding
import com.thegreatsahil.coolmerch.model.Category
import com.thegreatsahil.coolmerch.services.DataServices
import com.thegreatsahil.coolmerch.utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var adapter: CategoryRecycleAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.categoryRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)


        adapter = CategoryRecycleAdapter(this, DataServices.categories) {category ->
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        binding.categoryRecyclerView.adapter = adapter

//        val layoutManager = LinearLayoutManager(this)
//        binding.categoryListView.layoutManager = layoutManager
//        binding.categoryListView.setHasFixedSize(true)


    }
}

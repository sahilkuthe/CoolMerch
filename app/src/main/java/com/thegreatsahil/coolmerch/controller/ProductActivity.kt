package com.thegreatsahil.coolmerch.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thegreatsahil.coolmerch.R
import com.thegreatsahil.coolmerch.adapters.ProductAdapter
import com.thegreatsahil.coolmerch.databinding.ActivityProductBinding
import com.thegreatsahil.coolmerch.services.DataServices
import com.thegreatsahil.coolmerch.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

        adapter = categoryType?.let { DataServices.getProducts(it) }
            ?.let { ProductAdapter(this, it) }!!


        recyclerView = findViewById(R.id.productRecyclerView)
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter



    }
}
package com.thegreatsahil.coolmerch.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thegreatsahil.coolmerch.R
import com.thegreatsahil.coolmerch.model.Product

class ProductAdapter(val context: Context, val product: List<Product> ) : RecyclerView.Adapter<ProductAdapter.ProductHolder>(){
    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage : ImageView = itemView.findViewById(R.id.productImage)
        val productName : TextView = itemView.findViewById(R.id.productName)
        val productPrice : TextView = itemView.findViewById(R.id.productPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_list, parent, false)
        return ProductHolder(itemView)
    }

    override fun getItemCount(): Int {
        return product.size
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val product = product[position]
        holder.productImage.setImageResource(product.ResourceId)
        holder.productName.text = product.title
        holder.productPrice.text = product.price
    }
}
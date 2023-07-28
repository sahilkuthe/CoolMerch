package com.thegreatsahil.coolmerch.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thegreatsahil.coolmerch.R
import com.thegreatsahil.coolmerch.model.Category

class CategoryRecycleAdapter(private val context: Context, private val categories: List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    class Holder(itemView: View, val itemClick : (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage : ImageView = itemView.findViewById(R.id.categoryImage)
        val categoryName : TextView =  itemView.findViewById(R.id.categoryName)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_list, parent, false)
        return Holder(itemView, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.size
    }



    override fun onBindViewHolder(holder: Holder, position: Int) {
        val category = categories[position]
        holder.categoryImage.setImageResource(category.imageResId)
        holder.categoryName.text = category.title
        holder.itemView.setOnClickListener { itemClick(category) }
    }
}

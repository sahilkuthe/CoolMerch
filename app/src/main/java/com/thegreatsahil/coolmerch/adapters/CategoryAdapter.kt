package com.thegreatsahil.coolmerch.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.thegreatsahil.coolmerch.R
import com.thegreatsahil.coolmerch.model.Category
import com.thegreatsahil.coolmerch.services.DataServices

class CategoryAdapter(val context: Activity, val categories: List<Category>) : BaseAdapter() {

    // ...

    private class ViewHolder {
        lateinit var categoryImage: ImageView
        lateinit var categoryName: TextView
    }

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            val inflater: LayoutInflater = LayoutInflater.from(context)
            categoryView = inflater.inflate(R.layout.category_list, null)

            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]

        // Set the category name
        holder.categoryName.text = category.title

        // Set the category image based on the category name
        when (category.title) {
            "SHIRTS" -> holder.categoryImage.setImageResource(R.drawable.shirtimage)
            "Hoodies" -> holder.categoryImage.setImageResource(R.drawable.hoodieimage)
            "Hats" -> holder.categoryImage.setImageResource(R.drawable.hatimage)
            "Digital" -> holder.categoryImage.setImageResource(R.drawable.digitalgoodsimage)
        }

        return categoryView
    }
}










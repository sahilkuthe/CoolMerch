package com.thegreatsahil.coolmerch.services

import com.thegreatsahil.coolmerch.R
import com.thegreatsahil.coolmerch.model.Category
import com.thegreatsahil.coolmerch.model.Product


object DataServices {

    val categories = listOf(
        Category("Shirts", R.drawable.shirtimage),
        Category("Hoodies", R.drawable.hoodieimage),
        Category("Hats", R.drawable.hatimage),
        Category("Digital", R.drawable.digitalgoodsimage)
    )

    val shirts = listOf(
        Product("Black Logo Tee", "599", R.drawable.shirt1),
        Product("White Tee", "599", R.drawable.shirt2),
        Product("Red Logo Tee", "599", R.drawable.shirt3),
        Product("Black Hustle Tee", "699", R.drawable.shirt4),
        Product("Black Studio Logo Tee", "599", R.drawable.shirt5),
        Product("Black Logo Tee", "599", R.drawable.shirt1),
        Product("White Tee", "599", R.drawable.shirt2),
        Product("Red Logo Tee", "599", R.drawable.shirt3),
        Product("Black Hustle Tee", "699", R.drawable.shirt4),
        Product("Black Studio Logo Tee", "599", R.drawable.shirt5),
        Product("Black Logo Tee", "599", R.drawable.shirt1),
        Product("White Tee", "599", R.drawable.shirt2),
        Product("Red Logo Tee", "599", R.drawable.shirt3),
        Product("Black Hustle Tee", "699", R.drawable.shirt4),
        Product("Black Studio Logo Tee", "599", R.drawable.shirt5),
        Product("Black Logo Tee", "599", R.drawable.shirt1),
        Product("White Tee", "599", R.drawable.shirt2),
        Product("Red Logo Tee", "599", R.drawable.shirt3),
        Product("Black Hustle Tee", "699", R.drawable.shirt4),
        Product("Black Studio Logo Tee", "599", R.drawable.shirt5)
        )



    val hats = listOf(
        Product("Logo Black hat ", "Rs599", R.drawable.hat1),
        Product("Logo Black cap ", "Rs699", R.drawable.hat2),
        Product("Logo White cap ", "Rs499", R.drawable.hat3),
        Product("Logo DuaTone cap ", "Rs799", R.drawable.hat4),
        Product("Logo Black hat ", "Rs599", R.drawable.hat1),
        Product("Logo Black cap ", "Rs699", R.drawable.hat2),
        Product("Logo White cap ", "Rs499", R.drawable.hat3),
        Product("Logo DuaTone cap ", "Rs799", R.drawable.hat4),
        Product("Logo Black hat ", "Rs599", R.drawable.hat1),
        Product("Logo Black cap ", "Rs699", R.drawable.hat2),
        Product("Logo White cap ", "Rs499", R.drawable.hat3),
        Product("Logo DuaTone cap ", "Rs799", R.drawable.hat4),
        Product("Logo Black hat ", "Rs599", R.drawable.hat1),
        Product("Logo Black cap ", "Rs699", R.drawable.hat2),
        Product("Logo White cap ", "Rs499", R.drawable.hat3),
        Product("Logo DuaTone cap ", "Rs799", R.drawable.hat4)
    )

    val hoodies = listOf(
        Product("Logo Black Hoodie", "1199", R.drawable.hoodie1),
        Product("Logo Red Hoodie", "1199", R.drawable.hoodie2),
        Product("Devslopes Grey Hoodie", "1199", R.drawable.hoodie3),
        Product("Devslopes Black Hoodie", "1199", R.drawable.hoodie4),
        Product("Logo Black Hoodie", "1199", R.drawable.hoodie1),
        Product("Logo Red Hoodie", "1199", R.drawable.hoodie2),
        Product("Devslopes Grey Hoodie", "1199", R.drawable.hoodie3),
        Product("Devslopes Black Hoodie", "1199", R.drawable.hoodie4),
        Product("Logo Black Hoodie", "1199", R.drawable.hoodie1),
        Product("Logo Red Hoodie", "1199", R.drawable.hoodie2),
        Product("Devslopes Grey Hoodie", "1199", R.drawable.hoodie3),
        Product("Devslopes Black Hoodie", "1199", R.drawable.hoodie4),
        Product("Logo Black Hoodie", "1199", R.drawable.hoodie1),
        Product("Logo Red Hoodie", "1199", R.drawable.hoodie2),
        Product("Devslopes Grey Hoodie", "1199", R.drawable.hoodie3),
        Product("Devslopes Black Hoodie", "1199", R.drawable.hoodie4)

    )

    val digitalGoods = listOf<Product>()


    fun getProducts(category: String): List<Product> {
        return when(category){
            "Shirts" -> shirts
            "Hoodies" -> hoodies
            "Hats" -> hats
            else -> digitalGoods
        }
    }




}
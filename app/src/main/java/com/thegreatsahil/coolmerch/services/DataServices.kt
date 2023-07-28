package com.thegreatsahil.coolmerch.services

import com.thegreatsahil.coolmerch.R
import com.thegreatsahil.coolmerch.model.Category
import com.thegreatsahil.coolmerch.model.Product


object DataServices {

    val categories = listOf(
        Category("SHIRTS", R.drawable.shirtimage),
        Category("Hoodies", R.drawable.hoodieimage),
        Category("Hats", R.drawable.hatimage),
        Category("Digital", R.drawable.digitalgoodsimage)
    )

    val shirts = listOf(
        Product("Black Logo Tee", "599", "shirt1"),
        Product("White Tee", "599", "shirt2"),
        Product("Red Logo Tee", "599", "shirt3"),
        Product("Black Hustle Tee", "699", "shirt4"),
        Product("Black Studio Logo Tee", "599", "shirt5")
        )



    val hats = listOf(
        Product("Logo Black hat ", "Rs599", "hat1"),
        Product("Logo Black cap ", "Rs699", "hat2"),
        Product("Logo White cap ", "Rs499", "hat3"),
        Product("Logo DuaTone cap ", "Rs799", "hat4")
    )

    val hoodies = listOf(
        Product("Logo Black Hoodie", "1199", "hoodie1"),
        Product("Logo Red Hoodie", "1199", "hoodie2"),
        Product("Devslopes Grey Hoodie", "1199", "hoodie3"),
        Product("Devslopes Black Hoodie", "1199", "hoodie4"),

    )




}
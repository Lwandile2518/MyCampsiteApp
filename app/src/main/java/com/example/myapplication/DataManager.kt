package com.example.myapplication

object DataManager {
    val itemNames = mutableListOf<String>()
    val itemCategories = mutableListOf<String>()
    val itemQuantities = mutableListOf<Int>()
    val itemComments = mutableListOf<String>()

    fun getTotalItems(): Int {
        return itemQuantities.sum()
    }

    fun addItem(name: String, category: String, quantity: Int, comment: String) {
        itemNames.add(name)
        itemCategories.add(category)
        itemQuantities.add(quantity)
        itemComments.add(comment)
    }
}
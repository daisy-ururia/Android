package com.daisy.zawadimart.repository

import android.content.Context
import com.daisy.zawadimart.data.ProductDatabase
import com.daisy.zawadimart.model.Product

class ProductRepository(context: Context) {
    private val productDao = ProductDatabase.getDatabase(context).productDao()

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    fun getAllProducts() = productDao.getAllProducts()

    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)
}
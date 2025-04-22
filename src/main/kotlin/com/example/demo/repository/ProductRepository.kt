package com.example.demo.repository

import com.example.demo.entity.Product
import java.util.Optional

interface ProductRepository {
    fun findProductByProductId(productId: Long): Optional<Product>
}

/* Assignment 4

    Recommendation.kt

    Nils Streedain | streedan@oregonstate.edu
    CS 492 | Oregon state University
 */
package com.example.assignment4.model

data class Recommendation(
    val id: Int,
    val name: String,
    val address: String,
    val description: String,
    val imageRes: Int
)

data class Category(
    val name: String,
    val recommendations: List<Recommendation>
)
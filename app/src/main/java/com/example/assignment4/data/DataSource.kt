/* Assignment 4

    DataSource.kt

    Nils Streedain | streedan@oregonstate.edu
    CS 492 | Oregon state University
 */
package com.example.assignment4.data

import com.example.assignment4.model.Category
import com.example.assignment4.model.Recommendation
import com.example.assignment4.R

object DataSource {
    val categories = listOf(
        Category(
            name = "Restaurants",
            recommendations = listOf(
                Recommendation(
                    id = 1,
                    name = "Cibo",
                    address = "3539 SE Division St\nPortland, OR 97202\nUnited States",
                    description = "Cibo serves tasty wood-fired pizzas and fresh pasta in a cozy setting. It is a relaxed spot for a good meal.",
                    imageRes = R.drawable.cibo
                ),
                Recommendation(
                    id = 2,
                    name = "¿Por Qué No?",
                    address = "4635 SE Hawthorne Blvd\nPortland, OR 97215\nUnited States",
                    description = "¿Por Qué No? offers flavorful Mexican-inspired dishes in a casual atmosphere. Enjoy creative tacos and refreshing drinks.",
                    imageRes = R.drawable.porqueno
                ),
                Recommendation(
                    id = 3,
                    name = "La Buca",
                    address = "40 NE 28th Ave\nPortland, OR 97232\nUnited States",
                    description = "La Buca is a small Italian restaurant with classic dishes. It has a quiet and friendly vibe.",
                    imageRes = R.drawable.labuca
                ),
                Recommendation(
                    id = 4,
                    name = "BAES Chicken",
                    address = "225 SW Ash St\nPortland, OR 97204\nUnited States",
                    description = "BAES Chicken is a trendy spot for fried chicken. It is known for its crispy and flavorful chicken.",
                    imageRes = R.drawable.baes
                )
            )
        ),
        Category(
            name = "Parks",
            recommendations = listOf(
                Recommendation(
                    id = 1,
                    name = "Mt. Tabor",
                    address = "SE 60th Avenue and Salmon Street\nPortland, OR 97215\nUnited States",
                    description = "Mt. Tabor Park has lovely trails and city views. It is a great spot for hiking and picnics.",
                    imageRes = R.drawable.mttabor
                ),
                Recommendation(
                    id = 2,
                    name = "Rocky Butte",
                    address = "NE Rocky Butte Road\nPortland, OR 97220\nUnited States",
                    description = "Rocky Butte offers clear views and quiet picnic spots. It is ideal for a relaxing day outdoors.",
                    imageRes = R.drawable.rockybutte
                ),
                Recommendation(
                    id = 3,
                    name = "Ladd Circle Park",
                    address = "SE 16th Avenue and Harrison Street\nPortland, OR 97214\nUnited States",
                    description = "Ladd Circle Park is a small urban park perfect for a short walk. It offers a calm escape in the city.",
                    imageRes = R.drawable.ladds
                ),
                Recommendation(
                    id = 4,
                    name = "Washington Park",
                    address = "4033 SW Canyon Rd\nPortland, OR 97221\nUnited States",
                    description = "Washington Park features gardens and open spaces for a leisurely stroll. It is a good place for family outings.",
                    imageRes = R.drawable.washington
                )
            )
        ),
        Category(
            name = "Museums",
            recommendations = listOf(
                Recommendation(
                    id = 1,
                    name = "Portland Art Museum",
                    address = "1219 SW Park Ave\nPortland, OR 97205\nUnited States",
                    description = "The Portland Art Museum has a mix of local and international art. It is a quiet place to explore culture.",
                    imageRes = R.drawable.art
                ),
                Recommendation(
                    id = 2,
                    name = "OMSI",
                    address = "1945 SE Water Ave\nPortland, OR 97214\nUnited States",
                    description = "OMSI is a science museum with interactive exhibits. It is fun and educational for all ages.",
                    imageRes = R.drawable.omsi
                ),
                Recommendation(
                    id = 3,
                    name = "Portland Children's Museum",
                    address = "4015 SW Canyon Rd\nPortland, OR 97221\nUnited States",
                    description = "The Portland Children's Museum offers hands-on activities for kids. It is a great place for family fun.",
                    imageRes = R.drawable.pcm
                ),
                Recommendation(
                    id = 4,
                    name = "World Forestry Center",
                    address = "4033 SW Canyon Rd\nPortland, OR 97221\nUnited States",
                    description = "The World Forestry Center explains the importance of trees and forests. It is an educational spot with simple exhibits.",
                    imageRes = R.drawable.forestry
                )
            )
        )
    )
}
/* Assignment 4

    Navigation.kt

    Nils Streedain | streedan@oregonstate.edu
    CS 492 | Oregon state University
 */
package com.example.assignment4.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment4.data.DataSource

@Composable
fun AppNavHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {
        composable("home") {
            HomeScreen(
                onCategorySelected = { categoryName ->
                    navController.navigate("category/$categoryName")
                }
            )
        }

        composable("category/{categoryName}") { backStackEntry ->
            val categoryName = backStackEntry.arguments?.getString("categoryName") ?: ""
            CategoryScreen(
                categoryName = categoryName,
                onRecommendationSelected = { recommendationId ->
                    navController.navigate("detail/$categoryName/$recommendationId")
                },
                onBackClicked = { navController.navigateUp() }
            )
        }

        composable("detail/{categoryName}/{recommendationId}") { backStackEntry ->
            val categoryName = backStackEntry.arguments?.getString("categoryName") ?: ""
            val recommendationId = backStackEntry.arguments?.getString("recommendationId")?.toIntOrNull() ?: 0
            DetailScreen(
                categoryName = categoryName,
                recommendationId = recommendationId,
                onBackClicked = { navController.navigateUp() }
            )
        }
    }
}


@Composable
fun HomeScreen(onCategorySelected: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // City header
        Text(text = "Portland, OR", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        // List each category
        DataSource.categories.forEach { category ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable { onCategorySelected(category.name) }
            ) {
                Text(
                    text = category.name,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Composable
fun CategoryScreen(
    categoryName: String,
    onRecommendationSelected: (Int) -> Unit,
    onBackClicked: () -> Unit
) {
    val category = DataSource.categories.find { it.name == categoryName }

    if (category == null) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Category not found")
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Inline row with back icon and title
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBackClicked) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = category.name,
                style = MaterialTheme.typography.headlineMedium
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // List each recommendation in the category
        category.recommendations.forEach { recommendation ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable { onRecommendationSelected(recommendation.id) }
            ) {
                Text(
                    text = recommendation.name,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Composable
fun DetailScreen(
    categoryName: String,
    recommendationId: Int,
    onBackClicked: () -> Unit
) {
    val category = DataSource.categories.find { it.name == categoryName }
    val recommendation = category?.recommendations?.find { it.id == recommendationId }

    if (recommendation == null) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("Recommendation not found")
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Inline row with back icon and title
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBackClicked) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Recommended Place",
                style = MaterialTheme.typography.headlineMedium
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Image loaded from the app resources
        Image(
            painter = painterResource(id = recommendation.imageRes),
            contentDescription = recommendation.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))
        // Address
        Text(text = recommendation.address, style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(8.dp))
        // Description
        Text(text = recommendation.description, style = MaterialTheme.typography.bodyLarge)
    }
}
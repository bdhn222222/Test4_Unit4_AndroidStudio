package com.example.mycityapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.MyCityAppTheme
import com.example.mycityapp.R
import com.example.mycityapp.model.Category

import com.example.test4.data.DataSource

@Composable
fun CategoryListScreen(
    categoryList: List<Category>,
    modifier: Modifier = Modifier,
    onCardClick: (Category) -> Unit,
) {
    LazyColumn(modifier = modifier) {
        items(categoryList) {category ->
            CategoryCard(
                category = category,
                selected = false,
                onCardClick = { onCardClick(category) },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun CategoryCard(
    category: Category,
    selected: Boolean,
    onCardClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clickable { onCardClick(category) }
            .padding(12.dp)
            .background(Color(0xFF032B6B)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF032B6B))
                .padding(vertical = 8.dp, horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = category.icon),
                contentDescription = stringResource(id = category.city_place),
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.errorContainer,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = stringResource(id = category.city_place),
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontStyle = FontStyle.Italic,
                    color = MaterialTheme.colorScheme.errorContainer,
                ),
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CategoryCardPreview() {
    MyCityAppTheme {
        CategoryCard(
            category = DataSource.defaultCategory,
            selected = false,
            onCardClick = {}
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun CategoryListContentPreview() {
    MyCityAppTheme {

        Scaffold(
            topBar = {
                MyCityAppBar(
                    canNavigateBack = false,
                    headerResId = R.string.app_name,
                    currentScreen = MyCityScreen.CATEGORY
                )
            }
        ) { innerPadding ->
            CategoryListScreen(
                categoryList = DataSource.getCategoryData(),
                onCardClick = { Category -> },
                modifier = Modifier
                    .padding(innerPadding)
            )
        }


    }
}
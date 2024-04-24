package com.example.mycityapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.MyCityAppTheme
import com.example.mycityapp.model.Recommendation
import com.example.test4.data.DataSource

@Composable
fun DetailsScreen(
    recommendation: Recommendation,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(12.dp)
            .background(Color(0xFF032B6B)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF032B6B))
                .padding(12.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = stringResource(id = recommendation.city_place),
                modifier = Modifier
                    .padding(bottom = 12.dp)
                    .align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontStyle = FontStyle.Italic,
                    color = MaterialTheme.colorScheme.errorContainer,
                )
            )
            Image(
                painter = painterResource(id = recommendation.city_place_image),
                contentDescription = stringResource(id = recommendation.city_place),
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(25.dp)),
                contentScale = ContentScale.Crop,

            )
            Text(
                text = stringResource(id = recommendation.city_place_add),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(vertical = 12.dp),
                color = MaterialTheme.colorScheme.errorContainer,
            )
            Text(
                text = stringResource(id = recommendation.city_place_desc),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.errorContainer,
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview() {
    MyCityAppTheme {
        Scaffold(
            topBar = {
                MyCityAppBar(
                    canNavigateBack = true,
                    headerResId = DataSource.defaultCategory.city_place,
                    currentScreen = MyCityScreen.DETAIL
                )
            }
        ) { innerPadding ->
            DetailsScreen(
                recommendation = DataSource.defaultRecommendation,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}
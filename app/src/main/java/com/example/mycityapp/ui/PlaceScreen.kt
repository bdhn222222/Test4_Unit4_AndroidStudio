package com.example.mycityapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.MyCityAppTheme
import com.example.mycityapp.data.MyCityUiState
import com.example.mycityapp.model.Recommendation
import com.example.test4.data.DataSource

/* TODO */
@Composable
fun RecommendationListAndDetail(
    myCityUiState: MyCityUiState,
    onRecommendationCardPressed: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
}


@Composable
fun RecommendationListScreen(
    recommendationList: List<Recommendation>,
    onCardClick: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(recommendationList) {recommendation ->
            RecommendationCard(
                recommendation = recommendation,
                selected = false,
                onCardClick = { onCardClick(recommendation) },
                modifier = Modifier.padding(8.dp),
                key = recommendation.city_place_id
            )
        }
    }

}





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecommendationCard(
    recommendation: Recommendation,
    selected: Boolean,
    onCardClick: (Recommendation) -> Unit,
    key: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clickable { onCardClick(recommendation) }
            .padding(0.dp)
            .background(Color(0xFF032B6B)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {
        Column (modifier = modifier
            .padding(0.dp)
            .background(Color(0xFF032B6B))
        ){
            Image(
                painter = painterResource(id = recommendation.city_place_image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(recommendation.city_place),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontStyle = FontStyle.Italic,
                    color = MaterialTheme.colorScheme.errorContainer,
                )
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun RecommendationCardPreview() {
    MyCityAppTheme {
        RecommendationCard(
            recommendation = DataSource.defaultRecommendation,
            selected = false,
            onCardClick = {},
            key = DataSource.defaultRecommendation.city_place_id
        )
    }
}
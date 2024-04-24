package com.example.test4.data

import com.example.mycityapp.model.Recommendation
import com.example.mycityapp.R
import com.example.mycityapp.model.Category

object DataSource {
    val defaultRecommendation: Recommendation = getCity1Data()[0]

    fun getCity1Data(): List<Recommendation> {
        return listOf(
            Recommendation(
                city_place_id = 1,
                city_place = R.string.city1_place1,
                city_place_add = R.string.city1_place1_add,
                city_place_desc = R.string.city1_place1_desc,
                city_place_image = R.drawable.city1_place1_image
            ),
            Recommendation(
                city_place_id = 2,
                city_place = R.string.city1_place2,
                city_place_add = R.string.city1_place2_add,
                city_place_desc = R.string.city1_place2_desc,
                city_place_image = R.drawable.city1_place2_image
            ),
            Recommendation(
                city_place_id = 3,
                city_place = R.string.city1_place3,
                city_place_add = R.string.city1_place3_add,
                city_place_desc = R.string.city1_place3_desc,
                city_place_image = R.drawable.city1_place3_image
            ),
            Recommendation(
                city_place_id = 4,
                city_place = R.string.city1_place4,
                city_place_add = R.string.city1_place4_add,
                city_place_desc = R.string.city1_place4_desc,
                city_place_image = R.drawable.city1_place4_image
            )
        )
    }

    fun getCity2Data(): List<Recommendation> {
        return listOf(
            Recommendation(
                city_place_id = 5,
                city_place = R.string.city2_place1,
                city_place_add = R.string.city2_place1_add,
                city_place_desc = R.string.city2_place1_desc,
                city_place_image = R.drawable.city2_place1_image
            ),
            Recommendation(
                city_place_id = 6,
                city_place = R.string.city2_place2,
                city_place_add = R.string.city2_place2_add,
                city_place_desc = R.string.city2_place2_desc,
                city_place_image = R.drawable.city2_place2_image
            ),
            Recommendation(
                city_place_id = 7,
                city_place = R.string.city2_place3,
                city_place_add = R.string.city2_place3_add,
                city_place_desc = R.string.city2_place3_desc,
                city_place_image = R.drawable.city2_place3_image
            ),
            Recommendation(
                city_place_id = 8,
                city_place = R.string.city2_place4,
                city_place_add = R.string.city2_place4_add,
                city_place_desc = R.string.city2_place4_desc,
                city_place_image = R.drawable.city2_place4_image
            )
        )
    }

    fun getCity3Data(): List<Recommendation> {
        return listOf(
            Recommendation(
                city_place_id = 9,
                city_place = R.string.city3_place1,
                city_place_add = R.string.city3_place1_add,
                city_place_desc = R.string.city3_place1_desc,
                city_place_image = R.drawable.city3_place1_image
            ),
            Recommendation(
                city_place_id = 10,
                city_place = R.string.city3_place2,
                city_place_add = R.string.city3_place2_add,
                city_place_desc = R.string.city3_place2_desc,
                city_place_image = R.drawable.city3_place2_image
            ),
            Recommendation(
                city_place_id = 11,
                city_place = R.string.city3_place3,
                city_place_add = R.string.city3_place3_add,
                city_place_desc = R.string.city3_place3_desc,
                city_place_image = R.drawable.city3_place3_image
            ),
            Recommendation(
                city_place_id = 12,
                city_place = R.string.city3_place4,
                city_place_add = R.string.city3_place4_add,
                city_place_desc = R.string.city3_place4_desc,
                city_place_image = R.drawable.city3_place4_image
            )
        )
    }

    fun getCity4Data(): List<Recommendation> {
        return listOf(
            Recommendation(
                city_place_id = 13,
                city_place = R.string.city4_place1,
                city_place_add = R.string.city4_place1_add,
                city_place_desc = R.string.city4_place1_desc,
                city_place_image = R.drawable.city4_place1_image
            ),
            Recommendation(
                city_place_id = 14,
                city_place = R.string.city4_place2,
                city_place_add = R.string.city4_place2_add,
                city_place_desc = R.string.city4_place2_desc,
                city_place_image = R.drawable.city4_place1_image
            ),
            Recommendation(
                city_place_id = 15,
                city_place = R.string.city4_place3,
                city_place_add = R.string.city4_place3_add,
                city_place_desc = R.string.city4_place3_desc,
                city_place_image = R.drawable.city4_place3_image
            ),
            Recommendation(
                city_place_id = 16,
                city_place = R.string.city4_place4,
                city_place_add = R.string.city4_place4_add,
                city_place_desc = R.string.city4_place4_desc,
                city_place_image = R.drawable.city4_place4_image
            )
        )
    }

    val defaultCategory: Category = getCategoryData()[0]
    fun getCategoryData(): List<Category> {
        return listOf(
            Category(
                city_place = R.string.city1,
                icon = R.drawable.icons8_map_24
            ),
            Category(
                city_place = R.string.city2,
                icon = R.drawable.icons8_map_24
            ),
            Category(
                city_place = R.string.city3,
                icon = R.drawable.icons8_map_24
            ),
            Category(
                city_place = R.string.city4,
                icon = R.drawable.icons8_map_24
            )
        )
    }
}
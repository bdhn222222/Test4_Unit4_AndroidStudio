package com.example.mycityapp.ui

import androidx.annotation.StringRes
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R
import com.example.mycityapp.data.MyCityUiState
import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Recommendation
import com.example.test4.data.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MyCityViewModel : ViewModel() {

    /**
     * T
     *     MutableStateFlow là một lớp được sử dụng để lưu trữ một giá trị có thể thay đổi theo thời gian. Nó cung cấp các phương thức để cập nhật giá trị và thông báo cho các luồng khác về sự thay đổi.
     *     StateFlow là một phiên bản không thể thay đổi của MutableStateFlow. Nó chỉ cung cấp các phương thức để truy cập giá trị hiện tại và để đăng ký lắng nghe sự thay đổi của giá trị.
     *
     * */
    private val _uiState = MutableStateFlow(MyCityUiState(categoryList = DataSource.getCategoryData()))
    val uiState: StateFlow<MyCityUiState> = _uiState.asStateFlow()


    /**
     * Set the category that is clicked by the user and update header
     * */
    fun setCategory(selectedCategory: Category) {
        _uiState.update {
            it.copy(
                currentCategory = selectedCategory,
                headerTitleId = selectedCategory.city_place
            )
        }
        updateRecommendationListData(selectedCategory.city_place)
    }

    /**
     * Set the recommendation that is clicked by the user
     * */
    fun setRecommendation(selectedRecommendation: Recommendation) {
        _uiState.update {
            it.copy(currentRecommendation = selectedRecommendation)
        }
    }

    private fun updateRecommendationListData(@StringRes categoryTitleId: Int) {

        val recommendationList: List<Recommendation> = when (categoryTitleId) {
            R.string.city1 -> DataSource.getCity1Data()
            R.string.city2 -> DataSource.getCity2Data()
            R.string.city3 -> DataSource.getCity3Data()
            R.string.city4 -> DataSource.getCity4Data()
            else -> DataSource.getCity1Data()
        }

        _uiState.update {
            it.copy(recommendationList = recommendationList)
        }
    }
}
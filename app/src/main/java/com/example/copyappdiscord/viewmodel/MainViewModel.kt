package com.example.copyappdiscord.viewmodel

import android.service.autofill.UserData
import androidx.lifecycle.ViewModel
import com.example.copyappdiscord.MainActivity
import kotlinx.coroutines.flow.StateFlow

class MainViewModel :ViewModel() {
//    val uiState = StateFlow<MainActivityUiState> = user
}

sealed interface MainActivityUiState {
    data object Loading : MainActivityUiState
    data class Success(val userData: UserData) : MainActivityUiState
}
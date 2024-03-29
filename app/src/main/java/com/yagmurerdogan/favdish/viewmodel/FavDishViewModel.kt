package com.yagmurerdogan.favdish.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.yagmurerdogan.favdish.model.database.FavDishRepositroy
import com.yagmurerdogan.favdish.model.entities.FavDish
import kotlinx.coroutines.launch

class FavDishViewModel(private val repository: FavDishRepositroy) : ViewModel() {

    fun insert(dish:FavDish) = viewModelScope.launch {
        repository.insertFavdishData(dish)
    }
}

class FavDishViewModelFactory(private val repository: FavDishRepositroy) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavDishViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return FavDishViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}
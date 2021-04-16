package com.yagmurerdogan.favdish.model.database

import androidx.annotation.WorkerThread
import com.yagmurerdogan.favdish.model.entities.FavDish

class FavDishRepositroy(private val favDishDao: FavDishDao) {

    @WorkerThread
    suspend fun insertFavdishData(favDish: FavDish) {
        favDishDao.insertFavDishDetails(favDish)
    }
}
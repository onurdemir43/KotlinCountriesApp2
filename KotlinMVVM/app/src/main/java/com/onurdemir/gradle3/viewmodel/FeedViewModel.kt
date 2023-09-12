package com.onurdemir.gradle3.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onurdemir.gradle3.model.Country

class FeedViewModel: ViewModel() {
    val countries = MutableLiveData<List<Country>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()

    fun refreshData() {
        val country = Country("Turkey","Ankara","Asia","TRY","www.ss.com","Turkish")
        val country2 = Country("France","Paris","Europe","EUR","www.ss.com","French")
        val country3 = Country("Germany","Berlin","Europe","EUR","www.ss.com","German")

        val countryList = arrayListOf<Country>(country,country2,country3)

        countries.value = countryList
        countryError.value = false
        countryLoading.value = false
    }
}




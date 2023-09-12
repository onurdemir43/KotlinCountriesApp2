package com.onurdemir.gradle3.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onurdemir.gradle3.model.Country

class CountryViewModel : ViewModel() {

    val countryLiveData = MutableLiveData<Country>()

    fun getDataFromRoom() {
         val country = Country("Turkey","Ankara","Asia","TRY","www.ss.com","Turkish")
        countryLiveData.value = country
    }

}
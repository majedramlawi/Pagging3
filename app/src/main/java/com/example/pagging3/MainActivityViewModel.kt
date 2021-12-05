package com.example.pagging3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.pagging3.network.CharacterData
import com.example.pagging3.network.RetroInstance

import com.example.pagging3.network.RetroService
import kotlinx.coroutines.flow.Flow

class MainActivityViewModel: ViewModel() {

    var retroService: RetroService = RetroInstance.getRetroInstance().create(RetroService::class.java)

    fun getListData(query: String): Flow<PagingData<CharacterData>> {

        return Pager (
            config = PagingConfig(pageSize = 20, maxSize = 200),
            pagingSourceFactory = {
                CharacterPagingSource(retroService,query)
            }
        ).flow.cachedIn(viewModelScope)
    }//end function

}//end class
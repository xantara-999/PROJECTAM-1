package com.example.project_am.database

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CategoryViewModel (
    private val dao:Dao_database
):ViewModel(){

    private val _state = MutableStateFlow(Category_state())

    fun onEvent(event: CategoryEvent){
        when(event){
            is CategoryEvent.DeleteCategory -> {
                viewModelScope.launch{
                    dao.deleteCategory(event.kategoriBarang)
                }

            }
            is CategoryEvent.Insert_Cat -> {
                _state.update{it.copy(

                )}
            }
            CategoryEvent.saveCategory -> TODO()
        }
    }
}


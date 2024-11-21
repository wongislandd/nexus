package com.wongislandd.nexus.viewmodel

import androidx.lifecycle.ViewModel

abstract class SliceableViewModel(
    val uiEventBus: EventBus<UiEvent>,
    val backChannelEventBus: EventBus<BackChannelEvent>
) : ViewModel() {

    fun registerSlice(viewModelSlice: ViewModelSlice) {
        viewModelSlice.register(this)
    }

    override fun onCleared() {
        super.onCleared()
    }
}
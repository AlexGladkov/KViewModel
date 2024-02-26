package io.github.alexgladkov.kviewmodel.example.common.detail

import io.github.alexgladkov.kviewmodel.BaseSharedViewModel
import io.github.alexgladkov.kviewmodel.example.common.detail.models.DetailAction
import io.github.alexgladkov.kviewmodel.example.common.detail.models.DetailEvent
import io.github.alexgladkov.kviewmodel.example.common.detail.models.DetailViewState

class DetailViewModel(param: Int) : BaseSharedViewModel<DetailViewState, DetailAction, DetailEvent>(
    DetailViewState(text = "Got $param")
) {

    override fun obtainEvent(viewEvent: DetailEvent) {

    }

}
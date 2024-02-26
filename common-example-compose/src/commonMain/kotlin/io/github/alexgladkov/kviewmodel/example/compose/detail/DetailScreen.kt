package io.github.alexgladkov.kviewmodel.example.compose.detail

import androidx.compose.runtime.Composable
import io.github.alexgladkov.kviewmodel.compose.ViewModel
import io.github.alexgladkov.kviewmodel.example.common.detail.DetailViewModel

@Composable
fun DetailScreen(param: Int) {
    ViewModel(factory = { DetailViewModel(param) }) { _ ->

    }
}
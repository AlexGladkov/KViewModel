package io.github.alexgladkov.kviewmodel.example.common.test.models

sealed class TestAction {
    data class OpenDetail(val param: Int) : TestAction()
}
package io.github.alexgladkov.kviewmodel.example.common.test.models

sealed class TestEvent {
    object IncrementClick : TestEvent()
    object DecrementClick : TestEvent()
    object DetailClick : TestEvent()
}
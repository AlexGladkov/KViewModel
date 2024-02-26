package io.github.alexgladkov.kviewmodel.odyssey

import ru.alexgladkov.odyssey.compose.RootController

public fun RootController.setupWithViewModels() {
    onScreenRemove = {
        ViewModelStore.remove(it.key)
    }
}
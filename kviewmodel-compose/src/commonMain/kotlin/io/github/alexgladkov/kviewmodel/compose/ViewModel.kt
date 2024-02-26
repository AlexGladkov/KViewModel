package io.github.alexgladkov.kviewmodel.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisallowComposableCalls
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import io.github.alexgladkov.kviewmodel.KViewModel

@Composable
public fun <T : KViewModel> ViewModel(
    factory: @DisallowComposableCalls () -> T,
    content: @Composable (T) -> Unit
) {
    val viewModel = remember { factory() }
    content(viewModel)

    DisposableEffect(Unit) {
        onDispose(viewModel::clear)
    }
}
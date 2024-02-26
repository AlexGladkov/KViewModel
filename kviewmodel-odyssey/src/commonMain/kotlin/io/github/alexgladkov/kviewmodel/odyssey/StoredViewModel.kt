package io.github.alexgladkov.kviewmodel.odyssey

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisallowComposableCalls
import androidx.compose.runtime.remember
import io.github.alexgladkov.kviewmodel.KViewModel
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
public inline fun <reified T : KViewModel> StoredViewModel(
    noinline factory: @DisallowComposableCalls () -> T,
    viewModelKey: String? = null,
    noinline content: @Composable (T) -> Unit,
) {
    val currentScreen = LocalRootController.current.currentScreen
    val screenKey = viewModelKey ?: currentScreen.value?.screen?.key ?: return
    val viewModel = remember { ViewModelStore.getOrPut(screenKey, factory) }
    content(viewModel)
}
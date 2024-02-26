package io.github.alexgladkov.kviewmodel.odyssey

import kotlin.reflect.KClass

public actual val KClass<*>.name: String get() = js.name
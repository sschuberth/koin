/*
 * Copyright 2017-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.koin.compose.viewmodel.dsl

import androidx.lifecycle.ViewModel
import org.koin.core.annotation.KoinInternalApi
import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.module.dsl.DefinitionOptions
import org.koin.core.module.dsl.new
import org.koin.core.module.dsl.onOptions

/**
 * Declare a [Module.viewModel] definition by resolving a constructor reference for the dependency.
 * The resolution is done at compile time by leveraging inline functions, no reflection is required.
 *
 * Example:
 * ```
 * class MyViewModel : ViewModel()
 *
 * val myModule = module {
 *   viewModelOf(::MyViewModel)
 * }
 * ```
 *
 * @author Arnaud Giuliani
 *
 * @see new
 */
inline fun <reified R : ViewModel> Module.viewModelOf(
    crossinline constructor: () -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1> Module.viewModelOf(
    crossinline constructor: (T1) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2> Module.viewModelOf(
    crossinline constructor: (T1, T2) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

/**
 * @see viewModelOf
 */
inline fun <reified R : ViewModel, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22> Module.viewModelOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = viewModel { new(constructor) }.onOptions(options)

@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("ComparisonsKt")

package kotlin.comparisons

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.comparisons.*

/**
 * Returns the greater of two values.
 * If values are equal, returns the first one.
 */
@SinceKotlin("1.1")
public expect fun <T: Comparable<T>> maxOf(a: T, b: T): T

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Byte, b: Byte): Byte

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Short, b: Short): Short

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Int, b: Int): Int

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Long, b: Long): Long

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Float, b: Float): Float

/**
 * Returns the greater of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Double, b: Double): Double

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
public expect fun <T: Comparable<T>> maxOf(a: T, b: T, c: T): T

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Byte, b: Byte, c: Byte): Byte

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Short, b: Short, c: Short): Short

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Int, b: Int, c: Int): Int

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Long, b: Long, c: Long): Long

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Float, b: Float, c: Float): Float

/**
 * Returns the greater of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun maxOf(a: Double, b: Double, c: Double): Double

/**
 * Returns the greater of three values according to the order specified by the given [comparator].
 */
@SinceKotlin("1.1")
public expect fun <T> maxOf(a: T, b: T, c: T, comparator: Comparator<in T>): T

/**
 * Returns the greater of two values according to the order specified by the given [comparator].
 * If values are equal, returns the first one.
 */
@SinceKotlin("1.1")
public expect fun <T> maxOf(a: T, b: T, comparator: Comparator<in T>): T

/**
 * Returns the smaller of two values.
 * If values are equal, returns the first one.
 */
@SinceKotlin("1.1")
public expect fun <T: Comparable<T>> minOf(a: T, b: T): T

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Byte, b: Byte): Byte

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Short, b: Short): Short

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Int, b: Int): Int

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Long, b: Long): Long

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Float, b: Float): Float

/**
 * Returns the smaller of two values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Double, b: Double): Double

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
public expect fun <T: Comparable<T>> minOf(a: T, b: T, c: T): T

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Byte, b: Byte, c: Byte): Byte

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Short, b: Short, c: Short): Short

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Int, b: Int, c: Int): Int

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Long, b: Long, c: Long): Long

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Float, b: Float, c: Float): Float

/**
 * Returns the smaller of three values.
 */
@SinceKotlin("1.1")
@kotlin.internal.InlineOnly
public expect inline fun minOf(a: Double, b: Double, c: Double): Double

/**
 * Returns the smaller of three values according to the order specified by the given [comparator].
 */
@SinceKotlin("1.1")
public expect fun <T> minOf(a: T, b: T, c: T, comparator: Comparator<in T>): T

/**
 * Returns the smaller of two values according to the order specified by the given [comparator].
 * If values are equal, returns the first one.
 */
@SinceKotlin("1.1")
public expect fun <T> minOf(a: T, b: T, comparator: Comparator<in T>): T


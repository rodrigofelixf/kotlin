package br.com.rodrigofelixf

import java.util.*

fun main() {
    val numeros: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val numeros2 = Array(10) { i -> i }

    println(Arrays.toString(numeros))
    println(Arrays.toString(numeros2))
}
package org.example

fun getUglyNumber(target: Int): Int {
    if (target <= 0) return 0

    val uglyNumbers = IntArray(target)
    uglyNumbers[0] = 1

    var firstFactor = 2
    var secondFactor = 3
    var thirdFactor = 5

    var indexFirstFactor = 0
    var indexSecondFactor = 0
    var indexThirdFactor = 0

    for (i in 1 until target) {
        val min = minOf(firstFactor, secondFactor, thirdFactor)
        uglyNumbers[i] = min

        if (min == firstFactor) {
            indexFirstFactor++
            firstFactor = uglyNumbers[indexFirstFactor] * 2
        }
        if (min == secondFactor) {
            indexSecondFactor++
            secondFactor = uglyNumbers[indexSecondFactor] * 3
        }
        if (min == thirdFactor) {
            indexThirdFactor++
            thirdFactor = uglyNumbers[indexThirdFactor] * 5
        }
    }
    return uglyNumbers.last()
}

fun main() {
    data.forEach {
        println(getUglyNumber(it))
    }
}

val data = intArrayOf(
    10,
    1,
    5
)
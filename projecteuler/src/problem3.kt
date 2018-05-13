package projecteuler

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

import kotlin.math.sqrt

fun problem3(number : Long) : Long {
    var start = sqrt(number.toDouble()).toLong()
    for (i in start downTo 3) {

        if (isPrime(i) && number % i == 0L ) {
            return i
        }
    }
    return -1
}


package projecteuler

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

fun problem5() : Int {
    for (i in 10..1000000000) {
        if (divisible(i, 2, 20)) {
            return i
        }
    }
    return -1
}

fun divisible(number : Int, start : Int, end : Int) : Boolean {
    for (i in start..end) {
        if (number % i != 0) {
            return false
        }
    }
    return true
}
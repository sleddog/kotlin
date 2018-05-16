package projecteuler

//The sum of the squares of the first ten natural numbers is,
//
//12 + 22 + ... + 102 = 385
//The square of the sum of the first ten natural numbers is,
//
//(1 + 2 + ... + 10)2 = 552 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

fun problem6(max : Int) {
    var a = sumOfSquares(max)
    var b = squareOfSum(max)
    var c = b - a
    println(c)
}

fun sumOfSquares(num : Int) : Int {
    var sum = 0
    for (i in 1..num) {
        sum += i*i
    }
    return sum
}

fun squareOfSum(num : Int) : Int {
    var sum = 0
    for (i in 1..num) {
        sum += i
    }
    return sum*sum
}
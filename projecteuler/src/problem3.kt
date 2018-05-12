package projecteuler

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

fun problem3(number : Int) : Int {
    //return max(factors(number))
    return max(primeFactors(number))
}

fun max(ints : IntArray) : Int {
    //return ints.max() ?? TODO

    var max = 0
    for (i in ints) {
        if (i >= max) {
            max = i
        }
    }
    return max
}

fun factors(number : Int) : IntArray {
    //val arrayList = intArrayOf(1, 2, 5).toCollection(ArrayList())
    var myList: MutableList<Int> = mutableListOf<Int>()


    for (i in 1..number/2) {
        for (j in 1..number/2) {
            if (i * j == number) {
                myList.add(i)
                myList.add(i)
            }
        }
    }


    return myList.toIntArray()
}

fun primeFactors(number : Int) : IntArray {
    var factors = factors(number)
    var primes: MutableList<Int> = mutableListOf<Int>()
    for (f in factors) {
        if (isPrime(f)) {
           primes.add(f)
        }
    }
    return primes.toIntArray()
}

fun isPrime(number : Int) : Boolean {
    for (i in 2 until number/2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
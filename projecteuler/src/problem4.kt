package projecteuler

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

fun problem4() : Int? {
    var myList: MutableList<Int> = mutableListOf<Int>()

    for (i in 100..999) {
        for (j in 100..999) {
            var p = i * j
            if(isPalidrome(p)) {
                myList.add(p)
            }
        }
    }

    var max = maxInt(myList.toIntArray())
    return max
}

fun isPalidrome(num : Int) : Boolean {
    var s = num.toString()
    var reverse = s.reversed()
    return s == reverse
}

fun maxInt(nums : IntArray) : Int? {
    return nums.max()
}
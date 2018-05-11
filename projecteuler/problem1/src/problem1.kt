//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
package problem1

fun main(args : Array<String>) {
    var sum = multiplesBelow(1000)
    print(sum)

}

fun multiplesBelow(max:Int) : Int {
    var sum = 0;
    for(i in 1 until max) {
        if(i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    return sum;
}
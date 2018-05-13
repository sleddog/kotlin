package projecteuler

fun isPrime(n : Long) : Boolean {
    if (n <= 1) {
        return false
    } else if (n <= 3) {
        return true
    } else if (n%2 == 0L || n%3 == 0L ){
        return false
    }

    var i = 5
    while(i*i <= n) {
        if (n%i == 0L || n%(i+2)==0L) {
            return false
        }
        i += 6
    }
    return true
}
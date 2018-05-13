package projecteuler

fun longFactors(number : Long) : LongArray {
   var myList: MutableList<Long> = mutableListOf<Long>()
   var start = 1
   val end = (number / 2) - 1
   for (i in start..end) {
      if (number % i == 0L) {
         myList.add(i)
      }
   }

   return myList.toLongArray()
}

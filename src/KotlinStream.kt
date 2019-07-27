class KotlinStream {

    data class Result(val num: Int)

    enum class MyNumber(val num: Int) {
        ONE(1), TWO(2), THREE(3)
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // collect all odd numbers which are divisible by 3
            // sort them and finally change theme to Result
            val myList = listOf(9, 3, 1, 8, 2, 5, 6, 4, 7, 10)
            val results = myList.filter { it % 2 != 0 && it % 3 == 0 }.sorted().map { Result(it) }
            results.forEach { print("$it ") }

            println()
            // dimension downgrade 2 -> 1
            val matrix = listOf(listOf(1,2,3), listOf(4,5,6), listOf(7,8,9))
            val flatResult = matrix.flatMap { it }
            flatResult.forEach { print("$it ") }

            println()
            // calculate sum
            print(flatResult.fold(0) { acc, item -> acc + item})

            println()
            // assemble list/array to map
            val associatedResult = MyNumber.values().associate { Pair(it.name, it.num) }
            associatedResult.forEach { key, value -> print("$key:$value ") }

            println()
            // divide list into groups
            myList.sorted().groupBy { if (it % 2 == 0) "even" else "odd" }.forEach { key, value -> print("$key:$value ") }
        }
    }
}
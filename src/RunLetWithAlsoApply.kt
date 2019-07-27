class RunLetWithAlsoApply {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sumOf1to10 = run {
                var sum = 0
                for (i in 1..10) {
                    sum += i
                }
                sum
            }
            println("$sumOf1to10")
        }
    }
}
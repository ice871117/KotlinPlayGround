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

            var nullable: Int? = null
            nullable?.let {
                println("Counld not be run $it")
            }

            val list = MutableList(2) { 0 }.apply {
                add(3)
                add(4)
                add(5)
            }
//            val list = MutableList(5, {0}).also {
//                it.add(3)
//                it.add(4)
//                it.add(5)
//            }
            list.forEach {
                print("$it ")
            }

            println()
            print(with("abc") { toUpperCase() })
        }
    }
}
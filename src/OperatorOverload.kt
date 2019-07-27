data class OperatorOverload(var value: Int) {

    operator fun inc(): OperatorOverload {
        value += 2
        return this
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var ins = OperatorOverload(10)
            print("${ins++}")
        }
    }
}
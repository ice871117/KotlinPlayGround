class User(val name: String) {
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is User) {
            return false
        }
        return name == other.name
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val u = User("Mike")
            println(u.hashCode())
            println(u.myHashCode())
        }
    }
}

fun User.hashCode() = 42

fun User.myHashCode() = 42
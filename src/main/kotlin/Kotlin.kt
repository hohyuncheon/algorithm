class Main {
}

fun main(args: Array<String>) {
    println("Kotlin".joinToString2() )
}

fun String.joinToString2() : Char = get(length - 1)
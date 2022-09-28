import java.util.*

class 거품정렬 {
}

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 5, 8, 9, 2)

    var temp = 0
    for (i in arr.indices) {
        for (j in 1 until arr.size - i) {
            if (arr[j - 1] > arr[j]) {
                temp = arr[j - 1]
                arr[j - 1] = arr[j]
                arr[j] = temp
            }
        }
    }
    println(Arrays.toString(arr))
    println("test")
}
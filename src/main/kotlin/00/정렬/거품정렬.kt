import java.util.*

/*
 Bubble Sort
 1회전이 끝난 후, 배열의 마지막 위치에는 가장 큰 원소가 위치하며 정렬된다.

 장점
    구현이 매우 간단하고, 소스코드가 직관적이다.
    정렬하고자 하는 배열 안에서 교환하는 방식이므로, 다른 메모리 공간을 필요로 하지 않다. => 제자리 정렬(in-place sorting)
    안정 정렬(Stable Sort) 이다.

 단점
    시간복잡도가 최악, 최선, 평균 모두 O(n^2)으로, 굉장히 비효율적이다.
    정렬 돼있지 않은 원소가 정렬 됐을때의 자리로 가기 위해서, 교환 연산(swap)이 많이 일어나게 된다.
 */

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
}
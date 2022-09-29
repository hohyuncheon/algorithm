
/*
 Insertion Sort
 2번째 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후,
 원소를 뒤로 옮기고 지정된 자리에 자료를 삽입 하여 정렬하는 알고리즘이다.

 장점
    알고리즘이 단순하다.
    대부분의 원소가 이미 정렬되어 있는 경우, 매우 효율적일 수 있다.
    정렬하고자 하는 배열 안에서 교환하는 방식이므로, 다른 메모리 공간을 필요로 하지 않는다. => 제자리 정렬(in-place sorting)
    안정 정렬(Stable Sort) 이다.
    Selection Sort나 Bubble Sort과 같은 O(n^2) 알고리즘에 비교하여 상대적으로 빠르다.

 단점
    평균과 최악의 시간복잡도가 O(n^2)으로 비효율적이다.
    Bubble Sort와 Selection Sort와 마찬가지로, 배열의 길이가 길어질수록 비효율적이다.
 */

class 삽입정렬{
}

fun main(arg : Array<String>) {
    val arr = intArrayOf(7, 1, 5, 2, 15, 9)

    for (index in 1 until arr.size) {
        val temp = arr[index]
        var prev = index - 1
        while (prev >= 0 && arr[prev] > temp) {
            arr[prev + 1] = arr[prev]
            prev--
        }
        arr[prev + 1] = temp
    }
    println(arr.contentToString())
}
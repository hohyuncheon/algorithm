/*
 Selection Sort

장점
    Bubble sort와 마찬가지로 알고리즘이 단순하다.
    정렬을 위한 비교 횟수는 많지만, Bubble Sort에 비해 실제로 교환하는 횟수는 적기 때문에 많은 교환이 일어나야 하는 자료상태에서 비교적 효율적이다.
    Bubble Sort와 마찬가지로 정렬하고자 하는 배열 안에서 교환하는 방식이므로, 다른 메모리 공간을 필요로 하지 않는다. => 제자리 정렬(in-place sorting)

단점
    시간복잡도가 O(n^2)으로, 비효율적이다.
    불안정 정렬(Unstable Sort) 이다.
 */

class 선택정렬 {
}

fun main(args: Array<String>) {
    //1
    val arr = intArrayOf(1, 11, 8, 42, 2)

    var indexMin = 0
    var temp = 0

    for (i in 0 until arr.size - 1){
        indexMin = i
        for (j in i + 1 until arr.size){
            if (arr[j] < arr[indexMin]){
                indexMin = j
            }
        }
        temp = arr[indexMin]
        arr[indexMin] = arr[i]
        arr[i] = temp
    }

    print(arr.contentToString())
}

import math

class Solution:

    # Time Complexity: O(N*lon(N))
    def Second_largest(arr: list[int]) -> int:
        arr.sort(reverse=True)
        return (arr[1])

    # Time Complexity: O(N)
    def Faster_second_largest(arr: list[int]) -> int:
        first = second = -math.inf

        for i in arr:
            if i > first:
                second = first
                first = i
            elif i > second:
                second = i

        return (second)


    if __name__ == '__main__':
        arr = [2,5,7,5,6,3,9,4]

        print(Second_largest(arr))
        print(Faster_second_largest(arr))

class Solution:
    def smallestPositive(arr: list[int]) -> int:
        A = set(arr)
        ans = 1
        while ans in A:
            ans += 1
        return ans

    if __name__ == '__main__':
        arr = [1, 3, 6, 4, 1, 2]

        print(smallestPositive(arr))
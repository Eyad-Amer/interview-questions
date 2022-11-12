

from collections import defaultdict


class Solution:
    def maxNumberOfFamilies(n: int, reservedSeats: list[list[int]]) -> int:
        seats = defaultdict(set)

        for i,j in reservedSeats:
            if j in [2,3,4,5]:
                seats[i].add(0)
            if j in [4,5,6,7]:
                seats[i].add(0)
            if j in [6,7,8,9]:
                seats[i].add(0)
        
        res = 2 * n
        for i in seats:
            if len(seats[i]) == 3:
                res -= 2
            else:
                res -= 1

        return res

    
    if __name__ == "__main__":
        reservedSeats = [[1,2],[1,3],[1,8],[2,6],[3,1],[3,10]]
        n = 3
        print(maxNumberOfFamilies(n, reservedSeats))

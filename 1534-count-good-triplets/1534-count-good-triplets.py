class Solution:
    def countGoodTriplets(self, arr: List[int], a: int, b: int, c: int) -> int:
        triplets = combinations(arr,3)
        count = 0
        for triplet in triplets:
            if abs(triplet[0]-triplet[1]) <= a and abs(triplet[1]-triplet[2]) <= b and abs(triplet[0]-triplet[2]) <= c:
                count += 1
        return count
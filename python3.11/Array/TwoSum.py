from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]

# 클래스 인스턴스 생성
solution = Solution()

# 입력 받기
nums = list(map(int, input().split()))
target = int(input())

# twoSum 메서드 호출
result = solution.twoSum(nums, target)
print(result)

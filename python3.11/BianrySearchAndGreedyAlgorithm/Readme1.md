1. 이분 탐색(Binary Search)
- 이분 탐색은 정렬된 배열에서 특정한 값을 효율적으로 찾는 알고리즘입니다.
- 배열을 반으로 나누어 탐색 범위를 줄여가며 원하는 값을 찾습니다.
- 이분 탐색은 '결정 알고리즘(Decision Algorithm)'으로도 사용도히어, 조건을 만족하는 최적의 값(예: 최대값, 최소값)을 찾는 데 사용됩니다.
- 예제: 정렬된 배열에서 특정 값 찾기

```python
def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

print(binary_search([1, 2, 3, 4, 5, 6], 4))

```

2. 그리디 알고리즘(Greedy Algorithm)
- 그리디 알고리즘은 매 선택 시점에서 지역적으로 최적인 선택을 하는 방식입니다.
- 전체적인 최적해를 보장하지는 않지만, 특정 문제에서는 최적해를 제공할 수 있습니다.
- 간단하게 빠르게 문제를 해결할 수 있으나, 항상 최적의 결과를 보장하지는 않습니다.
- 예제: 거스름돈 문제(가장 큰 단위의 동전부터 사용하여 거스름돈을 만드는 문제)

```python
def min_coins(coins, amount):
    coins.sort(reverse = True)
    count = 0
    for coin in coins:
        count += amount // coin
        amount %=coin
    return count

print(min_coins([1,5,10,25],63))
```

이분 탐색은 주로 정렬된 데이터에서 특정 값을 빠르게 찾거나, 결정 문제에서 최적의 해를 찾는데 사용됩니다.
그리디 알고리즘은 매 순간 최적이라고 생각되는 선택을 하여 문제를 해결하는 데 사용됩니다.
이 두 알고리즘은 서로 다른 상황에서 유용하게 쓰이며, 문제의 특성을 잘 파악하여 적절한 알고리즘을 선택하는 것이 중요합니다.
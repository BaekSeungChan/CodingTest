
1. 시뮬레이션(Simulation)
- 시뮬레이션은 문제에서 제시된 상황이나 과정을 단계별로 직접 구현하여 해결하는 방식입니다.
- 문제에서 요구하는 로직이 복잡하거나 여러 단계를 거쳐야 할 때 사용합니다.
- 예제: 2차원 평면에서 로봇이 주어진 명령에 따라 움직이는 문제

```python
def simulate_robot(moves):
    x, y = 0, 0
    for move in moves:
        if move == 'U':
            y += 1
        elif move == 'D':
            y -= 1
        elif move == 'L':
            x -= 1
        elif move == 'R':
            x += 1
    return x, y

print(simulate_robot("UDLR"))


```


2. 구현(Implementation)
- 구현은 주어진 문제의 조건과 알고리즘을 코드로 옮기는 데 초점을 맞춥니다.
- 문제 해결을 위해 복잡한 알고리즘보다는 정확하고 세심한 코딩이 필요한 경우에 주로 사용됩니다.
- 예제 : 주어진 수열에서 홀수 번째 숫자들의 합을 구하는 문제
```python
def sum_of_odd_indices(arr):
    return sum(arr[i] for i in range(len(arr)) if i % 2 != 0)
print(sum_of_odd_indices([1,2,3,4,5,6]))
```

3. 완전 탐색(Brute Force)
- 완전 탐색은 가능한 모든 경우의 수를 일일이 확인하여 문제를 해결하는 방식입니다.
- 간단하지만, 경우의 수가 많을 때는 시간이 오래 걸릴 수 있습니다.
- 예제: 주어진 숫자의 모든 부분 집합(subset)을 구하는 문제
```python
def subsets(nums):
    result = [[]]
    for num in nums:
        result += [curr + [num] for curr in result]
        return result
print(subsets([1,2,3]))
```


숫자 판별 함수

- isdigit()
해당 문자열이 '숫자'로 이루어져 있는지 검사한다.
- isdecimal()
해당 문자열이 0~9까지의 수로 이루어진 것인지 검사한다. 다시 말해, int로 바로 변환할 수 있는 수인지를 검사한다.
- isnumeric()
numeric하다는 것은 좀 더 폭넓은 의미를 가진다. 이 함수는 '수로 볼 수 있는 것'인 경우 True로 반환
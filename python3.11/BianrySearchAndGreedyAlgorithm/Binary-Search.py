# 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수
#중 한 개의 수인 M인 주어지면 이분검색으로  M이 정렬된 상태에서 몇 번쨰에 있는지 구하는 프로그램을 작성

# 입력 예제 1
# 8 32
# 23 87 65 12 57 32 99 81
# 출력 예제 1
# 3


# 내가 작성한 답
# N, M = map(int, input().split())
#
# intList = list()
#
# for i in range(0,N):
#     a = int(input())
#     intList.append(a)
#
# intList.sort()
#
# for index, value in enumerate(intList):
#     if M == value:
#         print(index +1)
#         break

# 정답
n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
lt = 0
rt = n -1
while lt <=rt:
    mid = (lt+rt) //2
    if a[mid] == m:
        print(mid +1)
        break
    elif a[mid] > m:
        rt = mid -1
    else:
        lt = mid +1


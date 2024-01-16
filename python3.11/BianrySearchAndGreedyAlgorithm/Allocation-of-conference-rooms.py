# 회의실 배정(그리디)
# 한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들려고한다.
# 각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는
# 최대수의 회의를 찾아라. 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과
# 동시에 다음 회의가 시작할 수 있다.

# 이 단계에서 가장 좋은 걸로 고르면 된다. 그리디는 정렬과 같이 동반되는 경우가 많다.
# 회의가 끝나는 시간으로 정렬하는게 좋다.

n = int(input())
metting = []
for i in range(n):
    s, e = map(int, input().split())
    metting.append((s, e))
metting.sort(key=lambda x : (x[1], x[0]))
et = 0
cnt = 0

for s, e in metting:
    if s >= et:
        et=e
        cnt +=1
print(cnt)



# 회문 문자열 검사
# N개의 문자열 데이터를 입력받아 앞에서 읽을 때나 뒤에서 읽을 때나 같은 경우(회문 문자열)
# 이면 YES를 출력하고 회문 문자열이 아니면 NO를 출력하는 프로그램을 작성한다.
# 단 회문을 검사할 때 대소문자를 구분하지 않습니다.

# N = int(input()) 내가 작성한 답
# for i in range(0, N):
#     str = input()
#     lowerStr = str.lower()
#     sortStr = lowerStr[::-1]
#     if lowerStr == sortStr:
#         print("YES")
#     else:
#         print("NO")


# 답
n = int(input())
for i in range (n):
    s = input()
    s = s.upper()
    size = len(s)
    for j in range(size//2):
        if s[j] != s[-1-j]:
            print("#%d NO" %(i+1))
            break
    else:
        print("#%d YES" %(i+1))

# 다른 답
# n = int(input())
# for i in range (n):
#     s = input()
#     s = s.upper()
#     if s==s[::-1]:
#         print("#%d YES" %(i+1))
#     else:
#         print("$#%d NO" %(i+1))


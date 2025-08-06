S = input()
target = 'abcdefghijklmnopqrstuvwxyz'

for i in target:
    if i in S:
        print(S.index(i), end=' ')
    else:
        print(-1, end=' ')
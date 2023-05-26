from collections import defaultdict
n = int(input())

for i in range(n):
    result = []
    row = list(map(int, input().split()))
    for j in range(len(row)):
        if row[j] == 1:
            result.append(j + 1)
    print(len(result), *result)

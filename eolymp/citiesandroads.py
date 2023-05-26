n = int(input())

nroads = 0

for i in range(n):
    line = input().split()
    for j in range(i+ 1, n):
        if line[j] == "1":
            nroads += 1
            
print(nroads)

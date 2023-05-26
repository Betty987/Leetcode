from collections import defaultdict

x = int(input())
y = int(input())
graph = defaultdict(list)
for i in range(y):
    operation = list(map(int, input().split()))

    
    if operation[0] == 1:
        graph[operation[1]].append(operation[2])
        graph[operation[2]].append(operation[1])

    
    else:
        
        print(*graph[operation[1]])

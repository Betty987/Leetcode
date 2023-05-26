n = int(input())

sources = set(range(1, n + 1))
sinks = set(range(1, n + 1))

for i in range(n):
    row = list(map(int, input().split()))
    for j in range(n):
        if row[j]:
            if i + 1 in sinks:
                sinks.remove(i + 1)
            if j + 1 in sources:
                sources.remove(j + 1)

print(len(sources), *sources)
print(len(sinks), *sinks)

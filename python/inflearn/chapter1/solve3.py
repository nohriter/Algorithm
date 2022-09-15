n, k = map(int, input().split())
arr = sorted(map(int, input().split()))
sum = set()

for i in range(0, len(arr) - 2):
  for j in range(i + 1, len(arr) - 1):
    for m in range(j + 1, len(arr)):
      sum.add(arr[i]+arr[j]+arr[m])

sortList = sorted(list(sum))
print(sortList[-k])


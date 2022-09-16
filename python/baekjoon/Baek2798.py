N, M = map(int, input().split())
arr = sorted(map(int, input().split()))
result = 0

for i in range(0, len(arr) - 2):
  for j in range(i + 1, len(arr) - 1):
    for m in range(j + 1, len(arr)):
      if arr[i] + arr[j] + arr[m] > M:
        continue
      else:
        result = max(result, arr[i] + arr[j] + arr[m])

print(result)


T = int(input())
for t in range(T):
  N, e, s, k = map(int, input().split())
  arr = list(map(int, input().split()))
  print(t, sorted(arr[e - 1:s])[k - 1])


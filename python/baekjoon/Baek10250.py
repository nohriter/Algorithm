T = int(input())

for _ in range(0, T):
  H, W, N = map(int, input().split())

  floor = N % H;
  number = N // H;

  if floor == 0:
    print(H * 100 + number)
  else:
    print(floor * 100 + number + 1)

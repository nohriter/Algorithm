N = int(input())

tong = set()

for i in range(N):
  tong.add(input())

words = list(tong)

arr = []
for i in words:
  arr.append((len(i), i))

result = sorted(arr)

for lenWord, word in result:
  print(word)

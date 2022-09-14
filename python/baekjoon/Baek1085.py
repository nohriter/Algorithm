x, y, w, h = map(int, input().split())
a, b, c, d = x, w - x, y, h - y
min = a
if b < min: min = b
if c < min: min = c
if d < min: min = d

print(min)

s=input()
s1=""
for i in s:
  if i.isalpha():
    if i.islower():
      s1.append(i.upper())
    else:
      s1.append(i.lower())
  else:
      s1.append(i)
print(s1)

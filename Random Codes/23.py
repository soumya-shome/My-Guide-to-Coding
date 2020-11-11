def progression(l):
  if len(l) < 2:
    return(True)
  diff = l[1] - l[0]
  for i in range(2,len(l)):
    if l[i] - l[i-1] != diff:
      return(False)
  return(True)

from math import *

def factors(n):
  flist = []
  for i in range(1,n+1):
    if n%i == 0:
       flist.append(i)
  return(flist)

def isprime(n):
  return(factors(n) == [1,n])

def issquare(n):
  root = int(sqrt(n))
  return(n == root*root)

def sqpr(l):
  if len(l) < 1:
    return(True)
  elif issquare(l[0]):
    if len(l) == 1:
      return(True)
    else:
      return(prsq(l[1:]))
  else:
    return(False)

def prsq(l):
  if len(l) < 1:
    return(True)
  elif isprime(l[0]):
    if len(l) == 1:
      return(True)
    else:
      return(sqpr(l[1:]))
  else:
    return(False)

def primesquare(l):
  return(sqpr(l) or prsq(l))

def matrixflip(l,d):
  outl = []
  for row in l:
    outl.append(row[:])
  if d == 'h':
    for row in outl:
      row.reverse()
  elif d == 'v':
    outl.reverse()
  return(outl)
import ast

def parse(inp):
  inp = ast.literal_eval(inp)
  return (inp)

fncall = input()
lparen = fncall.find("(")
rparen = fncall.rfind(")")
fname = fncall[:lparen]
farg = fncall[lparen+1:rparen]

if fname == "progression":
  arg = parse(farg)
  print(progression(arg))

if fname == "primesquare":
  arg = parse(farg)
  print(primesquare(arg))

if fname == "matrixflip":
  (arg1,arg2) = parse(farg)
  savearg1 = []
  for row in arg1:
    savearg1.append(row[:])
  ans = matrixflip(arg1,arg2)
  if savearg1 == arg1:
    print(ans)
  else:
    print("Side effect")

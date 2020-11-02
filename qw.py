def maxaggregate(l):
  n=len(l)
  maximum=0
  a=[][]
  for i in range(n):
    name=l[i][0]
    a[0][0]=
    for j in range(1,n):
        if(name==l[j][0]):
            print("a=",l[j][0])
            score+=l[j][1]
            print("score",l[j][1])
            print("score1",score)
    if(score==80 or score==123):
        maximum=score
        a.append(name)
  return a
l=([('Kohli',73),('Ashwin',33),('Kohli',7),('Pujara',122),('Ashwin',90)])
maxaggregate(l)

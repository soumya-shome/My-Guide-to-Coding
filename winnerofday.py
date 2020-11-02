def winner(mat):
    t1=0
    t2=0
    for t in mat:
        if t=="Team1":
            t1+=1
        elif t=="Team2":
            t2+=1
    if t1==t2:
        return "Tie"
    elif t2>t1:
        return "Team 2"
    else:
        return "Team 1"

n=input("Enter :")
print(winner(n.split()))

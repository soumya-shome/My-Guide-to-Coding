# manually created
from django.http import HttpResponse
from django.shortcuts import render

def index(request):
    # return HttpResponse("Hello")
    params = {'name':'soumyadeep','place':'Mars'}
    return render(request,'index.html',params)


# def myLinks(request):
#     links = []
#     with open("Files/MyLinks.txt", 'r') as f:
#         links = [line.strip() for line in f.readlines()]
#     response = ""
#     for i in links:
#         response += "<a href="+str(i)+"> Link </a> </br>"
#     # print(response)
#     return HttpResponse(response)
#
# def about(request):
#     return HttpResponse("<h1>About Soumyadeep</h1>")

def removepunc(request):
    return HttpResponse("remove punc")


def capitalizefirst(request):
    return HttpResponse("capitalize first")


def newlineremove(request):
    return HttpResponse("newline remove")


def spaceremover(request):
    return HttpResponse("space remover")


def charcount(request):
    return HttpResponse("char count")
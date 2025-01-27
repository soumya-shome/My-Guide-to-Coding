# manually created
from django.http import HttpResponse
from django.shortcuts import render


def index(request):
    # return HttpResponse("Hello")
    params = {'name': 'soumyadeep', 'place': 'Mars'}
    return render(request, 'index.html', params)


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

def analyze(request):
    #Get the text
    djtext = request.GET.get('text', 'default')

    # Check checkbox values
    removepunc = request.GET.get('removepunc', 'off')
    fullcaps = request.GET.get('fullcaps', 'off')
    newlineremover = request.GET.get('newlineremover', 'off')
    extraspaceremover = request.GET.get('extraspaceremover', 'off')

    #Check which checkbox is on
    if removepunc == "on":
        punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
        analyzed = ""
        for char in djtext:
            if char not in punctuations:
                analyzed = analyzed + char
        params = {'purpose':'Removed Punctuations', 'analyzed_text': analyzed}
        return render(request, 'analyze.html', params)

    elif fullcaps== "on":
        analyzed = ""
        for char in djtext:
            analyzed = analyzed + char.upper()

        params = {'purpose': 'Changed to Uppercase', 'analyzed_text': analyzed}
        # Analyze the text
        return render(request, 'analyze.html', params)

    elif extraspaceremover== "on":
        analyzed = ""
        for index, char in enumerate(djtext):
            if not(djtext[index] == " " and djtext[index+1]==" "):
                analyzed = analyzed + char

        params = {'purpose': 'Removed NewLines', 'analyzed_text': analyzed}
        # Analyze the text
        return render(request, 'analyze.html', params)

    elif (newlineremover == "on"):
        analyzed = ""
        for char in djtext:
            if char != "\n":
                analyzed = analyzed + char

        params = {'purpose': 'Removed NewLines', 'analyzed_text': analyzed}
        # Analyze the text
        return render(request, 'analyze.html', params)
    else:
        return HttpResponse("Error")

# def capitalizefirst(request):
#     return HttpResponse("capitalize first")
#
#
# def newlineremove(request):
#     return HttpResponse("newline remove")
#
#
# def spaceremover(request):
#     return HttpResponse("space remover")
#
#
# def charcount(request):
#     return HttpResponse("char count")

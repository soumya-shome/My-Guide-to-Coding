# manually created
from django.http import HttpResponse
from django.shortcuts import render


def index(request):
    return render(request, 'index.html')


def analyze(request):
    djtext = request.POST.get('text', 'default')
    removepunc = request.POST.get('removepunc', 'off')
    fullcaps = request.POST.get('fullcaps', 'off')
    newlineremover = request.POST.get('newlineremover', 'off')
    extraspaceremover = request.POST.get('extraspaceremover', 'off')

    purpose = ''
    params = {'purpose': '', 'analyzed_text': ''}

    if removepunc == "on":
        punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
        analyzed = ""
        for char in djtext:
            if char not in punctuations:
                analyzed = analyzed + char
        djtext = analyzed
        purpose = 'Remove Punctuations'

    if fullcaps == "on":
        analyzed = ""
        for char in djtext:
            analyzed = analyzed + char.upper()
        djtext = analyzed
        purpose = purpose + ', Changed to Uppercase'

    if extraspaceremover == "on":
        analyzed = ""
        for index, char in enumerate(djtext):
            if not (djtext[index] == " " and djtext[index + 1] == " "):
                analyzed = analyzed + char
        djtext = analyzed
        purpose = purpose + ', Extra Space Remover'

    if newlineremover == "on":
        analyzed = ""
        for char in djtext:
            if char != "\n" and char != "\r":
                analyzed = analyzed + char
        djtext = analyzed
        purpose = purpose + ', Removed NewLines'

    if (newlineremover == "off") and (extraspaceremover == "off") and (fullcaps == "off") and removepunc == "off":
        return HttpResponse("Error")

    params = {'purpose': purpose, 'analyzed_text': djtext}

    return render(request, 'analyze.html', params)

#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
@author: maxschallwig
"""

#Data Source - http://www.seanlahman.com/baseball-archive/statistics/ 
#Stats for 2017

def readTxt():
    f = open("Sheet1E1.txt","r")
    data = {}
    
    for line in f:
        part1 = line.strip("\n").split(" ")
        dataName = part1[0]
        restData = part1[1:]

        finalData = []
        for x in restData:
            finalData.append(int(x))
            
        data[dataName] = finalData
        
    f.close()
    return data        
 
txtVersionData = readTxt()
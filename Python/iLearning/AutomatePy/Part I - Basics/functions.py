def hello():
    print('Hello there,\n How are you doing today')

#hello()

import random

def getAnswer(answerNumber):
    if answerNumber == 1:
        return 'It is certain'
    elif answerNumber == 2:
        return 'It is decidedly so'
    elif answerNumber == 3:
        return 'Yes'
    elif answerNumber == 4:
        return 'Reply Hazy try again'
    elif answerNumber == 5:
        return 'Ask again later'
    elif answerNumber == 6:
        return 'Concentrate and ask again'
    elif answerNumber == 7:
        return 'My reply is no'
    elif answerNumber == 8:
        return 'Outlook not so good'
    elif answerNumber == 9:
        return 'Very doubtful'


#r = random.randint(1,9)
#fortune = getAnswer(r)
#print(fortune, end='')
#print(getAnswer(random.randint(1,9)))
#print('cats','dogs','mice',sep=',')
#spam = print('Hello!')
#None == spam

def a():
    print('a() starts')
    b()
    d()
    print('a() returns')
def b():
    print('b() starts')
    c()
    print('b() returns')
def c():
    print('c() starts')
    print('c() returns')
def d():
    print('d() starts')
    print('d() returns')

    
a()

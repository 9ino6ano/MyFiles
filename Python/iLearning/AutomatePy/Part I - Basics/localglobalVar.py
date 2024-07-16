def spam():
    global eggs
    eggs = 'spam' #this is the global

def bacon():
    eggs = 'bacon' #this is a local

def ham():
    print(eggs) #this is the global

eggs = 42 #this is the global
spam()
print(eggs)

#Exveption Handling

def spam(divideBy):
    return 42 / divideBy

print(spam(2))
print(spam(12))
print(spam(0))
print(spam(1))

def spam(divideBy):
    try:
        return 42 / divideBy
    except ZeroDivisionError:
        print('Error: Invalid argument')

print(spam(2))
print(spam(12))
print(spam(0))
print(spam(1))
      

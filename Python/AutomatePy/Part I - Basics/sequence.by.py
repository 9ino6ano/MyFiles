name = "9ino6ano & 9ana6y"
name[0]
name[-2]
name[0:4]
'9i' in name
'6no' in name
'by' not in name
'6a' in name

#Sequence data types

#for i in name:
#    print('***'+i+'***')

#mutable and immutable data types (how string and lists objects are similar and different)
#name[7] = 'ec' #TypeError: 'str' object does not support item assignment
#proper way to mutate a string
newName = name[0:7] + 'o via azania' + name[8:17]
print(newName)

eggs = [1,2,3]
eggs = [4,5,6]

print(eggs)

basket = ('hello',42,0.5)
print(basket[0])
print(basket[1:3])
print(len(basket))
#basket[1] = 96
print(type(basket))
print(type('hello',))

#Converting types with the list() and tuple() functions
tuple(['fish','snail','shark',5,3])
list(('fish','snail','shark',5,3))
list('hello')

#references
spam = [0,1,2,3,4,5,6]
cheese = spam #The reference is being copied and not the list

print(cheese)
cheese[1] = 'hello' #This changes the list value
print(spam)
print(cheese) #The cheese var refers to the same list

print(id(newName))


milk = ['cat','dog','cows'] #Rhia creates a new list
print(id(milk))
milk.append('donkey') #append() modiefies the list "in-place"
print(id(milk)) #milk still refers to the same list as before
milk = ['cheese','flour','butter'] #This creates a new list, which has a new identitty
print(id(milk)) #milk now refers to a completely diiferent list
print('append(),extend(),remove(),sort(),reverse() and other list \n methods modify their lists in place.')
#Passing References
def eggs(someParameter):
    someParameter.append('Hello')

spam = [1,2,3]
eggs(spam)
print(spam)

#The copy modules copy() and deepcopy() functions

import copy
spam = ['A','B','C','D']
print(id(spam))
cheese = copy.copy(spam)
print(id(cheese)) #Cheese is a diiferent list with different identity.
cheese[1] = 42
print(spam)
print(cheese)

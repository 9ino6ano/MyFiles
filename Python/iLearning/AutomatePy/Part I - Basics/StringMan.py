#Validate input

while True:
    print('Please enter a number for your age.')
    age = input()
    if age.isdecimal():
        break
    print('Please enter the number of your age in years.')

while True:
    print('Please provide your updated password (letters and numbers only.):)')
    password = input()
    if password.isalnum():
        break
    print('Passwords must contain letters and nubmers only.')


#Splitting multi-line strings along new line charachters
spam = '''Dear Alice,
How have you been? I am fine.
There is a cntainer in the fridge
that is labeled "Milk Experiment."

Please do not drink it.
Sincerly,
Bob'''

print(spam.split('\n'))

#Splitting strings with the partition() method

print('Hello, world!'.partition('w'))
print('Hello, world!'.partition('world'))
print('Hello, world!'.partition('o'))
print('Hello, world!','',''.partition('XYZ'))

#Multiple assignment trick to assign 3 returned strings to 3 variables
before, sep, after = 'Hello, World'.partition(' ')
print(before)
print(after)

#Justifying Text with the rjust(), ljust() and center() Methods
print('Hello, world!'.rjust(10))
print('Hello, world!'.ljust(20))
print('Hello, world!'.rjust(10,'*'))
print('Hello, world!'.ljust(20,'+'))
print('Hello, world!'.center(20))
print('Hello, world!'.center(20,'='))

#picnicTable.py

def printPicnic(itemsDict, leftWidth, rightWidth):
    print('PICNIC ITEMS'.center(leftWidth + rightWidth, '-'))
    for k,v in itemsDict.items():
        print(k.ljust(leftWidth, '.') + str(v).rjust(rightWidth))

picnicItems = {'sandwiches': 4, 'apples': 12, 'cups': 4, 'cookies': 8000}
printPicnic(picnicItems, 12, 5)
printPicnic(picnicItems, 20, 6)
    
#Removing whitespace with the strip(), rstrip() and lstrip() methods
#sometimes you may want to strip off whitespace characters (space, tab and newlins) from the left , right or both sides of a string.
spam = '    Hello, World    '
print(spam.strip()) #both-side strip
print(spam.lstrip()) #left-side strip
print(spam.rstrip()) #right-side strip

spam = 'SpamSpamBaconSpamEggsSpamSpam'
print(spam.strip('ampS'))

#Numeric values of character with ord() and chr() functions

print(ord('A'))
print(ord('4'))
print(ord('!'))
print(chr(65))

print(ord('B'))
print(ord('A') < ord('B'))
print(chr(ord('A')))
print(chr(ord('A') + 1))
      



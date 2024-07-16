from math import *

print("9ino6ano Productions")
print("____________________")
print("=-=-=-Basic Program-=--=--")
name = input(" Please enter your name:")

age = int(input(" Please enter your age:"))

if age > 20:
    print(name + " You are eligible to vote")
else:
    print("Go to the\"Voting Station\"" + name)
print("_____________________________________")
print("Working With Strings")
character_name = input("name")
character_age = input("age")
print("The once was a man named " + character_name + ","+"\nHe was "+character_age+" years old.")

is_married = input("Please State whether you are married or not")
if is_married is False:
    print("Congratulations on your marriage")
    char_wife = input("Please enter your wife's name:")
    marr_dura = (input("Please state how long you've been married for:"))
    print(character_name + " had a wife name " + char_wife + "\nThey've been married for " + marr_dura + " years.")
else:
    print("You better have a plan for your future")
print("-----------------------------------")
Logo = "9ino6ano Productions"
print(Logo)
Phrase = (print(Logo.upper() + "\nIt's a central revolution"))
print(Logo.isupper())
print(Logo.islower())
print(len(Logo))
print(Logo[4])
print(Logo.index("P"))
print(Logo.replace("9ino6ano", "Elephant"))
print("++++++++++++++++++++++++++++++++++++")
print("Working with numbers (BODMAS)")
print(2+3)
print((10/2)*5+5-29)
print(10 % 3)
mynum = 5
print(str(mynum))
num_1 = 10
num_2 = 5
print("Result: " + str(num_1) + str(num_2))
num_3 = -5
print(abs(num_3))
print(min(num_3, num_2))
print(pow(num_3, num_2))
print(round(3.8))
print(ceil(3.8))
print(floor(3.8))
print(sqrt(36))



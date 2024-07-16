
print("Welcome to the choosing your own adventure game")
name = input("Please enter your name: ")
print("Welcome ",name," to this adventure!!!")

answer = input("You are on a dirt road , it has come to an end you can go left or right> : ")

if answer == 'left':
    answer = input("You come to a river and you can walk around or swim across?\nType walk to walk or swim to swim")
    if answer == 'swim':
        print("You swam across the river and got eaten by an aligator\nYou Lose!!!")
    elif answer == 'walk':
        print("You walked around for many miles and died of dehydration\nYou Lose!!!!")
    else:
        print("You have not selected a valid input!!!!")
elif answer == 'right':
    print("You ran into an oncoming train and commiting suicide\nYou Lose!!!!")
else:
    print("Not a valid option , you lose!!!!")


playing = input("Do you want to play? ")
print(playing)

if playing.upper() != 'YES':
    quit()

print("Okay! Let's play :)")
score = 0
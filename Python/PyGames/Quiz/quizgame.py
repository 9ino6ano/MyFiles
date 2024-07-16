print("Welcome to the quiz game")

playing = input("Do you want to play? ")
print(playing)

if playing.upper() != 'YES':
    quit()

print("Okay! Let's play :)")
score = 0

answer = input("What does CPU stand for?")
if answer == "central processing unit" or answer.upper() == "CENTRAL PROCESSING UNIT":
    print(answer + " ,is correct!!")
    score += 1
    print("Score: " + str(score))
else:
    print("Incorrect")
####
answer = input("What does CPU stand for?")
if answer == "central processing unit" or answer.upper() == "CENTRAL PROCESSING UNIT":
    print(answer + " ,is correct!!")
    score += 1
    print("Score: " + str(score))
else:
    print("Incorrect")
####
answer = input("What does RAM stand for?")
if answer == "central processing unit" or answer.upper() == "CENTRAL PROCESSING UNIT":
    print(answer + " ,is correct!!")
    score += 1
    print("Score: " + str(score))
else:
    print("Incorrect")
#####
answer = input("What does GPU stand for?")
if answer == "central processing unit" or answer.upper() == "CENTRAL PROCESSING UNIT":
    print(answer + " ,is correct!!")
    score += 1
    print("Score: " + str(score))
else:
    print("Incorrect")
###
answer = input("What does BIOS stand for?")
if answer == "basic input output system" or answer.upper() == "BASIC INPUT OUT SYSTEM":
    print(answer + " ,is correct!!")
    score += 1
    print("Score: " + str(score))
else:
    print("Incorrect")
answer = input("What does POST stand for?")
if answer == "power on self test" or answer.upper() == "POWER ON SELF TEST":
    print(answer + " ,is correct!!")
    score += 1
    print("Score: " + str(score))
else:
    print("Incorrect")

print("You got " + str(score) + " questions correct !!!")
print("You got " + str((score/4)*100) + " %")


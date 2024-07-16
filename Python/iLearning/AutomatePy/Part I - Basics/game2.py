#This is a guessing a number game.
import random
secretNumber = random.randint(1,20)
print('I am thinking of a number between 1 and 20 ?')

#Ask the player to guess the number 6 times.
for guessesTaken in range(1,7):
    print('Take a guess.')
    guess = int(input())

    if guess < secretNumber:
        print('Your guess is too low.')
    elif guess > secretNumber:
        print('Your guess is too high')
    else:
        break  #This condition is the correct guess!!

    if guess == secretNumber:
        print('Good Job!!\nYou guessed the number in ' + str(guessesTaken) + ' guesses.')
    else:
        print('Nope. \n Unfortunately the nubmer I was thinking of was '+ str(secretNumber))


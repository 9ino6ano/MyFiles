import random, sys

print('ROCK, PAPER, SCISSORS')

#These variables keep track of the number of wins, lossses and ties

wins = 0
losses = 0
ties = 0

while True: #This is the main game loop
    print('%s Wins, %s Losses , %s Ties' % (wins, losses, ties))
    while True: #The player input loop
        print('Enter your move: (r) - rock (p) - paper (s) - scissors')
        playerMove = input()
        if playerMove == 'q':
            sys.exit() # This will quit the program.
        if playerMove == 'r' or playerMove == 'p' or playerMove == 's':
            break # This will break out of the player input loop
        print('Type one of r, p, s or q (quit)')

    #Display what the player chose:
    if playerMove == 'r':
        print('Rock VS ...')
    elif playerMove == 'p':
        print('Paper VS ...')
    elif playerMove == 's':
        print('Scissors VS ...')

    #Display what the computer chose:
    randomNumber = random.randint(1, 3)
    if randomNumber == 1:
        computerMove = 'r'
        print('Rock')
    elif randomNumber == 2:
        computerMove = 'p'
        print('Paper')
    elif randomNumber == 3:
        computerMove = 's'
        print('Scissors')

    #Display and record the win/loss/tie
    if playerMove == computerMove:
        print('It is a tie!!')
        ties = ties + 1
    elif playerMove == 'r' and computerMove == 's':
        print('You Win!!!')
        wins = wins + 1
    elif playerMove == 'p' and computerMove == 'r':
        print('You Win!!!')
        wins = wins + 1
    elif playerMove == 's' and computerMove == 'p':
        print('You Win!!!')
        wins = wins + 1
    elif playerMove == 'r' and computerMove == 'p':
        print('You lose???')
        losses = losses + 1
    elif playerMove == 'p' and computerMove == 's':
        print('You lose???')
        losses = losses + 1
    elif playerMove == 's' and computerMove == 'r':
        print('You lose???')
        losses = losses + 1
    else:
        print('Please enter the correct value between r, p or s')
        


        
        

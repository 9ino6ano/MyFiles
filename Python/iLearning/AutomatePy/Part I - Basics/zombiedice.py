#Zombie Dice has a push-your-luck game mechanic: the more you reroll the dice, the more brains you can get,
#but the more likely you`ll eventually accrue three shotguns and lose everything.
#https://github.com/asweigart/zombiedice/
import zombiedice

class MyZombie:
    def __init__(self, name):
        #All zombies must have a name:
        self.name = name

    def turn(self, gameState):
        #gameState is a dict with info about the current state of the game.
        #You can choose to ignore it in your code.

        diceRollResults = zombiedice.roll() #first roll
        #roll() returns a dictionary keys 'brains','shotgun'and 'footsteps'
        #with how many rolls of each type where were.
        #The 'rolls' key is a list of (color, icon) tuples with the exact roll result informatin
        """
            Example of a roll() return value:
            {'brains': 1, 'footsteps': 1, 'shotgun': 1,
            'rolls': [('yellow','brains'),('red','footsteps'),
            ('green', 'shotgun')]}
        """
        #REPLACE THIS ZOMBIE CODE WITH YOUR OWN
        brains = 0
        while diceRollResults is not None:
            brains += diceRollResults['brains']

            if brains < 2:
                diceRollResults = zombiedice.roll() #roll again
            else:
                break
        
        
zombies = (zombiedice.examples.RandomCoinFlipZombie(name='Random'),
           zombiedice.examples.RollsUntilTheLeadZombie(name='Until Leading'),
           zombiedice.examples.MinNumShotgunsThenStopsZombie(name='Stop at 2 Shotguns', minShotguns=2),
           zombiedice.examples.MinNumShotgunsThenStopsZombie(name='Stop at 1 Shotgun', minShotguns=1),
           MyZombie(name='My Zombie Bot'),
            #Add any other zombie player here.
           )
#Uncomment one of the following lines to run CLI or GUI mode:
#zombiedice.runTournament(zombies=zombies, numGames=1000)
zombiedice.runWebGUI(zombies=zombies, numGames=1000)



#Using the while loop
"""
i = 1
while i <= 10:
    print(i)
    i += 1
print("Done with loop")
"""
#Buitlding a guessing game using if statements, loops
"""
secret_word = "9ino6ano"
guess = ""
guess_count = 0
guess_limit = 3
out_of_guesses = False

while guess != secret_word and not out_of_guesses:
    if guess_count < guess_limit:
        guess = input("Enter guess: ")
        guess_count += 1
    else:
        out_of_guesses = True

        if out_of_guesses:
            print("Out of Guesses, You LOSE!!!!")
        elif guess == secret_word:
            print("You Win!!!")
        else:
            print("The End Of The Game.\nGAME OVER!!!")
"""
#How do we use the for loop
#Using Letters
"""
for letter in "9ino6ano":
    print(letter)
"""

#Using Lists
#Using ranges determines where exactly to start the iteration.

friends = ["Jim", "Karen", "Kevin"]
for index in range(3, 10):
    print(index)
print("The length is: " + str(len(friends)))

for index2 in range(len(friends)):
    print(friends[index2])

for index3 in range(5):
    if index3 == 0:
        print("first interation")
    else:
        print("Not First")
number_grid = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [0]
]
#use different scenarios and make these loops more complex
print(number_grid)







#Using the exponent function
print("Exponents")
print("2^3 = " + str(2**3))


"""
def raise_to_power(base_num, pow_num):
    result = 1
    for index in range(pow_num):
        result = result * base_num
    return result


print(raise_to_power(3, 4))
"""
#2D lists and nested loops
#this is a 2D lists of 4 4 rows 3 columns
"""
number_grid = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [0],
]

print(number_grid[1][1])
#using a nested loop
for row in number_grid:
    for col in row:
        print(col)
"""
#Building a langauge translater
#Giraffe Langauge (Vowels -> g)
#Silista (Vowels a = (U) | e = (O) | i = (I) | o = (E) | u = (A))
#Use string manipulation

"""
def lan_translator(phrase):
    translation = ""
    for letter in phrase:
        if letter in "AEIOUaeiou":
            if letter.isupper():
                translation = translation + "X"
            else:
                translation = translation + "x"
        else:
            translation = translation + letter
    return translation

print(lan_translator(input("Enter A Phrase: ")))
"""

try:
    value = 10 / 0
    number = int(input("Please enter a number ?"))
    print(number)
except ZeroDivisionError as err:
    print(err)
except ValueError:
    print("Invalid Input")

print("Tuples are just like list, which do not change (emmudable) after being created.")
coordinates = [(4, 5), (1, 2), (7, 8), (6, 9)]
print(coordinates[0])
print("How do we use function in, python.\n Which is a collection of code")

"""
def say_hi():
#All code inside the function needs to be indented, any other code is considered to be outside the function
    print("Hello, Welcome TO Python Tutorials\n")
    name = input("Please tell us your name ? ")
    print("Hello "+name+" , Please enjoy your touring...")


print("Top")
say_hi()
print("Bottom")


def say_hii(name):
    print("What's up ? " + name + "\nWhat do you want to do?")
    quote = input()
    print(quote)


say_hii(input())
say_hii(input())


def say_hiii(name, age, salary):
    print("Hello "+name+" , You are "+age+" years old &\n Your Average Salary is R"+salary+" .\n")
    print("What's your favourite personal Quoute ? : ")
    quo = input()
    print("My name is "+name+", I believe in......\n" + quo)
"""
"""
print("=-=-=-=-=-=-=-=-=--")
name1 = input("Please enter your name: ")
age1 = input("Please enter your age")
salary1 = input("Please specify your pay amount: ")
print("=-=-=-=-=-=-=-=-=--")
say_hiii(name1, age1, salary1)
name2 = input("Please enter your name: ")
age2 = input("Please enter your age")
salary2 = input("Please specify your pay amount: ")
say_hiii(name2, age2, salary2)
print("---------------------------------------")
"""

""""
def cube(num):
    return num * num * num


result = cube(5)
print(cube(3))
print(result)
"""
print("If Statements")
is_Male = True
is_tall = True
#Using the and / or keywords with if statements

if is_Male and is_tall:
    print("You are a male and tall or both\n")
elif is_Male and not (is_tall):
    print("You are a short male\n")
elif is_tall and not (is_Male):
    print("You are not a male, but you are tall\n")
else:
    print("You are not a male and not tall")


def max_num(num1, num2, num3):
    if num1 >= num2 and num1 >= num3:
        return num1
    elif num2 >= num1 and num2 >= num3:
        return num2
    else:
        return num3

print(max_num(30, 400, 5000))


def alpha_num(dog, cat, bird):
    if dog == cat and dog == bird:
        return dog
    elif cat == dog and cat >= bird:
        return cat
    else:
        return bird
dog = "dog"
cat = "cat"
bird = "bird"
print(alpha_num(dog, cat, bird))
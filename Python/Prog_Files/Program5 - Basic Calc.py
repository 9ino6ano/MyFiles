#building a basic calculator app, which performs all arithmetic operations
num1 = float(input("Please enter the 1st Number ? : "))
op = input("Please specify the maths operation to perform ? : ")
num2 = float(input("Please enter the 2nd Number ? : "))
"""
if op == "+":
    print(num1 + num2)
elif op == "-":
    print(num1 - num2)
elif op == "/":
    print(num1 / num2)
elif op == "*":
    print(num1 * num2)
elif op == "%":
    print(num1 % num2)
else:
    print("Invalid operator entered....")
"""
print("Using the dictionary in python")
#You can use these dictionaries with lists or numbers
#
monthConversions = {
    "Jan": "January",
    "Feb": "January",
    "Mar": "January",
    "Apr": "January",
    "May": "January",
    "Jun": "January",
    "Jul": "January",
    "Aug": "January",
    "Sep": "January",
    "Oct": "January",
    "Nov": "November",
    "Dec": "December",
}
print(monthConversions.get("Luv"))
print(monthConversions.get("Sos"))
print(monthConversions.get("Dec"))
print(monthConversions.get("Luv", "Not A Valid Key"))

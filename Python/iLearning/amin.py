# loop control statements
#(break = terminate the entire loop, continue = skips to the next iteration on the loop,pass = does nothing, acts as a place holder)

#while True:
#    name = input("Enter your name ?")
#   if name != "":
#        break

#phone_number = "123-456-7879"

#for i in phone_number:
#   if i == "-":
#        continue
#    print(i,end="")
#for i in range(1,21):
#    if i == 13:
#        pass
#   else:
#        print(i)
# list = used to store multiple items in a single variable
#food = ["granadilla","apples","bananas","grapes","oranges","watermelons"]
#print(food[5])
#food[0] = "apples"
#print(food[0])
#food.append("ice cream")
#food.remove("apples")
#food.pop()
#food.insert(0,"cake")
#food.sort()
#food.clear()

#for x in food:
#    print(x)
#multi-dimensional listss (2D lists)
drinks = ["coffee","soda","juice"]
dinner = ["pizza","hamburger","hotdog"]
desert = ["cake","ice cream","sweets"]

food = [drinks,dinner,desert]

print(food[1][2])
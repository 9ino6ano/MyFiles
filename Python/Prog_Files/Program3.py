print("Working with lists in python")
friends = ["Kevin", "Karen", "Jim", "Tom","Jim", "Daniel", "James", "Kelly"]
friends_of_friends = ["Sindy", "Natasha", "Michelle", "Lindsey", "Jennifer", "Cloe"]
Age = [20, 25, 30, 35, 40, 45]
Age_of_ages = [50, 55, 60, 65, 70, 75]
print("indexing [positive, negatives elements][1:3]\n[Sorting,Remove,Insert,Pop]")
print(friends + Age)
print(friends[-2])
print(friends[1:4])
friends[1] = '9ino6ano'
print(friends[1])
print("___________Using Functions with lists__________")
print("[extend, append,reverse,remove,clear,indexOf]")
print(friends)
friends.extend(friends_of_friends)
print(Age)
Age.extend(Age_of_ages)
friends.append('Bobby')
friends_of_friends.insert(1, "Kelly")
print(friends)
friends.extend(friends_of_friends)
print(Age)
Age.extend(Age_of_ages)
print(friends_of_friends)
Age.pop()
print(Age)
print(friends.count("Kevin"))
friends2 = friends_of_friends.copy()

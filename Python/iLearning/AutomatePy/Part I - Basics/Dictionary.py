#The dictionary data type

myCat = {'size': 'fat','color':'gray','disposition':'loud'}

print(myCat['size'])

print('My cat has '+ myCat['color'] + 'fur.')

spam = {12345: 'Luggage Combination',42: 'The Answer'}

#Dictionaries vs Lists
# Unlike lists, items in dictinaries are unordered. The first item in a list
#named spam would be spam[0]. But there is no "first" item in a dictionary.

spam = ['cats','dogs','moose']
bacon = ['dogs','moose','cats']
spam == bacon
#The ans = False

eggs = {'name': 'Zophie','species': 'cat','age':'8'}
ham = {'species':'cat', 'age': '8', 'name': 'Zophie' }
eggs == ham
#The ans = True

spamm = {'name': 'Zophie', 'age': 7}
spam['color'] #TypeError: list indices must be integers or slices, not str


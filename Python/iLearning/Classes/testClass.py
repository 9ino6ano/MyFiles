class Person:
    """
    using class attributes, this att does not use self and it's not specific to any instance of a class
    you can access/change its value using the class itself not the instance of that class e.g Person.number_of_people
    """
    number_of_people = 0
    Gravity = -9.8

    def __init__(self, name):
        self.name = name
        Person.add_person()

    @classmethod
    def number_of_people_(cls):
        return cls.number_of_people

    @classmethod
    def add_person(cls):
        cls.number_of_people += 1


p1 = Person("9ino")
#print(p1.number_of_people)
p2 = Person("6ano")
#print(p2.number_of_people)
print(Person.number_of_people_())

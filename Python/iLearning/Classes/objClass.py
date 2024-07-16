class Pet:

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show(self):
        print(f"I am {self.name} and I am {self.age} years old.")

    def speak(self):
        print("I dont know what I say")

class Cat(Pet):

    def __init__(self, name, age, color):
        super().__init__(name, age)
        self.color = color


    def speak(self):
        print("Meow")


    def show(self):
        print(f"I am {self.name} and I am {self.age} years old and I have a {self.color} color.")


class Dog(Pet):
    def speak(self):
        print("bark")


class Fish(Pet):
    pass


p = Pet("Tim", 14)
p.show()
p.speak()
c = Cat("Kim", 24, "red")
c.show()
c.speak()
d = Dog("Jim", 34)
d.show()
d.speak()
f = Fish("Liz", 44)
f.  show()
f.speak()
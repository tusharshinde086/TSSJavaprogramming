package chapter2;

class Animal {
    String name;

     Animal(String name) {

         this.name = name;
    }

     void eat() {
         System.out.println(name + " is eating.");
      }
}

class Dog extends Animal {

    String breed;

     Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

     void bark() {
        System.out.println(name + " is barking.");
         System.out.println(breed + " is barking.");
    }
}

class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.eat();
        dog.bark();
    }
}


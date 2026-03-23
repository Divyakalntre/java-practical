class Animal {
    // Static block (1)
    static {
    System.out.println("Animal static block");
    }

    // Default constructor
    Animal() {
    System.out.println("Animal constructor");
    }

    // Parameterized constructor
    Animal(String name) {
    System.out.println("Animal name: " + name);
    }

    void sound() {
    System.out.println("Animal makes sound");
    }

    void eat() {
    System.out.println("Animal eats");
    }
}

// Single + Multilevel Inheritance
class Dog extends Animal {
    // Static block (2)
    static {
    System.out.println("Dog static block");
    }

    Dog() {
    super("tommy"); // calling parent constructor
    System.out.println("Dog constructor");
    }

    // Method overriding
    void sound() {
    System.out.println("Dog barks");
    }

    void bark() {
    System.out.println("Dog is barking");
    }
}

// Multilevel continuation
class Puppy extends Dog {
 void weep() {
 System.out.println("Puppy weeps");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
 // Static block (3)
 static {
 System.out.println("Cat static block");
    }

void meow() {
 System.out.println("Cat meows");
    }
}

// Main class
class Inheritance {
    public static void main(String args[]) {

System.out.println("---- Single Inheritance ----");
        Dog d = new Dog();
        d.eat();
        d.sound(); // overridden
        d.bark();
System.out.println("\n---- Multilevel Inheritance ----");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

System.out.println("\n---- Hierarchical Inheritance ----");
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
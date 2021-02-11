---
marp: true
theme: gaia
class: lead
paginate: true
backgroundImage: url('hero-background.jpg')
header: '**Preparation Java**'
footer: Taha Bouhsine

---

# Java SMI5  

![bg right](coffee.gif)

## Join this link

[https://app.sli.do/event/ex3esarj]

---

## Class

---

    public class Dog {
        String breed;
        int age;
        String color;

        void barking() {
        }

        void hungry() {
        }

        void sleeping() {
        }
    }

---

## Variable types

---

* **Local variables**: Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.

* **Instance variables**: Instance variables are variables within a class but outside its methods. These variables are initialized when the class is instantiated. Instance variables can be accessed from inside any method, constructor or blocks of that particular class.

* **Class variables**: Class variables are variables declared within a class, outside any method, with the static keyword.

---

## Constructors

---

        public class Puppy {
            public Puppy() {
            }

            public Puppy(String name) {
                // This constructor has one parameter, name.
            }
        }

---

## Creating an Object

---

* **Declaration**: A variable declaration with a variable name with an object type.

* **Instantiation**: The 'new' keyword is used to create the object.

* **Initialization** − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.

---

    public class Puppy {
        public Puppy(String name) {
            // This constructor has one parameter, name.
            System.out.println("Passed Name is :" + name );
        }

    public static void main(String []args) {
            // Following statement would create an object myPuppy
            Puppy myPuppy = new Puppy( "tommy" );
        }
    }

---

## Accessing Instance Variables and Methods

---

    /* First create an object */
    ObjectReference = new Constructor();

    /* Now call a variable as follows */
    ObjectReference.variableName;

    /* Now you can call a class method as follows */
    ObjectReference.MethodName();

---

        public class Puppy {
            int puppyAge;

            public Puppy(String name) {
                // This constructor has one parameter, name.
                System.out.println("Name chosen is :" + name );
            }

            public void setAge( int age ) {
                puppyAge = age;
            }

            public int getAge( ) {
                System.out.println("Puppy's age is :" + puppyAge );
                return puppyAge;
            }

            public static void main(String []args) {
                /* Object creation */
                Puppy myPuppy = new Puppy( "tommy" );

                /* Call class method to set puppy's age */
            myPuppy.setAge( 2 );

                /* Call another class method to get puppy's age */
                myPuppy.getAge( );

                /* You can access instance variable as follows as well */
                System.out.println("Variable Value :" +     myPuppy.puppyAge );
            }
        }

---

## No argument Constructors

---

        Public class MyClass {
            Int num;
            MyClass() {
                num = 100;
            }
        }

---

## Parameterized Constructors

---

    // A simple constructor.
    class MyClass {
        int x;
    
        // Following is the constructor
        MyClass(int i ) {
            x = i;
        }
    }

---

## Primitive Data Types

---

    char c;
    boolean b; 
    double d; 
    float f; 
    long l; 
    int i;
    short sh; 
    byte by;

---

## Reference Datatypes

---

Class definded by you

---

## Local Variables

---

    public class Test {
        public void pupAge() {
            int age = 0;
            age = age + 7;
            System.out.println("Puppy age is : " + age);
        }

        public static void main(String args[]) {
            Test test = new Test();
            test.pupAge();
        }
    }

---

## Instance Variables

---

    import java.io.*;
    public class Employee {

        // this instance variable is visible for any child class.
        public String name;

        // salary  variable is visible in Employee class only.
        private double salary;

        // The name variable is assigned in the constructor.
        public Employee (String empName) {
        name = empName;
        }

        // The salary variable is assigned a value.
        public void setSalary(double empSal) {
        salary = empSal;
        }

        // This method prints the employee details.
        public void printEmp() {
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
        }

        public static void main(String args[]) {
        Employee empOne = new Employee("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
        }
    }

---

## Class/Static Variables

---

    import java.io.*;
    public class Employee {

        // salary  variable is a private static variable
        private static double salary;

        // DEPARTMENT is a constant
        public static final String DEPARTMENT = "Development ";

        public static void main(String args[]) {
            salary = 1000;
            System.out.println(DEPARTMENT + "average salary:" + salary);
        }
}

---

## Access Control Modifiers

---

* Visible to the package, the default. No modifiers are needed.
* Visible to the class only (private).
* Visible to the world (public).
* Visible to the package and all subclasses (protected).

---

![bg width: 70%](encap_difference.png)

---

## Non-Access Modifiers

---

* The static modifier for creating class methods and variables.

* The final modifier for finalizing the implementations of classes, methods, and variables.

* The abstract modifier for creating abstract classes and methods.

* The synchronized and volatile modifiers, which are used for threads.

---

## The Arithmetic Operators

---

## Relational Operators

---

## Bitwise Operators

---

## Logical Operators

---

## Assignment Operators

---

## Loop

---

    int [] numbers = {10, 20, 30, 40, 50};
    for(int x : numbers ) {
        System.out.print( x );
        System.out.print(",");
    }

---

    String [] names = {"James", "Larry", "Tom", "Lacy"};

    for( String name : names ) {
        System.out.print( name );
        System.out.print(",");
    }

---

## Conditional Statement

---

        if(condition1)
    {  
        //code for if condition1 is true  
    }
    else if(condition2)
    {  
        //code for if condition2 is true  
    }  
    else if(condition3)
    {  
        //code for if condition3 is true  
    }  
    else
    {  
        //code for all the false conditions   
    }    

---

    Exp1 ? Exp2 : Exp3;

---

## Methods

---

    return-type methodName(parameter-list)
    {
    //body of method
    }

---

## Java is Strictly Pass by Value

---

## Iheritance: IS-A Relationship

---

    public class Animal {
    }

    public class Mammal extends Animal {
    }

    public class Reptile extends Animal {
    }

---

## Aggregation: HAS-A relationship

---

    public class Vehicle{}
    public class Speed{}

    public class Van extends Vehicle {
        private Speed sp;
    }

---

![bg width:700](iheritance.jpg)

---

## Polymorphism

---

### Overriding

---

    class Animal {
        public void move() {
            System.out.println("Animals can move");
            }
    }

    class Dog extends Animal {
        public void move() {
            System.out.println("Dogs can walk and run");
        }
        public void bark() {
            System.out.println("Dogs can bark");
        }
    }

    public class TestDog {

        public static void main(String args[]) {
            Animal a = new Animal();   // Animal reference and object
            Animal b = new Dog();   // Animal reference but Dog object

            a.move();   // runs the method in Animal class
            b.move();   // runs the method in Dog class
            b.bark();
        }
    }

---

### super Keyword

---

    class Animal {
        public void move() {
            System.out.println("Animals can move");
        }
    }

    class Dog extends Animal {
        public void move() {
            super.move();   // invokes the super class method
            System.out.println("Dogs can walk and run");
        }
    }

    public class TestDog {
        public static void main(String args[]) {
            Animal b = new Dog();   // Animal reference but Dog object
            b.move();   // runs the method in Dog class
        }
    }

---

## Abstraction

---

    public abstract class Employee {
        private String name;
        private String address;
        private int number;
        
        public abstract double computePay();
        // Remainder of class definition
    }

---

    public class Salary extends Employee {
        private double salary;   // Annual salary
        
        public double computePay() {
            System.out.println("Computing salary pay for " + getName());
            return salary/52;
        }
        // Remainder of class definition
    }

---

Declaring a method as abstract has two consequences:

* The class containing it must be declared as abstract.

* Any class inheriting the current class must either override the abstract method or declare itself as abstract.

---

## References
[https://www.tutorialspoint.com/java/java_quick_guide.htm]
[https://www.studytonight.com/java/overview-of-java.php]
[BOOK: Head First Java, 2nd Edition]
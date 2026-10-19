# Reg-Rhys_Treyvon_Casting
Java lesson on Casting to class.

##Primitive Type Casting
  ## Widening Casting(automatic
   - occurs when a smaller data type is converted into a larger data type automatically by      the compiler
  ```java
  int num = 10;
  double data = num; // int is automatically converted to double
  ```
  ## Narrowing Casting(Manual)
   - Used when converting a larger data type to a smaller one
   - may result in data loss.
   - Must explicitly specify the target type using parentheses.
  ```java
  double num = 10.99;
  int data = (int) num; // double is manually converted to int, decimal part is lost
  ```
  ## Reference Type Casting (Objects)
   ##Upcasting
   - Upcasting is casting a subclass object to a superclass type
   - usually done implicitly(automatic)
   - safe because the subclass is always an instance of the super class
  ```java
    class Dinosaur {}
    class Stegosaurus extends Dinosaur {}
    Dinosaur myDino = new Stegosaurus(); // implicit upcasting
  ```
  ##Downcasting
  - converts a superclass reference back to a subclass type.
  - must be done explicitly
  - can throw a classCastException if the object is not a instance of the subclass
  ```java
    Animal myAnimal = new Dog();
    Dog myDog = (Dog) myAnimal; // explicit downcasting
  ```
    



 
  
     





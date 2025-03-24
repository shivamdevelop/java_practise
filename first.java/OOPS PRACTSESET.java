//  Basic OOP Concepts
// Create a class Car: Define fields for make, model, year, and price.
//  Provide a constructor to initialize these fields, and define a method displayDetails() that prints out the car details.


// Create a class Book: Define fields for title, author, and price. 
// Implement a constructor to initialize the values, and a method applyDiscount(double discount) that applies a discount 
// to the price.


// class car {
//     public String make;
//     public String model;
//     public int year;
//     private int price;
 

//     public int getprice(){return price;}
//     public void setprice(int price){this.price=price;}
    
//     car(String make,String model,int year,int price){
//         this.make=make;
//         this.model=model;
//         this.year=year;
//         this.price=price;
//     }

//     void displayDetails(){
//         System.out.println("THIS CAR HAS BEEN MADE BY"+" "+this.make+" "+"MODE OOF THIS CAR IS"+" "+this.model+"AND YEAR IS"+" "+this.year+" "+"AND PRICE OF THR CAR IS"+" "+this.price);
//     }
// }

//   class main{
//     public static void main(String[] args) {
//         car c1=new car("TATA", "ZX", 2024, 15000000);
//         c1.displayDetails();

//     }
// }    //   above code shows the object,method and encapsulation



                                      // Encapsulation

// Create a class Employee: Define private fields for name, salary, and designation.
// Provide getter and setter methods for these fields. Write a method displayEmployeeInfo() that prints the employee’s
// details.


// Create a class Student: Define private fields name, age, and grade. Implement the necessary getter and setter methods.
// In the setter for age, ensure it’s always greater than 0.

//  class Employee{
//     private String name;
//     private double salary;
//     private String designation;

//      public double getsalary(){return salary;}
//      public void setsalary(double salary){this.salary=salary;}

//      public String getdesignation(){return designation;}
//      public void setdesignation(String designation){this.designation=designation;}

//      void  displayEmployeeInfo(){
//         System.out.println(this.designation+ " "+this.name+" "+this.salary);
//      }
// }


// class show{
//     public static void main(String[] args) {
//        Employee m=new Employee();
//        m.setdesignation("ghaziabad");
//        m.setsalary(0);
//     }
// }





                    //  Constructor  &  Constructor Overloading
                    //  Create a class Book with three constructors:
                    //  A constructor that takes no arguments and initializes the title to "Unknown" and price to 0.
                    //  A constructor that takes the title and price.
                    //  A constructor that takes title, author, and price.


    class Book{
        Book(){
            System.out.println( " I am hindi");
        };


        public  String title;
        public   int price;
        
        Book(String title ,int price){
            this.title=title;
            this.price=price;
        };

        public String author;
        Book(String author,String title ,int price){
            this(title,price);
            this.author=author;

        }
        void display(){
            System.out.println(this.author+" "+this.price+" "+this.title);
        }
    }     
      class main{
        public static void main(String[] args) {
            Book b=new Book(null, 0);
            Book b2=new Book(null, null, 0);
            b.display();
        }

    }            
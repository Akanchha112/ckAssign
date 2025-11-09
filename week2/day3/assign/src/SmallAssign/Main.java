package SmallAssign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}
public class Main {
    static void validateEmail(String email) throws InvalidEmailException {
        if (email == null || !email.contains("@")) {
            throw new InvalidEmailException("Invalid Email: must contain '@' symbol.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Q1. Accept a number and find the sum of all its digits. E.g. 1234 → 10 (1+2+3+4)
        System.out.println("Q1. Enter a number");
        int n=scanner.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(" Sum of each digit of entered number: "+sum);

//        Q2. Print the multiplication table for any number entered by the user.
        System.out.println("Q2. Enter a number");
        int tabledigit= scanner.nextInt();
        System.out.println(" Table of "+ tabledigit+" : ");
        for(int i=1;i<11;i++){
            System.out.println(" "+i*tabledigit);
        }

//        Q3. Calculate the factorial of a number using a for loop.
        int factorialN=8;
        int factorial=1;
        for(int i=1;i<=factorialN;i++){
            factorial*=i;
        }
        System.out.println("Q3. Factorial of "+factorialN+" : "+factorial);


//        Q4. Reverse the digits of an integer using a while loop.
        int reversen = 4592;
        int original = reversen;   // keep a copy
        int reversed = 0;

        while (reversen > 0) {
            reversed = reversed * 10 + reversen % 10;
            reversen /= 10;
        }
        System.out.println("Q4. Reverse of no. " + original + " is: " + reversed);

//        Q5. Create a SmallAssign.Calculator class with methods add, subtract, multiply, and divide.
        Calculator cal=new Calculator();
        cal.setter(9,6);
        System.out.println("Q5. Create a SmallAssign.Calculator class with methods add, subtract, multiply, and divide.");
        System.out.println(" Numbers: 9, 6");
        System.out.println(" Call add() method: "+cal.add());
        System.out.println(" Call substract() method: "+cal.subtract());
        System.out.println(" Call multiply() method: "+cal.multiply());
        System.out.println(" Call divide() method: "+cal.divide());

//        Q6. Create a SmallAssign.Student class with fields for name and marks in 3 subjects.
//        Add a method to calculate total and average marks.
        System.out.println("Q6. Create a SmallAssign.Student class with fields for name and marks in 3 subjects.\n" +
                "Add a method to calculate total and average marks.\n");
        Student student=new Student("Akash",23,32,35);
        student.printStudentInfo();
        System.out.println(" Total marks: "+student.total());
        System.out.println(" Average marks: "+student.average());

//        Q7. Create a SmallAssign.BankAccount class with accountNumber, holderName, and balance.
//        Add a constructor to initialize these fields.

        System.out.println("Q7. Create a SmallAssign.BankAccount class with accountNumber, holderName, and balance.");
        BankAccount account=new BankAccount("Akash",23490565,4050.30);
        account.getter();

//        Q8. Create a class where every time an object is created, a static counter increases.
//        Print how many objects have been created.
        System.out.println("Q8. Static counter to count no. of objects created.");
        StaticCounter staticObj1= new StaticCounter();
        StaticCounter staticObj2= new StaticCounter();
        StaticCounter staticObj3= new StaticCounter();
        staticObj3.getCount();


//        Q9. Create a SmallAssign.MathUtils class with static methods for max, min, and average.
//                Call these without creating an object.
        System.out.println("Q9. Call static functions");
        System.out.println(" Min function called: "+MathUtils.min(6,9));
        System.out.println(" Max function called: "+MathUtils.max(9,4));
        System.out.println(" Avg function called: "+MathUtils.average(10,32));


//        Q10. Create a SmallAssign.Book class with fields title, author, and price.
//        Initialize them using a parameterized constructor.
        Book book= new Book("Q10. The Begining","Vincenzo",390.30);
        book.printinfo();

//        Q11. Create a SmallAssign.Car class with overloaded constructors — one that sets only the model name and another that sets model and price.
        System.out.println("Q11. Overloaded constructors");
        Car car= new Car("suzuki");
        car.getmodel();
        car.getpricenmodel();
        Car car2= new Car("Goyesko",10000000);
        car2.getmodel();
        car2.getpricenmodel();


//        Exception handling
//        Q12. Accept two integers from user and divide them.
//        Handle division by zero using try-catch.
//        Print “Division completed” in a finally block.
        System.out.println("Q12. Enter two digits and handle division by zero.");
        int firstInt=scanner.nextInt();
        int secondInt= scanner.nextInt();
        try{
            int a=firstInt/secondInt;
        }catch (Exception e){
            System.out.println(" Exception thrown");
        }finally {
            System.out.println(" Division completed");
        }

//        Q13. Write a program where an inner try block may throw ArithmeticException,
//        and an outer try block may throw ArrayIndexOutOfBoundsException.
//        Handle both appropriately.
        System.out.println("Q13. Nested try catch block");
        try{
            int arr[]={1,2,3};
            for(int i=0;i<=arr.length;i++){
                System.out.println(" "+arr[i]);
            }
            try{
                int result0=3/0;
            }catch (ArithmeticException a){
                System.out.println(a);
            }

        }catch (ArrayIndexOutOfBoundsException ar){
            System.out.println(ar);
        }

//        Q14. Exception Propagation (Method Chain)
//        Write three methods (m1(), m2(), m3()):
//        m1() calls m2(), and m2() calls m3().
//                m3() divides by zero.
//                Observe how the exception propagates up the chain and catch it in m1().
//                Re-throw Exception
//        Catch an exception inside a try-catch block, print a message,
//        then re-throw it to be handled by another catch block at a higher level.A
        System.out.println("Q14. Exception propagation");
        ExceptionPropagation exceptionPropagation=new ExceptionPropagation();

        try {
            System.out.println(" Output: " + exceptionPropagation.m1(5));
        } catch (ArithmeticException e) {
            System.out.println(" Exception handled in main(): " + e);
        }


//        Q15. Custom Exception: Invalid Email Exception. Validate an email string.
//        Throw SmallAssign.InvalidEmailException if it doesn’t contain an “@” symbol.
        System.out.println("Q15. Custom Exception: Invalid Email Exception");
        System.out.print(" Enter your email: ");
        String email= scanner.nextLine();
        try {
            validateEmail(email);
            System.out.println(" Valid Email: " + email);
        } catch (InvalidEmailException e) {
            System.out.println(" Caught Exception: " + e.getMessage());
        }

//        Q16. SmallAssign.Customer POJO
//        Create a SmallAssign.Customer class with id, name, email.
//        Create 3 objects and print their details using a list.
        System.out.println("Q16. Create POJO class and initialize three object, print it using list");
        Customer custmoer1= new Customer(1,"Ashi","Ashi@gmail.com");
        Customer customer2= new Customer(2,"Ayushi","Ayushi@gmail.com");
        Customer customer3=new Customer(3,"Casie","Casie@gmail.com");
        List<Customer> cust=new ArrayList<>();
        cust.add(custmoer1);
        cust.add(customer2);
        cust.add(customer3);
        for (Customer c : cust) {
            c.getter();
        }

//        Q17. Mini Banking Application
//        Create a SmallAssign.BankAccount class with deposit(), withdraw(), and getBalance() methods.
//                Add exception handling for invalid amounts and overdrafts.
//        Keep track of total accounts using a static variable.

    }

}
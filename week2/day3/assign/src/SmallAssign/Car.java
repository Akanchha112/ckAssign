package SmallAssign;

public class Car {
    String model;
    double price;
    Car(String model){
        this.model=model;
    }
    Car(String model,double price){
        this.price=price;
    }
    void getmodel(){
        System.out.println(" This is model name: "+this.model);
    }
    void getpricenmodel(){
        System.out.println(" This is model and price: "+this.model+", "+this.price);
    }

}

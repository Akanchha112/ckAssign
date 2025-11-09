package SmallAssign;

public class Customer {
    int id;
    String email, name;

    public Customer(){}
    public Customer(int id, String name,String email){
        this.id=id;
        this.email=email;
        this.name=name;
    }
    void getter(){
        System.out.println(" SmallAssign.Customer id: "+this.id+", name: "+this.name+", email: "+this.email);
    }
}

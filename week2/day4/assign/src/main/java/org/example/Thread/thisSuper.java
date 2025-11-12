package org.example.Thread;

class A{
    int a,b;
    A(int a,int b){
        this.a=a;
        this.b=b;
    }
    private int thismethod(){
        return 2;
    }
    int divisionby2(int a){
        return a/this.thismethod();
    }

}
class B extends A{

    B(int a, int b) {
        super(a, b);
    }
}
public class thisSuper {

}

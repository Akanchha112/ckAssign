package SmallAssign;

public class Calculator {
    int first;
    int second;
    void setter(int f,int s){
        this.first=f;
        this.second=s;
    }
    int add(){
        return this.first+this.second;
    }
    int subtract(){
        return this.first-this.second;
    }
    int multiply(){
        return this.first*this.second;
    }
    double divide(){
        return this.first/this.second;
    }

}

package SmallAssign;

public class StaticCounter {
    static int count=0;
    StaticCounter(){
        count++;
    }
    void getCount(){
        System.out.println(" Total Object create: "+count);
    }
}

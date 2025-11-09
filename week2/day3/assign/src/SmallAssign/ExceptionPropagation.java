package SmallAssign;

public class ExceptionPropagation {
    double m3(int a) throws ArithmeticException{
        return a/0;
    }
    double m2(int a) throws ArithmeticException{
        return m3(a);
    }
    double m1(int a){
        try {
            return m2(a);
        }catch (ArithmeticException arithmeticException){
            System.out.println(" Exception caught in m1(): " + arithmeticException);
            throw arithmeticException;
        }
    }

}

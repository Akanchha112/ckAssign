package SmallAssign;

public class Student {
    String name;
    int s1,s2,s3;
    Student(String name,int s1,int s2,int s3){
        this.name=name;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    void printStudentInfo(){
        System.out.println(" SmallAssign.Student name: "+this.name+"\nSubject marks: "+this.s1+", "+this.s2+", "+this.s3);
    }
    int total(){
        return this.s1+this.s2+this.s3;
    }
    int average(){
        return (this.s1+this.s2+this.s3)/3;
    }
}

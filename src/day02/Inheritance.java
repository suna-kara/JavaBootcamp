package day02;
import  java.lang.Object;
class  A{
    public  static  int a=100;
    public  static  void  methodA(){
        System.out.println("Method A");
    }
}
class  B extends  A{ // Variables:2 , Methods:2
    public  static  int b=200;
    public  static  void   methodB(){
        System.out.println("Method B");
    }
}
class  C extends  B{ // Vriables:3, Methods:3
    public  static  int c=300;
    public  static  void   methodC(){
        System.out.println("Method C");
    }
}

public class Inheritance {
}

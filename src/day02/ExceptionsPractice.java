package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class ExceptionsPractice {
    public static void main(String[] args) {

        try {
            FileInputStream file=new FileInputStream(""); // checked
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            throw new NoSuchElementException(); // unchecked
        }catch (RuntimeException e){
            e.printStackTrace();
        }
       // System.out.println("hello");
    }

    public  static  void  m() throws IOException{
        throw  new IOException();
    }

    public  static void n(){
        try {
            throw  new IOException();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public  static  void test1() throws  Exception{
        Thread.sleep(1000);

        new FileInputStream("");
        throw  new IOException();
    }
}

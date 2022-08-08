package Day1;

import java.time.LocalDate;

class Person{
     public  String name;
     public LocalDate DOB;
     public  char gender;

     public  Person(String name){
         this.name=name;
     }
     public  Person(String name,char gender){
        // this.name=name;
         this(name);
         this.gender=gender;
     }

    public Person(String name, LocalDate DOB, char gender) {
        this(name,gender);
        this.DOB = DOB;
        //this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", DOB=" + DOB +
                ", gender=" + gender +
                '}';
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Person person1= new Person("Daniel");
        Person person2= new Person("Özer");
        Person person3= new Person("Yulia",'F');
        Person person4=new Person("Ariane",'F');
/*
        person1.name="Josh";
        person2.name="İnci";
        person3.name="Bella";

        person1.name="Aaron";
*/
        person2.DOB=LocalDate.of(1990,4,7);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
/*
        Person person4=null;
        person4.name="James";
        person4.gender='M';

        System.out.println(person4);
*/

       
    }

}

package day02;

class Employee{
    private   String name;
    private   double salary;
    private   String id;

    public String getName() { // read ONLY
        if (name==null){
            throw new RuntimeException("Employee has not be set");
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Employee name can not be empty");
        }
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each))
                throw  new RuntimeException("Employee name can not contain digits");
        }
     //   if (!Character.isLetterOrDigit())
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee employee=new Employee();
     //   employee.name="  ";
      //  System.out.println(employee.name);

        employee.setName("Daniel123");
        System.out.println(employee.getName());


    }
}

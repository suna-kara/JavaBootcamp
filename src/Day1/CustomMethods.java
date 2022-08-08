package Day1;

import java.util.Arrays;

public class CustomMethods<T> { // TÇ Dynamic Type ========> works with multiple diff types(non-primitives)
  public  void  print(T[] array){
      for (T each : array) {
          System.out.println(each);

      }
  }

  public  void  printreverse(T[] array){   //  T= Type
      for (int i = array.length; i >= 0; i--) {
          System.out.println(array[i]);

      }

  }
 //  public  T max(T[] array){}

    public static void main(String[] args) {
     // String[] words={"Java","Phyton","C","Selenium","API"};
        Integer[] nums={1,2,3,4,5,6,7,8};

      CustomMethods<Integer> obj=new CustomMethods<>();
      obj.print(nums);

        System.out.println("-------------------------------");
        int[] arr1={1,2,3,4,5};
        printIntArray(arr1);

        for(int each: arr1){
            System.out.println(each);
        }

        System.out.println("---------------------------");
        int[] arr2={10,20,30,40,50};
        printIntArray(arr2);

        for(int each: arr2){
            System.out.println(each);
        }

        System.out.println("-------------------------------");

        int[] arr3={100,200,300,400,500};

        printIntArray(arr3);

        for(int each: arr3){
            System.out.println(each);
        }
    }
    public  static void printIntArray(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    public  static void printIntArray(double[] array){
        for (double each : array) {
            System.out.println(each);
        }

    }

    public  static  int maxNumOfIntArray(int[] array){
        Arrays.sort(array);

        return  array[array.length-1];
    }

}

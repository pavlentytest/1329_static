package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

         Animal cat = new Animal();
         cat.makeSound();
         cat.legs++;

         Animal dog = new Animal();
         System.out.println(dog.legs);

         String str1 = "Hello"; // неизменяемая (immutable)
         System.out.println(str1.hashCode());
         str1 += "World!";
         System.out.println(str1.hashCode());

         //StringBuffer изменяемые (mutable)
         StringBuilder strb = new StringBuilder(str1);
        System.out.println(strb.hashCode());
         strb.append("Hello");
        System.out.println(strb.hashCode());

        String str3 = strb.toString(); // Hello Hello


        String str2 = "Hello";
 //       System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

         String a1 = new String("Hello");
         String a2 = new String("Hello");
   //      System.out.println(a1==a2); <= так делать нельзя!
        System.out.println(a1.equals(a2));

        char ch = str1.charAt(0); // 'H'
        //str1.trim(); // обрубает пробелы с двух сторон
        //str1.startsWith();
        ///str1.


    }
}

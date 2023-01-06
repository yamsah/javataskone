
public class MyOwnAutoShop {
    (int Speed,double regularPrice,String color, int year, int manufacturerDiscount) 
           public static void main(String[] args) {

 Sedan mySedan = new Sedan(160, 20000, "Red", 10);
 Ford myFord1 = new Ford (156,4452.0,"Black",2022, 4);
 Ford myFord2 = new Ford (155,5000.0,"Pink",1998, 5);
 Car myCar = new Car (555, 56856.0, "Red"); 

 System.out.println("Sedan Sale Price" + mySedan.getSalePrice());
 System.out.println("Ford 1 Sale Price" + myFord1.getSalePrice());
 System.out.println("Ford 2 Sale Price" + myFord2.getSalePrice());
 System.out.println("Car Sale Price" + myCar.getSalePrice());
 }
}
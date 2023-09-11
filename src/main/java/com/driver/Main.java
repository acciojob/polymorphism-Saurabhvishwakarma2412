package com.driver;

public class Main {
 public static void main(String[] args){
     Product p=new Product();
   int a=  p.product(20,10);
   int b=  p.product(20,50,10);
   double c=  p.product(0.1,5.0);
   System.out.println(a+" "+b+" "+c);
 }
 public static class Product{
     public int product(int x, int y) {
         return x*y;
     }
     public int product(int x, int y, int z) {
         return x*y*z;
     }
     public double product(double x, double y) {
         return x*y;
     }
 }
}
package com.softserve.edu;

public class ApplBox {

    public static void main(String[] args) {
        /*-
        Box box = new Box();
        box.set(123);
        //
        // ... Code
        box.set("123");
        //
        int num = (int) box.get(); // (int) Code Smell // Runtime Error
        System.out.println("num = " + num);
        */
        //
        BoxWrapper box = new BoxWrapper();
        box.set(123);
        //
        // ... Code
        //box.set("123"); // Compile Error
        box.set(4321); 
        //
        int num = box.get();
        System.out.println("num = " + num);
  
    }
}

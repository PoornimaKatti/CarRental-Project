package com.JavaPratice;
//Calling parameterized constructor from default constructor:
public class A2 {
    A2(){
        this(5);
        System.out.println("hello a");
    }
    A2(int x){
        System.out.println(x);
    }
}
class TestThis{
    public static void main(String args[]){
        A2 a=new A2();
    }

}

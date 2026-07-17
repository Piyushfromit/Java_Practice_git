package org.example.test2;




public class IntChild extends Int{



    @Override
    public int add(int a , int b ){
        System.out.println("I am inside of INTCHILD class of function add");
        return a+b;
    }



    @Override
    public int add2(int a , int b , int c){
        System.out.println("I am inside of INTCHILD class of function add2");
        return a+b+c;
    }


}

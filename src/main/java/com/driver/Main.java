package com.driver;

public class Main {

    // created a class A inside main classs, so make the class as static, as it does not get memory when object of main
    // class is  created
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    // create class b which ihnerits the properties of class a
    public static class B extends A{
        @Override
        public String meth(){
        return "Method is overridden in Extendend class B";
        }
    }
    public static void main (String[] args){
           // create object of child class and call the parent method
        B child=new B();
        child.meth();
        A chiid1=new B();
        chiid1.meth();
    }
  
}
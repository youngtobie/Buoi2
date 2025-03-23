package vn.com.t3h.buoi8.interfacedemo;


/* khai báo class triển khai myInterface
    khi có 1 class triển khai (implement) interface
    ==>> class đó phải ghi đè (@Override) tát cả các method của interface

 */
public class myInterfaceIplm implements  MyInterface{

    public void myMethod() {
        System.out.println("myMethod implement");
    }
    public void myMethod2() {
        System.out.println("myMethod2 implement");
    }
}

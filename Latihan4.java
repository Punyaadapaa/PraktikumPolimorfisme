/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum8;

/**
 *
 * @author WORKPLUS
 */
class Base {
    void f(Number n) {
        System.out.println("Base.f(Number)");
    }
}

class Sub extends Base {
    void f(Integer i) {
        System.out.println("Sub.f(Integer)");
    }
}

public class Latihan4 {
    public static void main(String[] args) {
        Base b = new Sub();
        b.f(10);        

        Sub s = new Sub();
        s.f(10);          
    }
}

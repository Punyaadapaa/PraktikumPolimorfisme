/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum8;

/**
 *
 * @author WORKPLUS
 */
import java.util.ArrayList;
import java.util.List;

interface Payable {
    double pay();
}

class Employee implements Payable {
    private double monthlySalary;

    Employee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double pay() {
        return monthlySalary;
    }
}

class Contractor implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    Contractor(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double pay() {
        return hourlyRate * hoursWorked;
    }
}

public class Latihan3 {
    public static void main(String[] args) {

        List<Payable> payList = new ArrayList<>();

        payList.add(new Employee(5000000));      
        payList.add(new Contractor(50000, 80));    

        double totalPay = 0;
        for (Payable p : payList) {
            totalPay += p.pay();
        }

        System.out.println("Total pembayaran semua = Rp " + totalPay);
    }
}


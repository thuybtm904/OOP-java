/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4cham8;

/**
 *
 * @author HP One
 */
import java.util.Scanner;

public class HV extends HinhHoc {
    private double canh;
    Scanner sn = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap canh = ");
        canh = sn.nextFloat();
    }
    
    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    
    @Override
    public double tinhCV() {
        return canh*4;
    }
    
    @Override
    public double tinhDT() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return "HV co canh = " + canh + ", chu vi = " + tinhCV() + ", dien tich = " + tinhDT();
    }
    
    
}

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
import java.text.*;
public class HT extends HinhHoc {
    private double bk;
    Scanner sn = new Scanner(System.in);
    
    public void nhap() {
        System.out.print("Nhap ban kinh = ");
        bk = sn.nextFloat();
    }
    
    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }
    
    public double tinhCV() {
        return Math.PI*2*bk;
    }
    
    public double tinhDT() {
        return Math.PI*bk*bk;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "HT co bk = " + bk + ", chu vi = " + df.format(tinhCV()) + ", dien tich = " + df.format(tinhDT());
    }
}

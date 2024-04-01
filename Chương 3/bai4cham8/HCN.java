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
public class HCN extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    Scanner sn = new Scanner(System.in);
    public double getChieuDai() {
        return chieuDai;
    }
    
    public void nhap() {
        System.out.print("Nhap chieu dai = ");
        chieuDai = sn.nextFloat();
        System.out.print("Nhap chieu rong = ");
        chieuRong = sn.nextFloat();
    }
        
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public double tinhCV() {
        return (chieuDai+chieuRong)*2;
    }
    
    public double tinhDT() {
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return "HCN co chieu dai = " + chieuDai + ", chieu rong = " + chieuRong + ", chu vi = " + tinhCV() + ", dien tich = " + tinhDT();
    }
    
}

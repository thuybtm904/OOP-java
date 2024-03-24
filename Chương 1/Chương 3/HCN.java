/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava;
import java.util.Scanner;

/**
 *
 * @author HP One
 */
public class HCN {
    private float d;
    private float r;
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        d = sn.nextFloat();
        System.out.println("Nhap chieu rong: ");
        r = sn.nextFloat();
    }
    
    public float ChuVi () {
        return (d+r)*2;
    }
    
    public float DienTich() {
        return d*r;
    }
    
    public void xuat() {
        System.out.println("Hinh chu nhat co chieu dai = " + d + ", chieu rong = " + r + ", chu vi = " + ChuVi() + ", dien tich = " + DienTich());
    }
    
    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.nhap();
        hcn.xuat();
        
    }
}

        

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava;

/**
 *
 * @author HP One
 */
import java.util.Scanner;

public class circle {
    private float r;
    
    public circle() {
        
    }
    
    public circle(float r) {
        this.r = r;
    }
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        r = sn.nextFloat();
    }
    
    public double ChuVi() {
        return Math.PI*2*r;
    }
    
    public double DienTich() {
        return Math.PI*r*r;
    }
    
    public void xuat() {
        System.out.println(r + "\t\t\t" + ChuVi() + "\t\t\t" + DienTich());
    }
    
    
    public static void main(String[] args) {
        circle[] a = new circle[6];
        for (int i=0;i<5;i++) {
            a[i] = new circle();
            a[i].nhap();
        }
            
        System.out.println("Ban kinh\t\t\tChu vi\t\t\tDien tich");
        for (int i=0;i<5;i++)
            a[i].xuat();
        
    }
    
}

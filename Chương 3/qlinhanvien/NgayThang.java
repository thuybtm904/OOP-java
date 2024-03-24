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
public class NgayThang {
    private int ngay;
    private int thang;
    private int nam;
    
    Scanner s=new Scanner(System.in);
    
    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    } 
    
    public int kiemTra() {
        int[] ngaythang = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (thang<1 || thang>12)  return 1;
        
        if (ngay>0 && ngay<=ngaythang[thang-1]) return 0;
        else if (thang==2 && ngay==29) {
            if ((nam%4==0 && nam%100!=0) || nam%400==0)
                return 0;
            else return 1;
        }          
    return 0;    
        
    }
    
    public void nhap() {
        System.out.println("Nhap ngay, thang, nam:");
            ngay = s.nextInt();
            thang = s.nextInt();
            nam = s.nextInt();
        while (kiemTra()==1) {
            System.out.println("Nhap lai:");
            ngay = s.nextInt();
            thang = s.nextInt();
            nam = s.nextInt();
        }
    }  
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLtiendien;

/**
 *
 * @author HP One
 */
import java.util.*;
public class Date {
    private int ngay, thang, nam;

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    
    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        ngay = sn.nextInt();
        thang = sn.nextInt();
        nam = sn.nextInt();
    }

}

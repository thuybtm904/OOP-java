/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4cham8;

/**
 *
 * @author HP One
 */

public class Main {
    public static void main(String[] args) {
        HCN cn = new HCN();
        cn.nhap();
        System.out.println(cn.toString());
        
        HV v = new HV();
        v.nhap();
        System.out.println(v.toString());
        
        HT t = new HT();
        t.nhap();
        System.out.println(t.toString());
    }
}

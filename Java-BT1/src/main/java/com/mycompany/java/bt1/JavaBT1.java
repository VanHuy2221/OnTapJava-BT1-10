/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt1;

/**
 *
 * @author PVHuy
 */

import Class.PhanSo;
import java.util.Scanner;

public class JavaBT1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1_221 = new PhanSo();
        PhanSo ps2_221 = new PhanSo();
        PhanSo pstong_221 = new PhanSo();
        
        System.out.println("Nhap vao phan so thu nhat:");
        ps1_221.NhapPS(sc);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_221.NhapPS(sc);
        
        pstong_221 = ps1_221.CongPS(ps2_221);
        
        System.out.println("\nPhan so thu nhat la: ");
        ps1_221.HienthiPS();
        System.out.println("\nPhan so thu hai la: ");
        ps2_221.HienthiPS();
        System.out.println("\nTong hai phan so la: ");
        pstong_221.HienthiPS();
        
        sc.close();
    }
}

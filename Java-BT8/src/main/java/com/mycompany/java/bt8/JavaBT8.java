/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt8;

/**
 *
 * @author PVHuy
 */
import Class.QuanLy;
import java.util.Scanner;
public class JavaBT8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        QuanLy ql_221 = new QuanLy();
        
        ql_221.NhapDS(sc);
        System.out.println("Danh sach nhung can bo co luong >= 8 trieu la: ");
        ql_221.TimKiem(8000000);
        
        sc.close();
    }
}

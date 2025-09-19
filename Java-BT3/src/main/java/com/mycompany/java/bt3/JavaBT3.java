/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt3;

/**
 *
 * @author PVHuy
 */
import java.util.Scanner;
import Class.QuanLySach;
public class JavaBT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        QuanLySach qls_221 = new QuanLySach();
        
        qls_221.NhapDSTL(sc);
        
        System.out.println("\n\nNhap vao loai tai lieu can tim: ");
        String loai_221 = sc.nextLine();
        qls_221.TimLoaiTL(loai_221);
        
        System.out.println("\n\nNhap vao ma tai lieu can tim: ");
        String maTL_221 = sc.nextLine();
        qls_221.TimMaTL(maTL_221);
        
        sc.close();
    }
}

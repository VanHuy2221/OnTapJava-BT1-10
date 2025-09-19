/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt2;

/**
 *
 * @author PVHuy
 */
import Class.QLCB;
import java.util.Scanner;

public class JavaBT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb_221 = new QLCB();
        
        qlcb_221.NhapDS(sc);
        System.out.print("\tNhap vao ho ten can tim kiem: ");
        String name_221 = sc.nextLine();
        
        qlcb_221.TimKiemCanBo(name_221);
        
        sc.close();
    }
}

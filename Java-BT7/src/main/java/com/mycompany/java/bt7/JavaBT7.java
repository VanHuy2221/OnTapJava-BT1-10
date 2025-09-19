/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt7;

/**
 *
 * @author PVHuy
 */
import Class.QLHS;
import java.util.Scanner;
public class JavaBT7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        QLHS list_221 = new QLHS();
        
        list_221.NhapDSHS(sc);
        
        System.out.println("Nhung hoc sinh sinh nam 1985 va que o Thai Nguyen: ");
        list_221.TimKiemThongTin(1985, "Thai Nguyen");
        
        System.out.println("Nhung hoc sinh o lop 10A1: ");
        list_221.TimKiemThongTin("10A1");
    }
}

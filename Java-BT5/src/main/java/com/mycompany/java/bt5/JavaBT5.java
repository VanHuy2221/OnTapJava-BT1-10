/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt5;


/**
 *
 * @author PVHuy
 */
import java.util.Scanner;
import Class.KhuPho;
public class JavaBT5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho qlkp_221 = new KhuPho();
        qlkp_221.NhapDS(sc);
        
        System.out.println("Danh sach ho dan co nguoi 80 tuoi: ");
        qlkp_221.TimKiemThongTin();
    }
}

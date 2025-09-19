/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt10;

/**
 *
 * @author PVHuy
 */
import Class.QuanLy;
import java.util.Scanner;
public class JavaBT10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql_221 = new QuanLy();
        ql_221.NhapDS(sc);
        System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
        ql_221.HienThiDS();
        sc.close();
    }
}

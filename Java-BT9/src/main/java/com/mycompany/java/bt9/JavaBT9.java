/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt9;

/**
 *
 * @author PVHuy
 */
import Class.QuanLy;
import java.util.Scanner;
public class JavaBT9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql_221 = new QuanLy();
        ql_221.NhapDS(sc);
        System.out.println("Danh sach sinh vien tra sach vao cuoi thang: ");
        ql_221.HienThiDSTraCuoiThang();
        sc.close();
    }
}

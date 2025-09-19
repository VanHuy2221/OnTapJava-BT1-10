/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt6;

/**
 *
 * @author PVHuy
 */
import java.util.Scanner;

import Class.KhachSan;

public class JavaBT6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhachSan ql_221 = new KhachSan();

		ql_221.nhapDanhSach(sc);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd = sc.nextInt();

		System.out.println("==> Tong tien la: " + ql_221.tinhTien(cmnd));

		sc.close();
	}

}


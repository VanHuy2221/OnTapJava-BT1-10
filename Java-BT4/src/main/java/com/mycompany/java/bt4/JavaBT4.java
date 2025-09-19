/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.bt4;

/**
 *
 * @author PVHuy
 */
import java.util.Scanner;

import Class.TuyenSinh;

public class JavaBT4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TuyenSinh dsTuyenSinh_221 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh_221.nhapDanhSach(sc);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh_221.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh = sc.nextInt();
		sc.nextLine();

		dsTuyenSinh_221.timKiemThiSinh(soBaoDanh);

		sc.close();
	}

}

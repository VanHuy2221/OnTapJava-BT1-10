/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author PVHuy
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
    protected String hoTen;
    protected Date ngaySinh;
    protected String queQuan;
    
    public Nguoi(){
    }
    
    public Nguoi(String hoTen, Date ngaySinh, String queQuan){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\tNhap ho ten: "); hoTen = sc.nextLine();
        System.out.print("\tNhap ngay sinh: "); String strDate = sc.nextLine();
        ngaySinh = strToDate(strDate);
        System.out.print("\tNhap que quan: "); queQuan = sc.nextLine();
    }

    public Date strToDate(String strDate){
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        try{
            date = sdf.parse(strDate);
        }catch(ParseException e){
            System.out.println("Loi dinh dang ngay thang");
        }
        return date;
    }
    
    public void HienThiThongTin(){
        System.out.println("\tHo ten: "+hoTen);
        System.out.println("\tNgay sinh: "+ngaySinh);
        System.out.println("\tQue quan: "+queQuan);
    }
    
    public String getQueQuan(){
        return queQuan;
    }
    
    public Date getDate(){
        return ngaySinh;
    }
}

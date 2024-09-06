/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap02;

import baitap01.SanPham;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            FileOutputStream fis = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            for (int i = 0; i < 3; i++) {
                System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
                System.out.print("Mã số sản phẩm: ");
                String maso = scanner.nextLine();
                System.out.print("Tên sản phẩm: ");
                String ten = scanner.nextLine();
                System.out.print("Giá sản phẩm: ");
                float gia = Float.parseFloat(scanner.nextLine());

                // Tạo đối tượng SanPham và ghi thông tin vào tập tinS
                SanPham sanPham = new SanPham(maso, ten, gia);
                oos.writeObject(sanPham.toString() + "\n");
            }
            oos.close();
            System.out.println("Da ghi xong");
        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.out.println("Thao tac ghi  that bai");
        }
    }
}

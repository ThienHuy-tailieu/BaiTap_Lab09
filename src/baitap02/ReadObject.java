/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap02;

import java.io.*;

/**
 *
 * @author ADMIN
 */
public class ReadObject {
    public static void main(String[] args) {
        try{
            FileOutputStream fis = new FileOutputStream("sanpham.bin");
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            
            
            ois.close();
        } catch(Exception ex){
            System.out.println("Loi xay ra:"+ex.toString());
            System.out.println("Thao tac doc du lieu that bai");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap01;

import java.io.*;

/**
 *
 * @author ADMIN
 */
public class ReadTextFile {

    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
        } catch(Exception ex){
            System.out.println("Loi xay ra:"+ex.toString());
            System.out.println("Thao tac doc du lieu that bai");
        }
    }
}

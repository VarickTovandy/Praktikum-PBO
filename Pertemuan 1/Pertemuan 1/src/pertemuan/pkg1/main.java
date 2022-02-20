/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg1;
import java.util.*;
/**
 *
 * @author inter
 */
class Input {  
    public static void main(String[] args) {  
        double celsius, fahrenheit, reamur, kelvin;
        int repeat=0;
        Scanner sc= new Scanner(System.in);  

        System.out.print("+---------------------------+\n");
        System.out.print("| PROGRAM KONVERSI SUHU AIR |\n");
        System.out.print("+---------------------------+\n");

        System.out.print("Input Data\n");
        System.out.print("----------\n");
        System.out.print("Suhu Dalam Celsius    : ");  
        celsius = sc.nextInt();
        System.out.print("\n");
    
        while (repeat!=3){
            fahrenheit = celsius*9/5+32;
            reamur = celsius*4/5;
            kelvin = celsius+273.15;

            System.out.print("Opsi\n");
            System.out.print("----\n");
            System.out.print("1. Lihat Data Konversi\n");
            System.out.print("2. Edit Data Konversi\n");
            System.out.print("3. Exit\n");
            System.out.print("Pilih     : ");
            repeat = sc.nextInt();
            System.out.print("\n");
            if (repeat==1){
                System.out.print("Suhu dalam Celsius    : " + celsius + "°C\n");
                System.out.print("Dalam Fahrenheit      : " + fahrenheit + "°F\n");
                System.out.print("Dalam Reamur          : " + reamur + "°R\n");
                System.out.print("Dalam Kelvin          : " + kelvin + "K\n");
                if (celsius<=0){
                    System.out.print("Kondisi Air Beku.\n");
                }
                else if (celsius>0||celsius<100){
                    System.out.print("Kondisi Air Normal.\n");
                }
                else if (celsius>=100){
                    System.out.print("Kondisi Air Mendidih.\n");
                }
                System.out.print("\n");
            }
            else if (repeat==2){
                System.out.print("Input Data\n");
                System.out.print("----------\n");
                System.out.print("Suhu Dalam Celsius    :");
                celsius = sc.nextInt();
                System.out.print("\n");
            }
            else if (repeat==4){
                System.out.print("Opsi tidak ada. Mohon masukkan opsi dengan benar!\n");
                System.out.print("\n");
            }
        }
        sc.close();
    }  
}

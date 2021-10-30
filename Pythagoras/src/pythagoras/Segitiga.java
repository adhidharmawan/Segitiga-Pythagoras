/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
/**
 *
 * @author User
 */
public class Segitiga {
    int a,b,c,d,e,f,g;
    int menu;
    void input(){
        Scanner masuk = new Scanner(System.in);
        System.out.println("Menu   : \n1.Cek triple pythagoras\n" +
                                    "2.Menentukan sisi miring segitiga\n" +
                                    "3.Menentukan sisi siku-siku segitiga\n" +
                                    "4.Exit");
        System.out.print("Masukan Nomor Menu Yang Dipilih: ");
        menu = masuk.nextInt();

        switch(menu){
            case 1:
                System.out.print("Masukan Nilai A : ");
                a = masuk.nextInt();
                System.out.print("Masukan Nilai B : ");
                b = masuk.nextInt();
                System.out.print("Masukan Nilai C : ");
                c = masuk.nextInt();
                d = a * a; //sisi A kuadarat
                e = b * b; //sisi B kuadarat
                f = c * c; //sisi C kuadarat
                g = d + e; //Penjumlahan a^2 + b^2
                
                //rumus pythagoras
                //c^2 = a^2 + b^2
                //f adalah c^2
                //g adalah a^2+b^2
                if (f==g){
                    System.out.println(a + "," + b + "," + c +" merupakan triple phytagoras");
                    } else {
                     System.out.println(a + "," + b + "," + c +" bukan merupakan triple phytagoras");
                    }
                break;
                
            case 2:
                System.out.print("Masukan Nilai A : ");
                a = masuk.nextInt();
                System.out.print("Masukan Nilai B : ");
                b = masuk.nextInt();
                c=((a*a)+(b*b));
                System.out.println("Nilai C : "+(Math.sqrt(c)));
                break;
            case 3:
                System.out.print("Masukan Nilai A : ");
                a = masuk.nextInt();
                System.out.print("Masukan Nilai C : ");
                c = masuk.nextInt();
                b =((c*c)-(a*a));
                System.out.println("Nilai B : "+(Math.sqrt(b)));
                break;
            case 4:System.out.println("exit...");
                System.exit(0);
            default:System.out.println("Tidak ada dalam menu");
        }
    }
}

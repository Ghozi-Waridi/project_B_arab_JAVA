/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_b.arab_netbeand;

/**
 *
 * @author ghozi-waridi
 */
public class Array2d_pertemuan2 {
    public static void main(String[] args) {
//        String hurufKapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String hurufKecil = "abcdefghijklmnopqrstuvwxyz";
//        
//        
//        System.out.println(hurufKapital);
////        char c = 65;
//        
//
//
//        for(int i = 0; i < hurufKapital.length(); i++){
//            // enkrip[si modern caesar encryption
//            int ic = hurufKapital.charAt(i); // casting mengubah dari nilai kecil ke nilai besar, konvert dari besar ke kecil            
////            int icc = ((i % 26) +3 ) + 65;
//            int icc = ((i + 3) % 26 ) + 65; // khusus caesar berangka 3
//            // des data enkir[si standart %, >> , ^ , 
//            
////            System.out.println(ic);
//            char c = hurufKapital.charAt(i);
//            char cc = (char) icc;
//            
//            
//            
//            System.out.print(cc + " ");
//            
//            
//            
//            
//            
////            System.out.println("Huruf milik ic : " +ic + " ==> " + icc+ " ==> " + c + " ==> " + cc);
//            
//        }
//        
//        System.out.println("");




    

            int[][] arr2d = {{1,2,3}, {4,5,6}, {7,8,9}};
            
//            for(int i = 0; i < arr2d.length; i++){
//                for(int j = 0; j < arr2d[i].length; j++){
//                    System.out.print(arr2d[i][j] + " ");
//                }
////                System.out.println("");
//            }
//            System.out.println("");
            int [] arr1d = {1,2,3,4,5,6,7,8,9};
            for(int i = 0; i < 9; i++){
//                int k = (i + 3) % 3;
                int l = (i % 3);
                int k = (i / 3);
                // 2d menjadi 1d tapi menggunakan 1 perulangna for
//                System.out.println("L : " + l);
//                System.out.println("K : "  + k);
                System.out.print(arr2d[k][l] + " ");
            }
            System.out.println("");
            System.out.println("\n");
            
            for(int j = 0; j < 3; j++){
                for(int i = 0; i < 3; i++){
                    int k = (j  * 3) + i;
                    // buat yang 1d menjadi 2d
                    System.out.print(arr1d[k] + " ");
                }      
                System.out.println("");
            }        
    }
}

    
//(200 + 250 ) % 255
// modulus
// XOR
// membuat ngambil image 
// watermark menggunakan XOR dua image
// watermaking melihat keaslian dari image
// modulus digunakan untuk angka yang lebih besar supaya nilainya bisa masuk ke dalam prosesor karena cuma bisa menerima 255
// membuat watermaking 
// image 1 600 || image 2 50
// XOR sama image || XOR beda ukuran image || XOR per pixel


package Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */
    public static void main(String[] args) {
    	
    	System.out.println("Meyve isimleri giriniz");
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        System.out.println("myStr : "+myStr);
        
        String[] UseThisArray = myStr.split(" ");
        System.out.println("UseThisArray :"+Arrays.toString(UseThisArray));

//        Koda burdan başla
//        kullanman gereken -> UseThisArray
        
       /* String[] newArray=new String[5];

        for (int i = 0; i < UseThisArray.length;) {
			if (UseThisArray[i]!= "Orange") {
				newArray[i]= UseThisArray[i];
			} else {
				newArray[i]= "Apple";
			}
			i++;
			return;
		}
        System.out.println("newsArray :"+ Arrays.toString(newArray));
        */
        
        for (int i = 0; i < UseThisArray.length; i++) {
			if (UseThisArray[i]== "Orange") {
				UseThisArray[i]= "Apple";
			}
			
			return;
		}
        System.out.println("newsArray :"+ Arrays.toString(UseThisArray));

    }
}
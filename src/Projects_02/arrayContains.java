package Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class arrayContains {

    /*
        Given two arrays of ints sorted in increasing order,
        outer and inner,
        return true if all of the numbers in inner appear in outer.
        Verify first array contains second array.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    /*

         Artan düzende sıralanmış iki adet ınt array göz önüne alındığında,
         dış ve iç,
         içteki tüm sayılar dışta görünüyorsa true değerini döndürür.
         İlk arrayin, ikinci arrayi içerdiğini doğrulayın.

         linearIn([1, 2, 4, 6], [2, 4]) → true
         linearIn([1, 2, 4, 6], [2, 3, 4]) → false
         linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    public static void main(String[] args) {
    	System.out.println("Aralarinda bosluk birakarak 5 rakam yaziniz");
    	Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        System.out.println("myStr :"+myStr);
        
        String[] arr = myStr.split(" ");
        System.out.println("arr :"+Arrays.toString(arr));
        
        int[] myArr = new int[5];
        for(int i = 0 ; i< arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }
        
        System.out.println("myArr: "+Arrays.toString(myArr));

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for(int i = 0 ; i <3 ; i++){
            UseThisArray1[i] = myArr[i];
        }
        System.out.println("UseThisArray1 : "+Arrays.toString(UseThisArray1));

        for(int i = 3 ; i <5 ; i++){
            UseThisArray2[i-3] = myArr[i];
        }
        System.out.println("UseThisArray2 :"+Arrays.toString(UseThisArray2));
        
//        Code start here
//        Use the array name UseThisArray1 and UseThisArray2

//        Koda burdan başla
//        UseThisArray1 ve UseThisArray2 array isimlerini kullan
        
        linearIn(int[] outer, int[] inner);
        
        
        
        
       /*
        *  if (linearIn(myArr[] outer, UseThisArray1[] inner)) {
        
			System.out.println("true");
        }	else {
			System.out.println("false");
			}
			*/
		}

	private static void linearIn(Object object, Object object2) {
		// TODO Auto-generated method stub
		
	}

	

	
	  


   

	
}

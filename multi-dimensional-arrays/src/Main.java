
import java.util.Scanner;


public class Main {
    //Çok boyutlu arrayler
    public static void main(String[] args) {
        //Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..
       /* int [][] array =new int[2][2];//2 satır 2 sütun sahibi bir array
        array[0][1] = 5;
        System.out.println(array[0][1]);
        int [][] array2 = {{0,1},{5,8}};
        System.out.println("array 2 içn " +array2[1][0]);*/
         int [][] array3 = new int[2][2];
        Scanner scn = new Scanner(System.in);
       
        for(int i =0;i<2;i++){
            for(int j= 0;j<2;j++){
                System.out.println("i = " +i +" j ="+j);
                array3[i][j] = scn.nextInt();
                
            }
        }
        System.out.println("********************************");
                for(int i = 0; i<2 ;i++){
            for(int j = 0 ; j<2 ; j++){
                System.out.print(array3[i][j] + " ");

            }
                    System.out.println("");
        }
             //   System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
    }
}

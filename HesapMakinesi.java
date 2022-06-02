/**
 * Hesap makinesi
 */

import java.util.Scanner;

 public class HesapMakinesi {
    public static void main(String[] args) {
        
        int n1,n2,h;
        Scanner input = new Scanner(System.in);
        System.out.println( " Birinci sayiyi yaz");
        n1=input.nextInt();
        
        Scanner input2 = new Scanner( System.in);
        System.out.println( " ikinci sayiyi yaz");
        n2=input.nextInt();

        Scanner input3= new Scanner(System.in);
        System.out.println(" Toplama icin 1 yaz\n Cikartma icin 2 yaz \n Carpilam icin 3 yaz \n Bolme icin 4 yaz \n");
        System.out.println( " Seciniz :");

        h=input.nextInt();
        if(h==1){
            System.out.println( "Toplam : "+ (n1 + n2));
            
        }
        else if( h==2) {
            System.out.println( "Toplam : "+ (n1 - n2));
        }
        else if ( h==3) {
            System.out.println( "Toplam : "+ (n1 * n2));

        }
        else if ( h==4) {
            if (n2!=0) {
                System.out.println( "Toplam : "+ (n1 / n2));
            }
            else {
                System.out.println( " 0 bolunmez hatasi");

            }

        }
        
        else {
            System.out.println( "Hatali Islem Yaptiniz");

        }


        
        }








        


    }

    


package nguyentientho.techmasterndcjavacore14.buoi2;


import java.util.Scanner;

public class PracticeB2 {
    public static void main0(String[] args) {
        int r = 6;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r - 1; i >= 1; i--) {
            for (int j = 1; j <= r - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String[] a ={"A","B","C","D","E","F","G","H","I", "J","K","L","M","N","O","P"};
        char ch = 'A';
        ch++;
        int count = a.length;
        for(int i=0;i<=a.length-1;i++){
            //khoang trang
            for(int j=1;j<=count;j++){
                System.out.print(" ");
            }
            //tu A -> G
            for(int h=0;h<=a.length-count;h++){
                System.out.print(a[h]);
            }
            //con lai
            for(int k=i-1;k>=0;k--){
                System.out.print(a[k]);
            }
            count--;
            System.out.println();
        }

        int count2 = a.length;
        for (int i=0;i<=a.length-2;i++){
            //khoang trang
            for (int j=-1;j<=a.length-count2;j++){
                System.out.print(" ");
            }
            //A->F
            for(int h=0;h<=count2-2;h++){
                System.out.print(a[h]);
            }
            //con lai
            for(int k=count2-3;k>=0;k--){
                System.out.print(a[k]);
            }
            count2--;
            System.out.println();
        }
    }

}


/**
 * MinMax
 */
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max, i = 0,enbuyuk = 0 , enkucuk = 0;
        System.out.print("Kaçtane sayı gireceksin :");
        int sayı = inp.nextInt();

        while (i < sayı) {
            System.out.print(++i +". Sayıyı giriniz : ");
            max = inp.nextInt();
            if(i == 1){
                enbuyuk = max;
                enkucuk = max;
            }else if (enbuyuk < max ){
                enbuyuk = max;
            }else if (enkucuk > max){
                enkucuk = max;
            }
            
            
        }
        System.out.println("En buyuk sayı : "+enbuyuk+"\nEn kucuk sayı : "+enkucuk);
        inp.close();
    }
}
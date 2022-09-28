package mukemmelSayi.src;

//Mukemmel sayi:kendinden baska pozitif tum tam bölenlerin sayisi kendisine esit olan toplamı kendisine esit olan sayiya denir
// 6----> 1,2,3 toplamı 6 dir.
//28----> 1,2,4,7,14
public class Main {
    public static void main (String [] args){
        int number = 6;
        int total = 0;

        for (int i=1; i<number; i++){
            if(number % i==0){
                total=total +i;
            }

        }

        if (total== number){
            System.out.println("Mukemmel sayidir");
        }else {
            System.out.println("Mukemmel sayi degildir");
        }

    }
}

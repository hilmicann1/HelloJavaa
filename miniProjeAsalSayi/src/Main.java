package miniProjeAsalSayi.src;

//mini proje sayi Asal Mı?
public class Main {
    public static void main (String[] args){
        int number = 2;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime =true;

        if (number==1){
            System.out.println("Sayı asal degildir");
            return;
        }

        if (number<1){
            System.out.println("Gecersiz sayı");
        }

        for (int i=2; i<number; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime==true){
            System.out.println("Sayı asaldır");
        }else {
            System.out.println("Sayı asal degildir");
        }
    }
}

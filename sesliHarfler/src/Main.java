package sesliHarfler.src;

//Kalın sesli ve ince sesli harfler
public class Main {
    public static void main (String[] args ){
        char harf = 'A';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harfler");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}

//stringlerle çalışmak
public class Main {
    public static void main (String [] args){
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı :"+mesaj.length());
        System.out.println("5. eleman :"+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!")); //yeni bir string olusturur
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B")); //B ile baslıyor mu
        System.out.println(mesaj.endsWith(".")); // . ile bitiyor mu
        char[] karakterler =new char[5];
        mesaj.getChars(0,5, karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); //indexOf kaçıncı karakter a harfidir ilk buldugunu verir ve bitirir
        System.out.println(mesaj.lastIndexOf("a")); //aramaya sagdan baslar
*/
        String yeniMesaj =mesaj.replace(' ','-');
        //System.out.println(mesaj.replace(' ','-')); //ilgili metnimizde ki degeleri degistirebiliriz
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4)); //2. indexinten itibaren yazdır. 2 den basla 4 e kadar yaz
        for (String kelime:mesaj.split(" ")){ //split mesajları alt alta yazdırmaya yarar.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //harfleri küçük harfe cevirir
        System.out.println(mesaj.toUpperCase()); //harfleri büyük harfe cevirir
        System.out.println(mesaj.trim()); //yazılan metnin basındaki ve sonunda ki boslukları atmaya yarar.
    }
}

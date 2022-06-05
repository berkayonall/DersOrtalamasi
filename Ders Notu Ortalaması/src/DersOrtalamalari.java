import java.util.Scanner;
public class DersOrtalamalari {
    public static void main(String[] args) {
         int mat , fizik,kimya,beden,tarih,felsefe,edebiyat;

         Scanner inp = new Scanner(System.in);

         System.out.print("Matematik Notunuz :");
         mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Beden Notunuz :");
        beden = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Felsefe Notunuz :");
        felsefe = inp.nextInt();

        System.out.print("Edebiyat Notunuz :");
        edebiyat = inp.nextInt();

        int toplam = (mat + fizik + kimya + beden + tarih + felsefe + edebiyat);
        double sonuc = toplam / 7;
        System.out.println("Ortalamanız : " + sonuc);


    }

}


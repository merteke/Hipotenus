import java.util.*;

public class UcgeninAlani {
    public static void main(String[] args){

/*
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

    int a, b, c;

    Scanner input=new Scanner(System.in);

    System.out.println("Ucgenin kenarlarini giriniz");

    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    
    int cevre;
    cevre = (a+b+c) / 2;
    double alan;
    alan = cevre * (cevre-a) * (cevre-b) * (cevre-c);
    alan = Math.sqrt(alan);

    System.out.println("Ucgenin cevresi="+cevre);
    System.out.println("Ucgenin alani="+alan);




    }

}

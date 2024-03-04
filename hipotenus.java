import java.util.*;


public class hipotenus {

    public static void main(String[] args){

/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.*/



    int a,b;

    Scanner input=new Scanner(System.in);

    System.out.println("Dik kenarlari giriniz:");
    a=input.nextInt();
    b=input.nextInt();
    double hipotenus;
    hipotenus=((a*a)+(b*b));
    hipotenus=Math.sqrt(hipotenus);

    System.out.println("Dik ucgenin hipotenusu="+hipotenus);

    }

    

}

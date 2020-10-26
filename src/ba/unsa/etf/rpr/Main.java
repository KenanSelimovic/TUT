package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
static int sumaCifara(int a){
    int suma=0;
    while(a!=0){
        suma=suma+a%10;
        a=a/10;
    }
    return suma;
}
    public static void main(String[] args) {
	System.out.println("Unesite broj n: ");
	int n;
	Scanner ulaz=new Scanner(System.in);
	n=ulaz.nextInt();
	System.out.println("Trazeni brojevi od 1 do "+n+" su: ");
	for(int i=1;i<=n;i++){
	    if(i%sumaCifara(i)==0) System.out.println(i);
    }
    }
}

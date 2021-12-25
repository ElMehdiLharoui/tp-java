package tps;
import java.util.Scanner;
public class aa {
	public static void main(String[] args) {	
		
		Scanner snScanner=new Scanner(System.in);
		System.out.println("donner le nombre maximum des livres de la biblio ");
		Biblio biblio=new Biblio(Integer.parseInt(snScanner.next()));
	}
}

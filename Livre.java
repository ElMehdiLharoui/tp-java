package tps;

import java.util.Vector;

import java.util.Scanner;

public class Livre {

private String titre;
private String[] auteurs;
private String iSBN;
private double prix;

public Livre(String titre1,String[] auteurs,String ISBN,double prix ) {
	titre=titre1;
	this.auteurs=auteurs;
	this.prix=prix;
	this.iSBN=ISBN;
	
}
public String toString() {
	StringBuffer var = new StringBuffer();
	var.append("titre :"+this.titre);
	var.append("\nauteurs :" );
	for (String vaq : auteurs) 
	{
		var.append(vaq+",");
	}
	var.append("\nISBN :"+this.iSBN);
	var.append("\nprix :"+this.prix);
	return var.toString();
}
	
public boolean equals(Livre E) {
	return iSBN.equals(E.iSBN);
}
public boolean IsOfAutor(String aut) 
{
	for (String string : auteurs) {
		if(string.startsWith(aut))return true;
	}
	return false;
}
 public static Livre creaLivre() 
 {
	 Scanner Se=new Scanner(System.in);
	 String titre,ISNB,temp;
	 double prix;
	 String[] auts;
	 Vector<String> tempStrings=new Vector<String>();
	 System.out.print("\nDonner le titre");
	 titre=Se.nextLine();
	 System.out.print("Donner le ISBN");
	 ISNB=Se.nextLine();
	 System.out.print("Donner le prix");
	 prix=Double.parseDouble( Se.nextLine());
	 do {
		 System.out.print("Entrer un auteur (ligne vide = fin):");
		 temp=Se.nextLine();
		 tempStrings.add(temp);
	 
	 }while(!temp.equals(""));
	 
	 auts=(String[])tempStrings.toArray();
	 
	 return new Livre(titre,auts,ISNB,prix);
 }
	
	
	
	
	
}

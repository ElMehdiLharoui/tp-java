package tps;

import java.util.Vector;

public class Biblio {

	private Vector<Livre> lisLivres=new Vector<Livre>();
	private int numMax;
	public Biblio(int numMax) 
	{
		this.numMax=numMax;
	}
	public void name() {
		
	} int capacity() {
		return numMax;
	}
	public int size()
	{
		return lisLivres.size();
	}
	public boolean ajouteLivre (Livre E) 
	{
		if(lisLivres.indexOf(E)!=-1) return false;
		if(isFilled())return false;
		lisLivres.add(E);
		return true;
	}
	public boolean isFilled() {
		return capacity()==size();
	}

	public String toString () {
		StringBuffer sBuffer=new StringBuffer();
		
		for (Livre livre : lisLivres) {
			sBuffer.append("----------------");
			sBuffer.append(livre.toString());
			sBuffer.append("----------------");
		}
		
		return sBuffer.toString();
	}
	public Vector<Livre> chercher(String auteur) 
	{
	  Vector<Livre>	lis=new Vector<Livre>();
	  for (Livre livre : lisLivres) {
		if(livre.IsOfAutor(auteur))lis.add(livre);
	  }
	  return lis;
	}
}




public class Tuile {

	private int position;  // de 0 <a 99, la position.
	private boolean type; // 0 pour regulier, 1 pour serpent et\ou échelle
	private int destination; //  0 si c'est une tuile réguliere; autrement la destination du serpent ou de l'échelle
	
	Tuile(int pos)
	{
		...
	}

	public int getPosition() {
		...
	}

	//si une tuile est soit un serpent soit une échelle, on se sert de cette méthode pour fixer sa destinamtion.
	public void makeSpecialType(int position) {
 		...
	}
	
	public boolean isType() {
		...
	}

	public int getDestination() {
		...
	}

	public void setDestination(int destination) {
		...
	}
	
	
	
}

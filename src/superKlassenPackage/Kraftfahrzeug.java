package superKlassenPackage;

public abstract class Kraftfahrzeug 
{
	public int RadZahl;
	public int MaxSpeed;
	public String Hersteller = "TactiCalcode"; 
	
	public abstract void MotorStarten();
	
	public Kraftfahrzeug(String alias)
	{
		System.out.println("Kraftfahrzeug " + alias + " wird instanziiert.");
	}
}
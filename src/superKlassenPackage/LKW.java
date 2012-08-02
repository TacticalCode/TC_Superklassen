package superKlassenPackage;

public class LKW extends Kraftfahrzeug 
{
	LKW(String alias)
	{
		super(alias);
	}
	
	LKW(String alias, int AnzahlRaeder)
	{
		super(alias);
		RadZahl = AnzahlRaeder;
		System.out.println("LKW mit " + RadZahl + " Rädern wurde instanziiert.");
	}
	
	@Override
	public void MotorStarten() 
	{
		System.out.println("LKW wird gestartet...");
	}
}

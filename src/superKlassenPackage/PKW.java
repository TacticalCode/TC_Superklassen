package superKlassenPackage;

public class PKW extends Kraftfahrzeug 
{	
	PKW(String alias)
	{
		super(alias);
		RadZahl = 4;
		System.out.println("PKW wurde instanziiert.");
	}
	
	@Override
	public void MotorStarten() 
	{
		Hersteller = "http://www.tacticalcode.de";
		System.out.println("PKW von " + Hersteller + ": Motor wird gestartet...");
	}
}
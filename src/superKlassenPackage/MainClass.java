package superKlassenPackage;

public class MainClass 
{
	public static void main(String[] args) 
	{
		LKW lkw1 = new LKW("Mein LKW", 18);
		PKW pkw1 = new PKW("Zweitwagen");
		
		lkw1.MotorStarten();
		pkw1.MotorStarten();
	}
}
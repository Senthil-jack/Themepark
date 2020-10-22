package Themepark;

public class Drygames {
 public void dryGames()
 {
	 Rollercoaster rollercoaster=new Rollercoaster();
	 Getelement g=new Getelement();
	 System.out.println("1   RollerCoaster");
	 System.out.println("2   FlipMonster");
	 System.out.println("3   FlashPoint");
	 System.out.println("4   columbus");
	 System.out.println("Please enter your choice");
	 int choice =g.getValue();
	 switch(choice)
	 {
	 case 1:
	 {
		 rollercoaster.rollerCoaster();
	 }
	 }
 }
}

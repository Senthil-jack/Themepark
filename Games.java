package Themepark;

public class Games {
 public void gameTypes()
 { 
	 Wetgames w=new Wetgames();
	 Drygames d=new Drygames();
	 Getelement g=new Getelement();
	 System.out.println("1   Wetgames");
	 System.out.println("2   Drygames");
	 System.out.println("Please enter your choice");
	 int choice=g.getValue();
	 switch(choice)
	 {
	 case 1:
	 {
		 w.wetGames();
		 break;
	 }
	 case 2:
	 {
		 d.dryGames();
		 break;
	 }
	 }
 }
}

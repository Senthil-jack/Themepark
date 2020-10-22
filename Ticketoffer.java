package Themepark;

public class Ticketoffer {
     public void offer()
     {
    	 Getelement g=new Getelement(); 
    	 System.out.println();
    	 System.out.println("          TICKET OFFERS            ");
    	 System.out.println("1   Handicrap");
    	 System.out.println("2   30 memebers in one group");
    	 System.out.println("3   Collage id card");
    	 System.out.println("4   Normal Tickets");
    	 System.out.println("Please enter your choice");
    	 int normalRate=1000;
    	 int choice=g.getValue();
    	 switch(choice)
    	 {
    	 case 1:
    	 {
               int t=normalRate-300;
               System.out.println("Your ticket price is  "+t);
               System.out.println("Thank you Enjoy your games");
               break;
    	 }
    	 case 2:
    	 {
               int t=normalRate-200;
               System.out.println("Your ticket price is  "+t);
               System.out.println("Thank you Enjoy your games");
               break;
    	 }
    	 case 3:
    	 {
               int t=normalRate-150;
               System.out.println("Your ticket price is  "+t);
               System.out.println("Thank you Enjoy your games");
               break;
    	 }
    	 }
     }
}

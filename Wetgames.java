package Themepark;

public class Wetgames {
     public void wetGames()
     {
    	Getelement g=new Getelement(); 
        System.out.println("1   Waves");
        System.out.println("2   Rain Dance");
        System.out.println("3   Rain Forest");
        System.out.println("4   Water falls");
        System.out.println("5   Swimming Pool");
        System.out.println("Please enter your choice");
        int choice=g.getValue();
        switch(choice)
        {
        case 1:
        {
        	System.out.println("10.30 t0  11.30");
        	System.out.println("1.30  t0  2.30");
        	System.out.println("4.30  t0  5.30");
        	break;
        }
        case 2:
        {
        	System.out.println("9  t0  10.00");
        	System.out.println("2  t0  3");
        	System.out.println("6  t0  7");
        	break;
        	
        }
        case 3:
        {
        	System.out.println("Enjoy your forest Please dont touch the any flower");
        }
        case 5:
        {
        	System.out.println("Only allowed ladys and Childrens");
        }
     }
}
}

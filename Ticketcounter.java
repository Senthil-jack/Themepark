package Themepark;

public class Ticketcounter {
	public void getTickets()
	{
		Getelement g=new Getelement();
		Ticketoffer t=new Ticketoffer();
		System.out.println();
		System.out.println("1   Genral Tickets");
		System.out.println("2   Premium Tickets");
		System.out.println("Please Enter Your Choice");
		int choice=g.getValue();
		switch(choice)
		{
			case 1:
			{
			t.offer();
			break;
			}
			case 2:
			{
			t.offer();
			break;
			}
			case 3:
			{
			t.offer();
			break;
			}
			
		}
	}

}

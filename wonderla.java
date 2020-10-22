package Themepark;

public class wonderla {
	public static void main(String args[])
	{
		System.out.println("****>>>>>>WELCOME TO THE WONDERLA<<<<<<****\n");
		System.out.println("          Please get your Tickets           \n");
		Ticketcounter tickets=new Ticketcounter();
		tickets.getTickets();
		Games games=new Games();
		games.gameTypes();
		
		
		
	}

}

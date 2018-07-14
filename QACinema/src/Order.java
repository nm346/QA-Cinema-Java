import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Order {
	public int ticketsTotal;
	public int numOfSameTicket;
	static String receipt = "Your receipt";
	static Calendar calendar = Calendar.getInstance();
	static int day = calendar.get(Calendar.DAY_OF_WEEK); 
	public  List<Tickets> ticketsOrdered = new LinkedList<Tickets>();
	
	public void ticketPriceCheck(Customer customer, int numOfSameTicket){
		for(int i = 0; i < numOfSameTicket; i++){
			ticketsTotal = (customer.getTicketPrice() * numOfSameTicket);
		}
	}
	
	public void ticketPriceCheck(Customer customer){
		ticketsTotal+=customer.ticketPrice;
	}
	
	public void generateReceipt(){
		if(day == Calendar.WEDNESDAY){
		System.out.println("DISCOUNT WEDNESDAY, every ticket is £2 cheaper! "+receipt);
		}
		else{
			System.out.println(receipt);
		}
		for(int i = 0; i < ticketsOrdered.size();i++){
			System.out.println(ticketsOrdered.get(i).customer.customerType+" ticket: £"+ticketsOrdered.get(i).customer.ticketPrice);
			ticketsTotal+=ticketsOrdered.get(i).customer.ticketPrice;
		}
		
		System.out.println("Your total is £"+ticketsTotal);
	}
	
}

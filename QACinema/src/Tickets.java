import java.util.Calendar;

public class Tickets extends Order{
	Customer customer = new Customer();
	public int price;
	
	public String ticketSummary = "";
	
	public Tickets(Customer customer){
		
		this.customer = customer;
	}
	static Calendar calendar = Calendar.getInstance();
	static int day = calendar.get(Calendar.DAY_OF_WEEK); 
	public static int ticketPrice;
	public static void main(String[]arg){
			System.out.println(ticketPrice);

	}
	
	public void checkDiscount(int price){
		if(day == Calendar.WEDNESDAY){
			price = price - 2;
		}
	}
	
	public int ticketsTotal;
	public int numOfSameTicket;
//	public static List<Customer> customers = new LinkedList<Customer>();
	public void ticketPriceCheck(Customer customer, int numOfSameTicket){
		for(int i = 0; i < numOfSameTicket; i++){
			if(day == Calendar.WEDNESDAY){
				ticketsTotal = (customer.getTicketPrice() - 2);
			}
			else{
				ticketsTotal = customer.getTicketPrice();
			}
			ticketsTotal = (customer.getTicketPrice() * numOfSameTicket);
		}
	}
	
	public void ticketPriceCheck(Customer customer){
		if(day == Calendar.WEDNESDAY){
			ticketsTotal = (customer.getTicketPrice() - 2);
		}
		else{
			ticketsTotal = customer.getTicketPrice();
		}
		

	}
}

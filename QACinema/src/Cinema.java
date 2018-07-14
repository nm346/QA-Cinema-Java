import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cinema {
	private static Scanner scanner = new Scanner(System.in);
	private static String orderStat = "";
	private static String customerType;
	private static Order order;
	private static int count;
	static String receipt = "Your receipt";
	public static void main(String[] args){
		while(!orderStat.equals("Finished")){
		
		while(!orderStat.equals("Continue")){
		System.out.println("Are you ready to order? y/n");
		orderStat = scanner.next();	
		if(orderStat.equals("y")){
			order = new Order();
			orderStat = "Continue";
			}
		}
		List<String> types1 = new LinkedList<String>();
		types1.add("OAP");
		types1.add("Standard");
		types1.add("Child");
		types1.add("Student");
		System.out.println("Enter the ticket you wish to purchase out of the following");
		System.out.println("For a Standard adult(£8) enter 'Standard' ");
		System.out.println("For an OAP(£6) enter 'OAP' ");
		System.out.println("For a Student(£6) enter 'Student' ");
		System.out.println("For a Child(£4) enter 'Child' ");
		customerType = scanner.next();
		while(!types1.contains(customerType)){
			System.out.println("Invalid entry, please try again");
			System.out.println("Enter the ticket you wish to purchase out of the following");
			System.out.println("For a Standard adult(£8) enter 'Standard' ");
			System.out.println("For an OAP(£6) enter 'OAP' ");
			System.out.println("For a Student(£6) enter 'Student' ");
			System.out.println("For a Child(£4) enter 'Child' ");
			customerType = scanner.next();
		}
		
		System.out.println("How many "+customerType+" tickets would you like?" );
		count = scanner.nextInt();
		if(count>1){
		for(int i = 0; i < count; i++){
			Customer customer = new Customer(customerType);
			Tickets ticket = new Tickets(customer);
			ticket.ticketPriceCheck(customer,count);
			ticket.ticketSummary+= "\n"+customerType+" ticket: £"+ticket.ticketsTotal;
			order.ticketsOrdered.add(ticket);
		}
		}
		else if(count == 1){
			Customer customer = new Customer(customerType);
			Tickets ticket = new Tickets(customer);
			ticket.ticketPriceCheck(customer);
			ticket.ticketSummary+= "\n"+" "+count+"x"+customerType+" ticket(s): £"+ticket.ticketsTotal;
			order.ticketsOrdered.add(ticket);
		}
		else{
			System.out.println("Invalid number");
		}
		System.out.println("if your order is complete please enter 'Finished'or if you would like more tickets enter 'Continue'");
		System.out.println("if you would like to cancel and start a new order please enter 'New'");
		orderStat = scanner.next();
		}
		order.generateReceipt();
		System.out.println("if you would like to start a new order please enter 'New'");
		orderStat = scanner.next();
	}
}

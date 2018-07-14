
public class Customer {

	public String customerType;
	public int ticketPrice;
	public Customer(){
		
	}
	
	public Customer(String customerType){
		this.customerType = customerType;
		setTicketPrice();
	}
	
	public void setTicketPrice(){
		if(customerType.equals("Standard")){
			ticketPrice = 8;
		}
		if(customerType.equals("OAP")){
			ticketPrice = 6;
		}
		else if(customerType.equals("Student")){
			ticketPrice = 6;
		}
		else if(customerType.equals("Child")){
			ticketPrice = 4;
		}	
		else{
			customerType = "Invalid";
		}
		}
		

	public int getTicketPrice(){
		return ticketPrice;
	}
}

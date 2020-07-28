package hrsystem;

public class SaleRep {

	public Customar getProductdetails() {
		InputSystem input = new InputSystem();
		return input.getinputofproduct();
	}


	public void printtotal(Customar e) {
		OutputSystem printpay = new OutputSystem();
		printpay.generatetotalpay(e);
	}
	
	public double calculatetotal(Customar e) {
		Calculate cal = new Calculate();
		return cal.calculatetotal(e);
	}
	

}

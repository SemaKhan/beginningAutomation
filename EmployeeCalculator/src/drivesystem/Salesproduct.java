package drivesystem;

import hrsystem.Customar;
import hrsystem.SaleRep;

public class Salesproduct {
	public static void main(String args[]) {
	Customar custom = new Customar();

	SaleRep akter = new SaleRep();
	custom=akter.getProductdetails();

	akter.calculatetotal(custom);
	akter.printtotal(custom);
	
	//second person
	SaleRep sema = new SaleRep();
	custom=sema.getProductdetails();
	sema.calculatetotal(custom);
	sema.printtotal(custom);
	
	

}
}
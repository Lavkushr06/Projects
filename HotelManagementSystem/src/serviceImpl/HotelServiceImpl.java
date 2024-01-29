package serviceImpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.HotelRepository;
import entity.Address;
import entity.Customer;
import service.HotelService;

public class HotelServiceImpl implements HotelService,HotelRepository{
	{
		for(int i=1;i<=10;i++) {
			cm.put(i, null);
		}
		for(int i=1;i<=8;i++) {
			sm.put(i, null);
		}
		for(int i=1;i<=5;i++) {
			dm.put(i, null);
		}
//	cm.put(2, new Customer("kk", 0, 0, "kkk", "ss", new Address(32, null, null, null, null, 0)));
	}
	Scanner ip=new Scanner(System.in);
	@Override
	public void roomInfo() {
		System.out.println("---------Classic Room----------");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:No");
		System.out.println("TV:No");
		System.out.println("Wifi:No");
		System.out.println("Price:1000");
		System.out.println("---------Standard Room----------");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:No");
		System.out.println("TV:Yes");
		System.out.println("Wifi:Yes");
		System.out.println("Price:2500");
		System.out.println("---------Deluxe Room----------");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:Yes");
		System.out.println("TV:Yes");
		System.out.println("Wifi:Yes");		
		System.out.println("Price:5000");
		System.out.println();
	}
	
	public void unmapRoom(LinkedHashMap<Integer,Customer> l1, int roomNo) {
		if(l1.get(roomNo)!=null) {
			Customer c1=l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+" need to pay "+c1.getCamt() +" Rs.");
			l1.put(roomNo, null);
			// l1.remove(c1); to remove the object from arrayList
		}
		else {
			System.out.println("Invalid Room Number");
		}
	}
	@Override
	public void checkout() {
		System.out.println("Please enter room type to be checked out");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		System.out.println("Enter the choice for room type");
		int type=ip.nextInt();
		System.out.println("Enter the Room number");
		int roomNo=ip.nextInt();
		switch(type) {
		case 1: if(roomNo>=1 && roomNo<=10) {
					unmapRoom(cm,roomNo);
				}
				else
					System.out.println("Enter correct room number...!!!");
				break;
		case 2:	if(roomNo>=1 && roomNo<=8)
					unmapRoom(sm,roomNo);
				else
					System.out.println("Enter correct room number...!!!");
				break;
		case 3: if(roomNo>=1 && roomNo<=5)
					unmapRoom(dm,roomNo);
				else
					System.out.println("Enter correct room number...!!!");
				break;
		default : System.err.println("Invalid room type, try again");
					break;
		}
		
	}	
	
	public void checkRoom(LinkedHashMap<Integer,Customer> l1) {
		boolean flag=false;
		for(Integer ele:l1.keySet()) {
			if(l1.get(ele)==null) {
				System.out.println(ele+" ");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Rooms Unavailable");
		}
	}
	@Override
	public void checkRoomAvailbility() {
		System.out.println("Available Rooms");
		System.out.println("-----Classic Room------");
		checkRoom(cm);
		System.out.println("-----Standard Room------");
		checkRoom(sm);
		System.out.println("-----Deluxe Room------");
		checkRoom(dm);		
	}
	
	public Customer createCust() {
		System.out.println("====Enter customer Details====");
		System.out.println("Enter customer Name");
		String name=ip.next();
		System.out.println("Enter customer ID");
		int id=ip.nextInt();
		System.out.println("Enter customer phone number");
		long phone=ip.nextLong();
		System.out.println("Enter customer email");
		String email=ip.next();
		System.out.println("Enter customer PAN");
		String pan=ip.next();
		System.out.println("Enter customer Address");
		System.out.println("Enter Door No");
		int doorno=ip.nextInt();
		System.out.println("Enter Street name");
		ip.nextLine();
		String street=ip.nextLine();
		System.out.println("Enter district");
		String district=ip.next();
		System.out.println("Enter State");
		String state=ip.next();
		System.out.println("Enter Country");
		String country=ip.next();
		System.out.println("Enter Pin");
		int pin=ip.nextInt();
		Address a=new Address(doorno,street,district,state,country,pin);
		return new Customer(name,id,phone,email,pan,a);
		
		
	}
	public void mapRoom(LinkedHashMap<Integer,Customer> l1, int roomNo,double amt) {
		if(l1.get(roomNo)== null) {
			Customer c=createCust();
			cust.add(c); //adding cust to arraylist
			l1.put(roomNo, c);
			c.setCamt(amt);
			System.out.println("Room No: "+roomNo+" has been allocated for "+c.getCname());
			System.out.println("==========================================================");
			
		}
		else
			System.out.println("Room is Not available");
	}
	public void allocateRoom() {
		System.out.println("====================Menu===================");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		System.out.println("Enter the choice for room type");
		int type=ip.nextInt();
		switch(type) {
		case 1: System.out.println("Enter the Room number");
				int room1=ip.nextInt();
				if(room1>=1 && room1<=10)
					mapRoom(cm,room1,1000);
				else
					System.out.println("Enter correct room number...!!!");
				break;
		case 2: System.out.println("Enter the Room number");
				int room2=ip.nextInt();
				if(room2>=1 && room2<=8)
					mapRoom(sm,room2,2500);
				else
					System.out.println("Enter correct room number...!!!");
				break;
		case 3: System.out.println("Enter the Room number");
				int room3=ip.nextInt();
				if(room3>=1 && room3<=5)
					mapRoom(dm,room3,5000);
				else
					System.out.println("Enter correct room number...!!!");
				break;
		default : System.err.println("Invalid room type, try again");
					break;
		}
		
	}

	public void getcustomerByID() {
		boolean flag=false;
		System.out.println("Enter Customer id");
		int cid=ip.nextInt();
		for(Customer ele:cust) {
			if(cid==ele.getCid()) {
				System.out.println(ele);
				flag=true;
				break;
			}
		}
		if(flag==false) {
				System.out.println("Customer not found");
		}
	}

	@Override
	public void findAllcustomer() {
		if(cust.size()==0) {
			System.out.println("No customers added yet !!!");
		}
		else {
			for(Customer ele:cust) {
				System.out.println(ele);
			}
		}
		
	}	
}

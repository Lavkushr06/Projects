package controller;

import java.util.Scanner;
import service.HotelService;
import serviceImpl.HotelServiceImpl;

public class HotelApp {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		HotelService h1=new HotelServiceImpl(); // upcasting and achieving abstraction
		System.out.println("========== Welcome to Hotel Management System ==========");
		while(true) {
			System.out.println("+++++++++ Menu +++++++++");
			System.out.println("1.Room Details"
					+ "\n2.Available Rooms"
					+ "\n3.Allocate Room"
					+ "\n4.Checkout\n5.All Customer Info"
					+ "\n6.Get customer details by ID"
					+ "\n7.Exit");
			System.out.println("Enter Your Option");
			int op=ip.nextInt();
			switch(op) {
			case 1: h1.roomInfo();
					break;
			case 2: h1.checkRoomAvailbility();
					break;
			case 3: h1.allocateRoom();
					break;
			case 4: h1.checkout();
					break;
			case 5: h1.findAllcustomer();
					break;
			case 6: h1.getcustomerByID();
					break;
			case 7: System.out.println("Thank you Visit Again");
					System.exit(0);
		   default : System.err.println("Invalid Option, Try again !!!");
					break;
			}
		}
	}
}

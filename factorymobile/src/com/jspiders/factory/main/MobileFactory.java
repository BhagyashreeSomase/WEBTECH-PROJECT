package com.jspiders.factory.main;
import java.util.Scanner;
import com.jspiders.factory.mobile.Mobile;
import com.jspiders.factory.object.Nothing1;
import com.jspiders.factory.object.Oneplus11pro;
import com.jspiders.factory.object.Pixel7pro;
import com.jspiders.factory.object.SamsungS23;
public class MobileFactory {
	static Mobile mobile;
	public static void main (String[]args) {
		try {
			factory().order();
			} catch (NullPointerException e) {
				System.out.println("No mobile selected");
	        }
	        }
	            private static Mobile factory() {
				System.out.println("Select mobile to order");
				System.out.println("1.SamsungS23\n"+"2.Pixel7pro\n"+"3.Oneplus11pro\n"+"4.Nothing1");
				Scanner scanner=new Scanner(System.in);
				int choice=scanner.nextInt();
				scanner.close();
				switch(choice) {
				case 1:
					mobile=new SamsungS23();
					return mobile;
				case 2:
					mobile=new Pixel7pro();
					return mobile;
				case 3:
					mobile=new Oneplus11pro();
					return mobile;
				case 4:
					mobile=new Nothing1();
					return mobile;
					default:
						System.out.println("Invalid choice.");
						return mobile;
				}
	            }	
	            }





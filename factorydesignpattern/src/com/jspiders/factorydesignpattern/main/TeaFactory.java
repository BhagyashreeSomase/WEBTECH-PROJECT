package com.jspiders.factorydesignpattern.main;

import java.util.Scanner;

import com.jspiders.factorydesignpattern.beverage.Beverage;
import com.jspiders.factorydesignpattern.object.BlackTea;
import com.jspiders.factorydesignpattern.object.GingerTea;
import com.jspiders.factorydesignpattern.object.MasalaTea;
import com.jspiders.factorydesignpattern.object.Tea;

public class TeaFactory {
static Beverage beverage;
public static void main (String[]args) {
	try {
		factory().order();
		} catch (NullPointerException e) {
			System.out.println("No Tea selected");
        }
        }
            private static Beverage factory() {
			System.out.println("Select Tea to order");
			System.out.println("1.Tea\n"+"2.BlackTea\n"+"3.GingerTea\n"+"4.MasalaTea");
			Scanner scanner=new Scanner(System.in);
			int choice=scanner.nextInt();
			scanner.close();
			switch(choice) {
			case 1:
				beverage=new Tea();
				return beverage;
			case 2:
				beverage=new BlackTea();
				return beverage;
			case 3:
				beverage=new GingerTea();
				return beverage;
			case 4:
				beverage=new MasalaTea();
				return beverage;
				default:
					System.out.println("Invalid choice.");
					return beverage;
			}
            }	
            }



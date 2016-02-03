package bank_interest;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		System.out.println("welcome");
		Scanner s=new Scanner(System.in);
		//System.out.println("please select loan type \n1.for Home loan \n2.For personal loan \n3.for Educational loan");
		//int loan=s.nextInt();
		//System.out.println("you have selected ="+loan);
		//System.out.println("Please select bank \n1.for SBI \n2.for ICICI \n3.For axis bank");
		//int bank=s.nextInt();
		//System.out.println("your provided input is : \n loan number= "+loan +" & bank number= "+bank);
		DBConnection c=new DBConnection();
		c.connectDB();
		}

}

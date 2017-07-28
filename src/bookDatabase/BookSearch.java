package bookDatabase;

import java.util.ArrayList;
import java.util.Scanner;



public class BookSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * This is a program to store information of books into a database. 
		 * It also allows you to search a book by its SKU, and display all information about this book
		 * 
		 * @author Grace
		 **/
		String contin = null;
		ArrayList<Book> arr = new ArrayList<Book>();
		String exist = null;
		String existA = null;

		/**
		 * This is an addition feature to allow user to add new book
		do{
		
        // Create a new instance of Product as an item in ArrayList
		Book onebook = new Book();
        
		//Prompt user input for SKU
		System.out.println("Input a SKU of the book:");
		Scanner scSKU = new Scanner(System.in);
			
		String SKU = scSKU.nextLine();
		onebook.setSku(SKU);
		
		//Prompt user input for title
		System.out.println("Input a Title of the book:");
		Scanner sctitle = new Scanner(System.in);
			
		String title = sctitle.nextLine();
		onebook.setTitle(title);
		
		//Prompt user input for an author
		System.out.println("Input the author of the book:");
		Scanner scauthor = new Scanner(System.in);
			
		String author = scauthor.nextLine();
		onebook.setSku(author);

		//Prompt user input for description
		System.out.println("Input the description of the book:");
		Scanner scde = new Scanner(System.in);
			
		String des = scde.nextLine();
		onebook.setDescription(des);
		
		//Prompt user input for price
		System.out.println("Input the price of the book:");
		Scanner scpri = new Scanner(System.in);
		
		Double price = scpri.nextDouble();
		onebook.setPrice(price);
	    
		// prompt for choice of continue or not 
		System.out.println("Would you like to enter another book? y/n");
		Scanner scan00 = new Scanner(System.in);
		contin= scan00.nextLine(); 
		
		//add this item in to the ArrayList
		arr.add(onebook);
		
		} while (contin.equalsIgnoreCase("y"));
	    **/
		
		
		// adding all books to the database
		Book Book1= new Book();
		Book1.setSku("Java1001");
		Book1.setTitle("Head First Java");
		Book1.setAuthor("Kathy Sierra and Bert Bates");
		Book1.setDescription("Easy to read Java workbook");
		Book1.setPrice(47.50);
		
		
		Book Book2= new Book();
		Book2.setSku("Java1002");
		Book2.setTitle("Thinking in Java");
		Book2.setAuthor("Bruce Eckel");
		Book2.setDescription("Details about Java under the hood");
		Book2.setPrice(20.00);
		
		
		Book Book3= new Book();
		Book3.setSku("Orcl1003");
		Book3.setTitle("OCP: Oracle Certified Professional Java SE");
		Book3.setAuthor("Jeanne Boyarsky");
		Book3.setDescription("Everything you need to know in one place");
		Book3.setPrice(45.00);
		
		Book Book4= new Book();
		Book4.setSku("Python1004");
		Book4.setTitle("Automate the Boring Stuff with Python");
		Book4.setAuthor("Al Sweigart");
		Book4.setDescription("Fun with Python");
		Book4.setPrice(10.50);
		
		Book Book5= new Book();
		Book5.setSku("Zombie1005");
		Book5.setTitle("The Maker's Guide to the Zombie Apocalypse");
		Book5.setAuthor("Simon Monk");
		Book5.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
		Book5.setPrice(16.50);
		
		Book Book6= new Book();
		Book6.setSku("Rasp1006");
		Book6.setTitle("Raspberry Pi Projects for the Evil Genius");
		Book6.setAuthor("Donald Norris");
		Book6.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
		Book6.setPrice(14.75);
		
		arr.add(Book1);
		arr.add(Book2);
		arr.add(Book3);
		arr.add(Book4);
		arr.add(Book5);
		arr.add(Book6);
		
		
		//Enhanced loop over the ArrayList arr and display the book database
		for (Book item: arr) {
			System.out.println(item.getSku() + "    " + item.getTitle() + "    " + item.getAuthor() + "    "+ item.getDescription() + "    " + item.getPrice());

		}
		
		
		System.out.println("Please enter the book SKU for searching.");
		Scanner scan01 = new Scanner(System.in);
		String searchSKU= scan01.nextLine(); 
		
		int i =0; 
		
		while ( exist!="yes"&& i<arr.size()){
			
			exist=null;
			
			if (searchSKU.equalsIgnoreCase(arr.get(i).getSku())){
				System.out.println(arr.get(i).getSku() + "    " + arr.get(i).getTitle() + 
						"    " + arr.get(i).getAuthor() + "    "+ arr.get(i).getDescription() + 
						"    " + arr.get(i).getPrice());
				
				exist = "yes";
			}
			i ++; 
		}

			
		if (exist!="yes"){
			System.out.println("The book is not in the data base.");
		}
			
		System.out.println("Please enter the author for searching.");
		Scanner scan02 = new Scanner(System.in);
		String searchAuthor= scan02.nextLine(); 
		
		int j =0; 
		
		while ( existA!="yes"&& j<arr.size()){
			
			existA=null;
			
			if (arr.get(j).getAuthor().contains(searchAuthor)){
				System.out.println(arr.get(j).getSku() + "    " + arr.get(j).getTitle() + 
						"    " + arr.get(j).getAuthor() + "    "+ arr.get(j).getDescription() + 
						"    " + arr.get(j).getPrice());
				
				existA = "yes";
			}
			j ++; 
		}

			
		if (existA!="yes"){
			System.out.println("The book is not in the data base.");
		}
			
		}	
	}	
	
	
	


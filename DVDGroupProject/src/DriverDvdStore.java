import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DriverDvdStore {

	public static void main(String[] args) {

		//Some DvdTypes
		
		String[] starsA = new String[] {"Ryan Gosling", "Rachel McAdams"};				
		DvdType a = new DvdType("The Notebook", starsA, "Mark Johnson", "Nick Cassavetes", "New Line Cinema", 10);

		String[] starsB = new String[] {"Kumail Nanjiani", "Zoe Kazan"};
		DvdType b = new DvdType("The Big Sick", starsB, "Judd Apatow", "Michael Showalter", "Apatow Production", 10);
		
		String[] starsC = new String[] {"Adam Sandler", "Drew Barrymore"};	
		DvdType c = new DvdType("The Wedding Singer", starsC, "Jack Giarraputow", "Frank Croaci", "New Line Cinema", 10);
		
		String[] starsD = new String[] {"Arnald Schwarzenegger", "Linda Hamilton", "Michael Biehn"};	
		DvdType d = new DvdType("The Terminator", starsD, "Gale Ann Hurd", "James Cameron", "Hemdale Film Corporation", 10);
		
		
		//here is the linked list. This creates a head and a tail
		LinkedPositionalList<DvdType> temp = new LinkedPositionalList<>( );
		
		//adding the elements to the linked list
		temp.addFirst(a);
		temp.addFirst(b);
		temp.addFirst(c);
		temp.addFirst(d);
		
		
		//an uninitialized dvdType
		//DvdType e = new DvdType();
			
		//here i was just testing what the iterator would do. This copied the first element into a uninitialized dvdType
		//e = marker.getElement().toString();
		
		
		//Here I'm testing the iterator to see what happens when i use the getelement method on it. It does what I was 
		//hoping it would. That is reference the first element in the list.
		//System.out.println(marker.getElement().toString());
		
		
		//This would print the whole list on one line
		//System.out.println(temp.toString());
	
		
		//examples of the search for method
		searchFor("The Notebook", temp);
		//searchFor("High School Musical", temp); //will throw an exception if a DVD doesn't exist
		//Testing checkDVD method
		System.out.println(checkDVD("The Notebook", temp));
		printAllDVDs(temp);
		
		//CustomerType toString example
		String[] rentedDVDs = {"The Avengers", "Spiderman Homecoming"};
		CustomerType joey = new CustomerType("Joey Jo", 1234, "JoeyJo@email.com", rentedDVDs);
		System.out.println(joey.toString());
		
	}
	
	/**
	 * 
	 * @param title of DVD to search for
	 * @param DVDlibrary within a certain store or library (our project will really only have one library, currently called "temp")
	 * @return Position<DvdType> the position of the DVD
	 * @throws NoSuchElementException if DVD doesn't exist in library
	 */
	public static Position<DvdType> searchFor(String title, LinkedPositionalList<DvdType> DVDlibrary)
	throws NoSuchElementException
	{
		Position<DvdType> DVDiterator = DVDlibrary.first();			//Set initial position to point to first position (node) in array
		while (DVDiterator != null) 
		{ 
			 //compare the titles
			if (title.compareTo(DVDiterator.getElement().getTitle()) == 0)	//get title of element in that position
			{
				System.out.println("Found DVD: " + title);
				return DVDiterator;
			}
			//else, go to next element
			DVDiterator = DVDlibrary.after(DVDiterator);			//make iterator the next position 
		 }
		
		throw new NoSuchElementException("Cannot locate DVD: " + title); //if iterates and doesn't discover DVD
	}
	
	/**
	 * This method prints out all the DVDs's titles given a positional list
	 * @param DVDlibrary
	 */
	public static void printAllDVDs(LinkedPositionalList<DvdType> DVDlibrary)
	{
		System.out.println("All DVD's in store:");
		//this is an iterator. Set its position to the beginning of the list.
		Position<DvdType> marker = DVDlibrary.first();
		//loop through the whole list and reference each element to obtain methods to get Titles
		while (marker != null) 
		{ 
			 System.out.println(marker.getElement().getTitle());		//print title of DVD
			 marker = DVDlibrary.after(marker); 						//re-initialize marker to next
		 }
	}
	
	/**
	 * Method returns a boolean to see if a DVD exists within a certain library
	 * @param title
	 * @param DVDlibrary
	 * @return
	 */
	public static boolean checkDVD(String title, LinkedPositionalList<DvdType> DVDlibrary)
	{
		if(searchFor(title, DVDlibrary) != null)		//if this method returns a position (not null), evaluates to true
			return true;
		return false;
	}
	
	
}



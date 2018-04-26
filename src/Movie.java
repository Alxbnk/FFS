import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
	
	private String title;
	private String genre;
	private int pY;
	
	private ArrayList<String> actors = new ArrayList<String>();
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getpY() {
		return pY;
	}
	public void setpY(int pY) {
		this.pY = pY;
	}	
	
	public void addActors()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("How many actors? ");
        int numActors = s.nextInt();
         while(numActors > 2)
        {
            System.out.println("Sorry, you are limited to two. ");
            System.out.println("How many actors? ");
            numActors = s.nextInt();
        }
         s.nextLine();
        for(int i = 0;i<numActors;i++)
        {
            System.out.println("Enter Actor Firstname: ");
            String firstName = in.nextLine();
            System.out.println("Enter Actor Lastname: ");
            String lastName = in.nextLine();
            actors.add(firstName);
            actors.add(lastName);
            
        }
    }
	public String addTitle() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter movie title: ");
        String title = in.nextLine();
        return title;
	}
	public String addGenre() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter movie genre: ");
        String genre = in.nextLine();
        return genre;
	}
	public int addPy() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter movie production year: ");
        int pY = in.nextInt();
        return pY;
	}

}

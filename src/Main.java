import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		private ArrayList<String> movies = new ArrayList<String>();
		
		public void AddMovie(){
		Movie newMovie = new Movie();
		Scanner in = new Scanner(System.in);
        System.out.println("Enter movie title: ");
        String title = in.nextLine();
                
        System.out.println("Enter movie genre: ");
        String genre = in.nextLine();
        
        System.out.println("Enter movie production year: ");
        int pY = in.nextInt();
		
        newMovie.addTitle();
        newMovie.addGenre();
        newMovie.addPy();
        newMovie.addActors(); 

	}

}

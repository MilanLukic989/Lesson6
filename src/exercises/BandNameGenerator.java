package exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	
	public static void main(String[] args) {
		
	Random rand = new Random();

 /* String[] adjectives = { "Blind", "Slimy", "White", "Black", "Morbid", "Iron", "Suicidal", "Disturbed", "Atomic", "Electric" };
	int randomAdj = rand.nextInt(adjectives.length);
	System.out.println(adjectives[randomAdj]);
	
	String[] nouns = { "Bones", "Snakes", "Guns", "Heads", "Guardians", "Angels", "Priests", "Slayers", "Maidens", "Zombies" };
	int randomNoun = rand.nextInt(nouns.length);
	System.out.println(nouns[randomNoun]);	*/
	
	List<String> adjectives = Arrays.asList(new String[] { "Blind", "Slimy", "White", "Black", "Morbid", "Iron", "Suicidal", "Disturbed",
			"Atomic", "Electric"});

	ArrayList<String> nouns = new ArrayList<String>();
	nouns.add("Bones");
	nouns.add("Snakes");
	nouns.add("Guns");
	nouns.add("Heads");
	nouns.add("Guardians");
	nouns.add("Angels");
	nouns.add("Priests");
	nouns.add("Slayers");
	nouns.add("Maidens");
	nouns.add("Zombies");

	int random = rand.nextInt(adjectives.size());
	System.out.println(adjectives.get(random) + " " + nouns.get(random));
	
	}
}
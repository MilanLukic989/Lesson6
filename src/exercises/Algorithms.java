package exercises;

import java.util.Comparator;
import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			// String egg = eggs.get(i);
//			if(egg.contains("crack")) {
//				return i;
//			}
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int withPerls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			boolean hasPerls = oysters.get(i);
			if (hasPerls) {
				withPerls++;
			}
		}
		return withPerls;
	}

	public static double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest)
				tallest = peeps.get(i);
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		int longest = 0;
		int index = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest) {
				longest = words.get(i).length();
				index = i;
			}
		}
		return words.get(index);
	}

	public static Object containsSOS(List<String> message) {

		for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		results.sort(null);//default comparator for Double
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		 Comparator<String> comparator = new Comparator<String>(){
		        public int compare(String s1, String s2) {
		            return Integer.compare(s1.length(), s2.length());
		        }
		    };
		unsortedSequences.sort(comparator);// our length sort comparator
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		words.sort(null);//default comparator for String
		return words;
	}
}

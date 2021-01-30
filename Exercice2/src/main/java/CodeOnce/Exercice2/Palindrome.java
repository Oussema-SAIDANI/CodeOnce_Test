package CodeOnce.Exercice2;

import java.util.stream.IntStream;

public class Palindrome 
{
	public boolean isPalindrome(String text) {
		
		// declarer variable booléene
		boolean palindrome = false;
		
		// Conserver uniquement les lettres et les chiffres et annuler les cases des lettres
		String CleanText = text.replaceAll("\\W","").toLowerCase();
		// si chaine vide ou contien un seul caractere c'est un palindrome
		if(CleanText.length() < 2) {
			palindrome = true;
		}
		palindrome = IntStream.range(0, CleanText.length() / 2)
			      .noneMatch(i -> CleanText.charAt(i) != CleanText.charAt(CleanText.length() - i - 1));
		
		return palindrome;
	}
    
}

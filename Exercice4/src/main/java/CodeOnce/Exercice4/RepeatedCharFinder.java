package CodeOnce.Exercice4;

import java.util.Arrays;
import java.util.List;

public class RepeatedCharFinder 
{
	public long repeatedWord(String word, String chaine) {
		long nombre=0;
		// Divisé la chaine selon l'espace 
		
		List<String> SplitedChaine = Arrays.asList(chaine.split(""));
		
		nombre = SplitedChaine.stream().filter(e -> e.equals(word)).count();
		
		return nombre;
	}
	
	public String repeatedCharFinder(String chaine) {
		
		// Divisé la chaine 
		List<String> SplitedChaine = Arrays.asList(chaine.split(""));
		// retourner la premiere lettre avec occurence 1 si il y a un sinon ( orElse ) on ne retourne rien
		String caractere = SplitedChaine.stream().filter(lettre -> repeatedWord(lettre, chaine) == 1).findFirst().orElse("");
		
		return caractere;
	}
	

}

package CodeOnce.Exercice3;

import java.util.Arrays;
import java.util.List;

public class RepeatedCharCounter 
{
	public long repeatedWord(String word, String chaine) {
		long nombre=0;
		// Divisé la chaine selon l'espace 
		
		List<String> SplitedChaine = Arrays.asList(chaine.split(" "));
		
		nombre = SplitedChaine.stream().filter(e -> e.toLowerCase().equals(word.toLowerCase())).count();
		
		return nombre;
	}
    
	
}

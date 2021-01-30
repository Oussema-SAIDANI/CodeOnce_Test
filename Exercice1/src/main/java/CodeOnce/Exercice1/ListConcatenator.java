package CodeOnce.Exercice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListConcatenator 
{
	public List<String> concat(List<String> l1, List<Integer> l2) {
		//On utilise Stream.of pour faire un stream d'élément de 2 listes et faire accumulation dans une nouvelle liste par
		// Collector
		
		// on peut utiliser map() puisque on sait le type exact de retour
		return (List<String>) Stream.of(l1, l2)
				   .flatMap(x -> x.stream())
				   .collect(Collectors.toList());
	}
	
    
}

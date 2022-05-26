package ExampleOfInterfaceSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ExampleSet{
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("crie um conjunto e adicione notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString());
		
		
		
		
		System.out.println("exiba a maior nota " + Collections.max(notas));
		
		System.out.println("nota 5.0  esta contida? " + notas.contains(5.0));
		

		
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("exiba as notas na ordem cresncete");

		
		Set<Double> notas3 = new TreeSet<>(notas2); 
		
		System.out.println(notas3);
		
		System.out.println("\nORDEM ALEATORIA \n");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie ("got", "fantasia" ,60) );
			add(new Serie ( "dark",  "drama" , 60) );
			add(new Serie ( "thats 70 show",  "comedia" ,25) );
		}};
		
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.gettempoEpisodio());
		}
		
		
		
		System.out.println("\nORDEM INSERÇÃO \n");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie ("got", "fantasia" ,60) );
			add(new Serie ( "dark",  "drama" , 60) );
			add(new Serie ( "thats 70 show",  "comedia" ,25) );
		}};
		
		for (Serie serie : minhasSeries1) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.gettempoEpisodio());
		}
		
		System.out.println("\nOrden natural \n");
		Set<Serie> minhasSeries2 = new TreeSet<>(new ComparatoNameGnereTimeEpisode());
		minhasSeries2.addAll(minhasSeries);
		for (Serie serie : minhasSeries2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.gettempoEpisodio());
		}
		
		
		
		
		
		
		
	}
	

}

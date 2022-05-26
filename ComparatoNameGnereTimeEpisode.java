package ExampleOfInterfaceSet;

import java.util.Comparator;

public class ComparatoNameGnereTimeEpisode implements Comparator<Serie>{

	@Override
	public int compare(Serie o1, Serie o2) {
		int nome = o1.getNome().compareTo(o2.getNome());
		if (nome != 0)
			return nome;
		
		int genero = o1.getGenero().compareTo(o2.getGenero());
		if (genero != 0)
			return genero;
		
		return Integer.compare(o1.gettempoEpisodio(), o2.gettempoEpisodio());
		
			
	}

	
	
	
	
	
	
	
	
}

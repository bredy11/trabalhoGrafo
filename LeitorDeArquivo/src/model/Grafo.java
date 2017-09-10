package model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

	private List<List<Aresta>> adjacencias = new ArrayList<>();
	private int numeroDeVertice;

	public Grafo(int numeroDeVertice) {

		this.setNumeroDeVertice(numeroDeVertice);
		for (int i = 0; i < numeroDeVertice; i++) {
			adjacencias.add(new ArrayList<>());
		}
	}

	public void addAresta(String arestas) {

		String posi�oes[] = arestas.split(",");
		
		adjacencias.get(Integer.valueOf(posi�oes[0])).add(new Aresta(Integer.valueOf(posi�oes[1])));

	}


	public List<List<Aresta>> getAdjacencias() {
		return adjacencias;
	}

	public int getNumeroDeVertice() {
		return numeroDeVertice;
	}

	public void setNumeroDeVertice(int numeroDeVertice) {
		this.numeroDeVertice = numeroDeVertice;
	}

	
	
}

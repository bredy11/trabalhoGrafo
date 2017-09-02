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

	public void addAresta(int aresta1, int aresta2) {

		adjacencias.get(aresta1).add(new Aresta(aresta2));

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

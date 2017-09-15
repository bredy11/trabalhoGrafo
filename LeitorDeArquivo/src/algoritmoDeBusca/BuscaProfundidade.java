package algoritmoDeBusca;

import java.util.List;

import model.Aresta;
import model.Grafo;

public class BuscaProfundidade {
	private int pre[];
	private int cont;

	public BuscaProfundidade(int grafoTamanho) {

		pre = new int[grafoTamanho];
	}

	public void dfs(Grafo G, int v) {
		cont = 0;
		
		for (int i = 0; i < pre.length; i++) {
			pre[i] = -1;

		}
		List<List<Aresta>> arestas = G.getAdjacencias();
		while ( v < arestas.size()) {
			if (pre[v] == -1) {
				DFSRecursivo(G, G.getAdjacencias().get(v), v);
			}
			v++;
		}
		
		
		for (int i = 0; i < pre.length; i++) {
			System.out.print(String.format("  %d", i));
		}
		System.out.println("\n");
		for (int i = 0; i < pre.length; i++) {
			System.out.print(String.format("  %d", pre[i]));
		}
		
	}

	private void DFSRecursivo(Grafo g, List<Aresta> list, int v) {
		int w;
		pre[v] = cont++; // (pega valor, depois incrementa)
		for (w = 0; w < list.size(); w++) {

			if (g.getAdjacencias().get(v).size() != 0 && pre[list.get(w).getX()] == -1) {
				int provisorio = list.get(w).getX();
				list = g.getAdjacencias().get(list.get(w).getX());
				DFSRecursivo(g, list, provisorio);
			}

		}
		
	}

}

package comtroller;

import algoricimosDeBusca.BuscaProfundidade;
import model.Grafo;

public class MainController {

	public static void main(String[] args) {
		String v = "{0,1,2,3,4,5}";
		String A = "{0-2,0-3,0-4,2-1,2-4,3-4,3-5,4-1,4-5,5-1";

		String vetorV [] = v.replace("{","").replace("}","").split(",");
		String vetorA [] = A.replace("{","").replace("}","").split(",");
		
		Grafo grafo = new Grafo(vetorV.length);
		for(int i=0;i<vetorA.length;i++) {
			grafo.addAresta(vetorA[i]);
		}
		
		BuscaProfundidade buscaProfundidade = new BuscaProfundidade(vetorV.length);
		buscaProfundidade.dfs(grafo);
		
		
		
	}
}

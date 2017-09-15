package comtroller;

import LerArquivo.LeitorDeArquivo;
import algoricimosDeBusca.BuscaProfundidade;
import model.Grafo;

public class MainController {

	public static void main(String[] args) {
		LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();
		Grafo grafo = 	leitorDeArquivo.pegarLinhaArquivo();
		
		BuscaProfundidade buscaProfundidade = new BuscaProfundidade(grafo.getNumeroDeVertice());
		buscaProfundidade.dfs(grafo,5);
		
		
		
	}
}

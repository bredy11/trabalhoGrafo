package LerArquivo;

import java.io.BufferedReader;
import java.io.FileReader;

import model.Grafo;

public class LeitorDeArquivo {

	String caminho = "C:\\Users\\rafael\\Desktop\\grafo.txt";

	public Grafo pegarLinhaArquivo() {

		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));
			int linhaCont = 0;
			String[] v = null;
			String[] a = null;
			while (br.ready()) {
				if (linhaCont == 0) {
					String linha = br.readLine();
					linha = linha.replace("V=", "");

					v = linha.split(",");
					linhaCont++;
				} else {
					String linha = br.readLine();
					linha = linha.replace("A=", "");

					a = linha.split(";");
				}
			}

			br.close();
			return construirGrafo(a, v);
		} catch (Exception ioe) {
			ioe.printStackTrace();
			ioe.printStackTrace();
		}
		return null;
	}

	private Grafo construirGrafo(String[] vetorA, String[] vetorV) {
		Grafo grafo = new Grafo(vetorV.length);
		for (int i = 0; i < vetorA.length; i++) {
			grafo.addAresta(vetorA[i]);
		}
		return grafo;
	}

}

package LerArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivo {

	String caminho = "C:\\Users\\rafael\\Desktop\\grafo.txt";

	public void pegarLinhaArquivo() {

		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));
			int linhaCont = 0;
			String[] V = null;
			String[] A = null;
			while (br.ready()) {
				if (linhaCont == 0) {
					String linha = br.readLine();
					linha = linha.replace("V={", "").replace("}", "");

					V = linha.split(",");

					linhaCont++;
				} else {
					String linha = br.readLine();
					linha = linha.replace("A={", "").replace("}", "");
					linha = linha.replace("(", "");
					A = linha.split("\\),");
				}
			}

			System.out.println(V.length);
			br.close();

		} catch (Exception ioe) {
			ioe.printStackTrace();
			ioe.printStackTrace();
		}

	}

}

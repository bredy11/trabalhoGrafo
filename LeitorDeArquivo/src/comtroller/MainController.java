package comtroller;

import LerArquivo.LeitorDeArquivo;

public class MainController {

	public static void main(String[] args) {
		LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();
		leitorDeArquivo.pegarLinhaArquivo();
	}
}

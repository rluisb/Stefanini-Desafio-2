
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Principal {

	public static void main(String[] args) throws IOException {
		Manipulador manipulador = new Manipulador();
		
		int i = 0;
		
		for(i = 0; i< manipulador.leitorDeArquivo().size();i++){
			List<Path> arquivosDat = manipulador.leitorDeArquivo();
			for (Path path : arquivosDat) {
				List<String> linhas = Files.readAllLines(path, StandardCharsets.ISO_8859_1);
				for (String linha : linhas) {
					manipulador.lerLinha(linha);
				}
			}
		}
	}
}

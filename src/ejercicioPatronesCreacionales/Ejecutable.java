package ejercicioPatronesCreacionales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejecutable {

	public static void main(String[] args) throws IOException {
		File archivo = new File("C:\\archivo.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);

		String linea = br.readLine();

		String[] separado = linea.split("#");
		for (int i = 0; i < separado.length; i++) {
			String[] propiedad = separado[i].split(":");
			if (propiedad[0].equals("colorOjos")) {
				System.out.println("Los ojos son de color: " + propiedad[1]);
			} else if (propiedad[0].equals("colorPelo")) {
				System.out.println("Los pelos son de color: " + propiedad[1]);
			}
		}
	}

}

package co.simplon.util;

import java.util.ArrayList;
import java.util.List;

public class SwitchCaseDemo {

	public static List<String> buildListForInteger(int i) {
		List<String> resultat = new ArrayList<>();
		
		switch (i) {
			case 0:
				resultat.add("Nul");
				break;
			case 1:
			case 2:
				resultat.add("Positif");
				break;
			case 100:
				resultat.add("Grand nombre");
			case 10:
				resultat.add("Nombre");
				break;
			default:
				resultat.add("Inconnu");
		}

		return resultat;
	}

	public static void main(String[] args) {
		if (args.length > 0) {
			int i = Integer.parseInt(args[0]);
			List<String> liste = buildListForInteger(i);
			for (String element : liste) {
				System.out.println(element);
			}
		}
	}
}

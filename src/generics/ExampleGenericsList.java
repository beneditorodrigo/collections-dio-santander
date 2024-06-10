package generics;

import java.util.ArrayList;
import java.util.List;

public class ExampleGenericsList {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {

		List listNotGenerics = new ArrayList();

		listNotGenerics.add("Collections Framework");
		//Note: permite adicionar qualquer tipo de objeto
		listNotGenerics.add(10);
		listNotGenerics.add(2.5);

		List<String> listGenerics = new ArrayList<>();

		//permite adicionar apenas elementos do tipo definido
		listGenerics.add("Collections Framework");
		listGenerics.add("Generics Test");
	}
}

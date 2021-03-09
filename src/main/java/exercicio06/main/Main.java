package exercicio06.main;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();

		app.start();
	}

	private void start() {

		String[] cars = { "civic", "gol", "palio", "uno", "fox" };

		for (String itens : cars) {
			System.out.println("Modelo: " + itens);
		}

		cars[1] = "L200";

		System.out.print("\n");

		for (String itens : cars) {
			System.out.println("Modelo: " + itens);
		}

		cars[4] = "gol";

		System.out.print("\n");

		for (String itens : cars) {
			System.out.println("Modelo: " + itens);
		}
	}

}

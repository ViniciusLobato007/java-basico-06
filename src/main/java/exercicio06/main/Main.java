package exercicio06.main;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();

		app.start();
	}

	private void start() {

		String[] cars = { "civic", "gol", "palio", "uno" };

		int max = cars.length;

		int i = 0;

		while (i <= max) {
			System.out.println("Modelo: " + cars[i]);
			i++;
		}

	}

}

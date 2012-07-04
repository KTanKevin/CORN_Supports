import java.io.*;
import Graphics.GUI_Swing;

public class main {

	public static void landCalculator() {
		System.out.printf("Hello world!\n");
		System.out.printf("Land compilation.\n\n\n");

		long totalHarvestorsNeed = 0;

		printToScreen("How much trees?\n");
		totalHarvestorsNeed += readIntInput() * 43; // 2647
		printToScreen("How much bush?\n");
		totalHarvestorsNeed += totalHarvestorsNeed + +readIntInput() * 138; // 2157
		printToScreen("How much flower?\n");
		totalHarvestorsNeed += totalHarvestorsNeed + +readIntInput() * 534; // 309
		printToScreen("How much grass?\n");
		totalHarvestorsNeed += totalHarvestorsNeed + +readIntInput() * 1371; // 301

		printToScreen("You need a total of " + totalHarvestorsNeed
				+ " harvestors to harvest your land.\n");
	}

	public static void printToScreen(String msg) {
		System.out.printf(msg);
	}

	public static int readIntInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int output = 0;
		try {
			output = Integer.parseInt(br.readLine());
		} catch (IOException ieo) {
			System.out.printf("Error reading string!");
			System.exit(1);
		}
		return output;
	}

	public static String readStrInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String output = null;
		try {
			output = br.readLine();
		} catch (IOException ieo) {
			System.out.printf("Error reading string!");
			System.exit(1);
		}
		return output;
	}

	public static void main(String[] arg) {

		// Asks the user how much land he has for each type, then calculates the
		// required amount of harvestors
		// landCalculator();

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Graphics.GUI_Swing.createAndShowGUI();
			}
		});

	}

}
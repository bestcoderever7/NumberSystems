
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Hexadecimal {
	String input = "";
	int dec = 0;

	public Hexadecimal(PrintWriter pw) {
		// TODO Auto-generated constructor stub
	}

	public void hexToDec() {
		inputHex();
		toDec();
		outDec();
	}

	public void hexToBin() {
		inputHex();
		toBin();
		outBin();
	}

	private void outDec() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, dec);
	}

	private void toDec() {
		// TODO Auto-generated method stub
		int index = 0;
		for (int i = input.length() - 1; i > -1; i--) {
			switch(input.charAt(i))
			{
			case 'A':
				dec = dec + (10*(16^index));
				break;
			case 'B':
				dec = dec + (11*(16^index));
				break;
			case 'C':
				dec = dec + (12*(16^index));
				break;
			case 'D':
				dec = dec + (13*(16^index));
				break;
			case 'E':
				dec = dec + (14*(16^index));
				break;
			case 'F':
				dec = dec + (15*(16^index));
				break;
			default:
				dec = dec + (Integer.parseInt(Character.toString(input.charAt(i)))*(16^index));
				break;
			}
			index++;
		}
		System.out.println(dec);
	}

	private void inputHex() {
		// TODO Auto-generated method stub
		input = JOptionPane.showInputDialog("Put in da hex");
	}

	private void outBin() {
		// TODO Auto-generated method stub

	}

	private void toBin() {
		// TODO Auto-generated method stub

	}

}

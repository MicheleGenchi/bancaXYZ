package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Common {
	private String simbolo;
	private double amount;
	
	Common() {
		simbolo="";
		amount=0d;
	}

	public double yield(double ticker) {
		if (ticker != 0)
			return amount / ticker;
		throw new RuntimeException("ticker non può essere 0 \ncontrolla la chiamata al metodo yield nella classe "+this.getClass().getSimpleName());
	}

	/**
	 * @return the simbolo
	 */
	public String getSimbolo() {
		return simbolo;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	private boolean isPatternOK(String input) {
		Pattern treLettere=Pattern.compile("[a-zA-Z]{3}");
		Matcher matcher=treLettere.matcher(input);
		if (matcher.find())
			return true;
		else
			return false;
	}

	/**
	 * @param simbolo
	 *            the simbolo to set
	 */
	public void setSimbolo(String simbolo) {
		if (isPatternOK(simbolo)) {
			this.simbolo = simbolo;
		} else
			throw new RuntimeException("Pattern Simbolo non corretto ");

	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Simbolo : " + simbolo + "\nAmount : " + amount;
	}
}

package model;

public class Preferred extends Common{
	private int fixed;
	private double parValue;
	
	Preferred() {
		/*
		 *  extended fields
		 * 	simbolo="aaa";
	 	 *	amount=3;
		 */
		fixed=0;
		parValue=0d;
	}
	
	
	@Override
	public double yield(double ticker) {
		if (ticker != 0)
			return fixed*parValue / ticker;
		throw new RuntimeException("ticker non può essere 0 \ncontrolla la chiamata al metodo yield nella classe "+this.getClass().getSimpleName());
	}

	/**
	 * @return the fixed
	 */
	public int getFixed() {
		return fixed;
	}

	/**
	 * @param fixed the fixed to set
	 */
	public void setFixed(int fixed) {
		this.fixed = fixed;
	}

	/**
	 * @return the parValue
	 */
	public double getParValue() {
		return parValue;
	}

	/**
	 * @param parValue the parValue to set
	 */
	public void setParValue(double parValue) {
		this.parValue = parValue;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nFixed : "+fixed+"\nparValue : "+parValue;
	}
}



public class indiaMedicine {
	
	private String name;
	private String[] composition;
   private int[]compositionamount;
	private String manufacturename;
	private boolean discontinued;
	private double priceinrupee;
   private String size;
   
	
	/**
	 * Constructor.
	 *
	 * @param name
	 * @param composition
	 * @param composition amount
	 * @param manufacturenmae
	 * @param discontinued
	 * @param priceinrupee
    * @param size
	 */
	public indiaMedicine(String name, String[] composition, String manufacturename, boolean discontinued, 
   double priceinrupee, String size) {
		this.name = name;
		this.composition = composition;
		this.manufacturename = manufacturename;
		this.discontinued = discontinued;
		this.priceinrupee = priceinrupee;
		this.size = size;
	}
	
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}
	public String[] getComposition() {
		return composition;
	}
	public String getManufacturename() {
		return manufacturename;
	}
	public boolean getDiscontinued() {
		return discontinued;
	}
	public double getPriceinrupee() {
		return priceinrupee;
	}
   public String getSize() {
		return size;
	}
}
	
	
	
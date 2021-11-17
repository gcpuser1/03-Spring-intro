package in.AtmServices.www;

public class GrocessortStoreImplementation {
	private GrocessoryStore gc;
	GrocessortStoreImplementation(GrocessoryStore gc){
		this.gc=gc;
	}
	public void printMessages() {
		this.gc.buyItems();
	}
}

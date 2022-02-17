package features;

import Domain.Shirt;

public class CachesShirt {
	private Shirt shirt;
	
	public void add (Shirt shirt) {
		this.shirt = shirt;
	}
	
	public Shirt get () {
		return this.shirt;
	}

}

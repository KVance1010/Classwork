package client;
import Domain.Shirt;
import features.CachesShirt;
import features.CachesString;

public class TestCacheAny {
	
	public static void main (String [] args ) {
		
		CachesString myMessage = new CachesString(); // type specific
		CachesShirt myShirt = new CachesShirt(); // type specific
		
		myMessage.add("save this for me");
		
		System.out.println("Message is; "+ myMessage.get() );
		
		myShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
		System.out.println("Shirt Type: " + myShirt.get().toString());
		
	}

}

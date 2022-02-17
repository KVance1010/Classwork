package client;
import Domain.Shirt;
import features.CachesShirt;
import features.CachesString;
import generics.feature.CacheAny;

public class TestCacheObject {
	
	public static void main (String [] args ) {
		
		CachesString myMessage = new CachesString(); // type specific
		CachesShirt myShirt = new CachesShirt(); // type specific
		
		// Generic
		CacheAny <String> myGenericMessage = new CacheAny<>();
		CacheAny <Shirt> myGenericShirt = new CacheAny<>();
		
		// add data and print
		
		myMessage.add("save this for me"); // type
		myGenericMessage.add("2nd Save for me"); // Generic
		
		
		System.out.println("Message is; "+ myGenericMessage.get() );
		System.out.println("Message is; "+ myMessage.get() );
		
		myShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
		System.out.println("Shirt Type: " + myShirt.get().toString());

		myGenericShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
		System.out.println("Shirt Type: " + myGenericShirt.get().toString());
	}

}

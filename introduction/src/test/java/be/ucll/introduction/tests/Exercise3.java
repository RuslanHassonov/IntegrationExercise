package be.ucll.introduction.tests;

import be.ucll.introduction.generics.Base1;
import be.ucll.introduction.generics.Base2;
import be.ucll.introduction.generics.Super;

import java.util.ArrayList;
import java.util.Collection;

public class Exercise3 {

	public void testGenerics() {

		Base1 baseOne = new Base1();
		Base2 baseTwo = new Base2();

		Collection<Super> collection = new ArrayList<>();
		collection.add(baseOne);
		collection.add(baseTwo);

		// -- LOWER BOUNDS
		// TODO Fix this compile error by changing the code so that you can pass the collection. However, do NOT remove
		// the generics. You can of course modify them. The solution implies using lower bounds

		// TODO Fix this compile error by changing the code so that you can pass the collection. However, do NOT remove
		// thisWillNotWork(collection);

		Collection<Base1> anotherCollection = new ArrayList<Base1>();
		anotherCollection.add(new Base1());

		// -- UPPER BOUNDS
		// TODO Fix this compile error by changing the code so that you can pass the collection. However, do NOT remove
		// the generics. You can of course modify them. The solution implies using upper bounds

		// TODO Fix this compile error by changing the code so that you can pass the collection. However, do NOT remove
		// thisWillNotWorkEither(anotherCollection);

	}

	public void thisWillNotWork(Collection<Object> collection) {
	}

	public void thisWillNotWorkEither(Collection<Object> collection) {
		collection.add(new Base2());
	}
}

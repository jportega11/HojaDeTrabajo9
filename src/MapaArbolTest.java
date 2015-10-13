import static org.junit.Assert.*;

import org.junit.Test;

public class MapaArbolTest {

	@Test
	public void testAdd() {
		MapaPicadillo obj = new MapaPicadillo();
		Word palabra = new Word("Correr","Verbo");
		obj.add(palabra);
		if(!obj.get(palabra).equals(palabra)){
			
			fail("Error");
		}
	}
	public void testGet(){
		MapaPicadillo obj = new MapaPicadillo();
		Word palabra = new Word("Correr","Verbo");
		obj.add(palabra);
		try{
			palabra = (Word) obj.get(palabra);
		}
		catch(ClassCastException e){
			fail("Error");
		}
	}

}

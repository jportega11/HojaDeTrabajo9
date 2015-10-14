import static org.junit.Assert.*;

/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7
Autor: Eduardo Castellanos
Descripción:JUnit test para SplayTree
*/

import org.junit.Test;

public class ArbolBiseladoTest {

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
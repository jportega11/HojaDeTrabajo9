import java.util.*;
public class MapaArbol implements WordSet{

	private TreeMap<String, Word> base;
	
	public MapaArbol(){
		base = new TreeMap<String, Word>();
	}
	public void add(Word wordObject) {
		base.put(wordObject.getWord(),wordObject);
	
	}

	public Word get(Word word) {
		
		return  base.get(word.getWord());

	}

}

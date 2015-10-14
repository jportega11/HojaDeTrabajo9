import java.util.*;
public class MapaPicadillo implements WordSet{
	
	private HashMap<String, Word> base;
	
	public MapaPicadillo(){
		base = new HashMap<String, Word>();
	}
	public void add(Word wordObject) {
		base.put(wordObject.getWord(),wordObject);
	
	}

	public Word get(Word word) {
		return  base.get(word.getWord());
	}

}



public class ArbolBiselado implements WordSet{
	
private SplayTree base;
	
	public ArbolBiselado(){
		base = new SplayTree();
	}
	public void add(Word wordObject) {
		base.add(wordObject);
	
	}

	public Word get(Word word) {
		
		return  (Word) base.get(word);

	}
}

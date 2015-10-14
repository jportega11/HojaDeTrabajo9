
public class ArbolRojoNegro2 implements WordSet{
private RedBlackBST<String,Word> base;
	
	public ArbolRojoNegro2(){
		base = new RedBlackBST<String,Word>();
	}
	public void add(Word wordObject) {
		base.put(wordObject.getWord(), wordObject);
	
	}

	public Word get(Word word) {
		
		return  (Word) base.get(word.getWord());

	}
}
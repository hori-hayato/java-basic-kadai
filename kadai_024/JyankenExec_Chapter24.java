package kadai_024;

public class JyankenExec_Chapter24 {
	public static void main(String[] args) {
		var jyanken = new Jyanken_Chapter24();
		var choice = jyanken.getMyChoice();
		var random = jyanken.getRandom();
		
		jyanken.playGame(choice,random);
	}

}

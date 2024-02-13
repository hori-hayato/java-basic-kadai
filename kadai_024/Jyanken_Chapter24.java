package kadai_024;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	private static final String msg =
			"""
			自分のじゃんけんの手を入力しましょう
			グーはrockのrを入力しましょう
			チョキはscissorsのsを入力しましょう
			パーはpeperのpを入力しましょう""";
	
	private static final String err =
			"r, s, p のどれかを入力してください";
	private static final List<String> SELECTION = Arrays.asList("r", "s", "p");
	private static final String[] LABELS = {"グー", "チョキ", "パー"};
	private static final String WIN = "自分の勝ちです";
	private static final String LOOSE = "自分の負けです";
	private static final String DRAW = "あいこです";
	private static final String MYCHOICE = "自分の手は";
	private static final String OPCHOICE = "相手の手は";
			
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			System.out.println(msg);
			var choice = scanner.nextLine();
			if (SELECTION.contains(choice)) {
				scanner.close();
				return choice;
				
			} else {
				System.out.println(err);
				
			}
		}
	
	}

	public String getRandom() {
		return SELECTION.get((int) Math.floor(Math.random() * 3.0));
	}
	
	public void playGame(String myChoice, String opponentChoice) {
		int myIdx = SELECTION.indexOf(myChoice);
		int opIdx = SELECTION.indexOf(opponentChoice);
		System.out.println(MYCHOICE + LABELS[myIdx] + 
							"," + OPCHOICE + LABELS[opIdx]);
		
		if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
			(myChoice.equals("s") && opponentChoice.equals("p")) ||
			(myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println(WIN);
			
		} else if ((myChoice.equals("r") && opponentChoice.equals("p")) ||
				(myChoice.equals("s") && opponentChoice.equals("r")) ||
				(myChoice.equals("p") && opponentChoice.equals("s"))) {
				System.out.println(LOOSE);
				
		} else {
			System.out.println(DRAW);
			
		}
	}
	
	
}

package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		// 100までの整数が素数か判定するboolean型の配列を作成・代入
        boolean[] primeNumberTest = new boolean[100];

        // 作成したprimeNumberTest配列の要素を、for文で繰り返しtrueに初期化(true=素数、false=素数でない)
        for (int k = 0; k < primeNumberTest.length; k++) {
        	primeNumberTest[k] = true;
        }

        // 繰り返し処理
        // 割られる数iが2～100まで繰り返す
        for (int i = 2; i <= 100; i++) {

            // 割る数rが2～割られる数になるまで、素数判定を繰り返す
            for (int r = 2; r < i; r++) {
                if (i % r == 0) {
                	primeNumberTest[i - 1] = false;
                    break;  // 素数でないことが判明した時点でループを終了する
                }
            }
        }

        // 素数を出力する
        for (int j = 0; j < primeNumberTest.length; j++) {
            if (primeNumberTest[j] == true) {
                System.out.println(j + 1);
            }
        }
    }
}
package kadai_017;

//抽象親クラス
abstract public class Kato_Chapter17 {
	//姓フィールド
	public String familyName ="加藤";
	//姓フィールド
	public String givenName = "";
	//住所フィールド
	public String address = "東京都中野区〇×";
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println(familyName);
	}
	
	//個別の紹介を出力するメソッド
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
	}
	
}

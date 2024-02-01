package kadai_017;

//子クラス　加藤一郎を表す
public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	String ichiroIntroduce = "";
	
	public void setGivenName(String name) {
		givenName = name;
	}
	
	public void execIntroduce() {
		System.out.println("名前は"+ familyName + givenName + "です");
		System.out.println("住所は"+ address + "です");
		eachIntroduce();
		System.out.println(ichiroIntroduce);
	}
	
	public void eachIntroduce() {
		ichiroIntroduce = "好きな食べ物はリンゴです";
	}
	
}
package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// 子クラスのインスタンスを作成する
		
		//たろうさん
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		taro.setGivenName("太郎");
		taro.execIntroduce();
		System.out.println("");

		//いちろうさん
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		ichiro.setGivenName("一郎");
		ichiro.execIntroduce();
		System.out.println("");

		//はなこさん
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		hanako.setGivenName("花子");
		hanako.execIntroduce();
		System.out.println("");
	}
}
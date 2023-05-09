package sukkiri16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Hero h1=new Hero("斎藤");
		Hero h2=new Hero("鈴木");	//それぞれの名前でインスタンス生成をする
		List<Hero> list=new ArrayList();	//Hero型のリストを作成
		list.add(h1);		//それぞれリストに入れる
		list.add(h2);
		for(Hero h:list) {	//拡張for文で回す
			System.out.println(h.getName());
		}
		
		Map<Hero,Integer> heros=new HashMap();//Hero型とinteger型のMapの作成
		heros.put(h1, 3);	//それぞれのHero型変数と数字を入れる
		heros.put(h2, 7);
		
		for(Hero key:heros.keySet()) {	//mapに格納された情報を1つずつ取り出す文
			int value=heros.get(key);		//get(key)でkeyと連動した値が取得できる。
			System.out.println(key.getName()+"が倒した敵="+value);
		}
		
	}

}

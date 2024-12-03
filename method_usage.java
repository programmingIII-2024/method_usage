class Person
{
	int myAge;			//年齢
	double myWeight;	//体重[kg]
	double myHeight;	//身長[cm]

	void show()
	{
		System.out.println("年齢は"+myAge+"歳");
		System.out.println("体重は"+myWeight+"[kg]");
		System.out.println("身長は"+myHeight+"[cm]");
	}

	// 年齢設定を行うメソッド
	int setAge(int age)
	{
		if(age <0)
		{
			System.out.println("年齢が負です");
			return -1;								//負値のとき-1
		}

		myAge = age;
		return 0;
	}


	// 体重設定を行うメソッド
	int setWeight(double weight)
	{
		if(weight <=0)
		{
			System.out.println("体重がおかしな値です");
			return -1;								//負値のとき-1
		}

		// 自分のメンバ変数であることを明示的に示すためthisを使うことがある。
		// 今回はただ myWeight = weight   でもOK
		this.myWeight = weight;

		return 0;
	}


	// 身長設定を行うメソッド
	// メソッドの引数とメンバを同じにできる(違う物として扱う)
	int setHeight(double myHeight)
	{
		if(myHeight <0)
		{
			System.out.println("身長がおかしな値です");
			return -1;								//負値のとき-1
		}

		// メンバ変数のmyHeightとメソッド引数myHeightを区別するためにthisが必要
		this.myHeight = myHeight;

		return 0;
	}


		
}

public class method_usage 
{
	public static void main(String[] args)
	{
		Person gachaping;	
		gachaping =new Person();	

		int ret;

		gachaping.setAge(5);
		gachaping.setHeight(165.0);
		gachaping.setWeight(80.0);

		System.out.println("これはメソッドによる代入の結果");
		gachaping.show();


		// メソッドを使わないでも代入できてしまう
		gachaping.myAge = 51;
		gachaping.myHeight= -150.0;
		gachaping.myWeight = 0;

		System.out.print("\nメソッドを使わない代入の結果\n");

		gachaping.show();
		//クラスのメソッドを呼び出すときは.で繋いでメソッド名を書く
	}
}

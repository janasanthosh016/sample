package Test2;

public class SingletonCls {
	private static SingletonCls single;

	private SingletonCls() {
	}

	public static SingletonCls getInstance() {
		if (null == single) {
			single = new SingletonCls();
		}
		return single;
		
	}
}

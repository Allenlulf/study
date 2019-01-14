package study.allen.Singleton;

/**
 * 懒汉式单例 静态内部类 推荐
 * 
 * @author lulf
 * @date 2019年1月14日
 */
public class Singleton04 {
	// 1) 构造函数私有化,因为默认会有一个public的无参构造
	private Singleton04() {
	}

	private static class LazyLoader {
		private static final Singleton04 INSTANCE = new Singleton04();
	}

	public static Singleton04 getInstance() {
		return LazyLoader.INSTANCE;
	}
}

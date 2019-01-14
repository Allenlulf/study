package study.allen.Singleton;

/**
 * 饱汉式单例
 * 
 * @author lulf
 * @date 2019年1月14日
 */
public class Singleton05 {
	private Singleton05() {
	}

	private static final Singleton05 SINGLETON05 = new Singleton05();

	public static Singleton05 getInstance() {
		return SINGLETON05;
	}
}

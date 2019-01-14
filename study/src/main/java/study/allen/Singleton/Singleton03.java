package study.allen.Singleton;

/**
 * 懒汉式单例03 双重锁
 * 
 * @author lulf
 * @date 2019年1月14日
 */
public class Singleton03 {
	// 1) 构造函数私有化,因为默认会有一个public的无参构造
	private Singleton03() {
	}

	// 2) 私有对象声明
	private static Singleton03 singleton01 = null;

	// 3) 初始化私有对象
	private static Singleton03 getInstance() {
		if (singleton01 == null) {
			synchronized (Singleton03.class) {
				if (singleton01 == null) {
					singleton01 = new Singleton03();
				}
			}
		}
		return singleton01;
	}
}

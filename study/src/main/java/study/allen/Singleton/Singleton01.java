package study.allen.Singleton;
/**
 * 懒汉式单例01
 * @author lulf
 * @date 2019年1月14日
 */
public class Singleton01 {
	//1) 构造函数私有化,因为默认会有一个public的无参构造
	private Singleton01(){}
	
	//2) 私有对象声明
	private static Singleton01 singleton01=null;
	
	//3) 初始化私有对象，这种方式在多线程的情况下会有问题
	private static Singleton01 getInstance(){
		if(singleton01==null){
			singleton01=new Singleton01();
		}
		return singleton01;
	}
}

package study.allen.Singleton;
/**
 * 懒汉式单例02 同步方法
 * @author lulf
 * @date 2019年1月14日
 */
public class Singleton02 {
	//1) 构造函数私有化,因为默认会有一个public的无参构造
	private Singleton02(){}
	
	//2) 私有对象声明
	private static Singleton02 singleton02=null;
	
	//3) 初始化私有对象，并且方法上修饰了synchronized，应对并发，性能不佳
	private static synchronized Singleton02 getInstance(){
		if(singleton02==null){
			singleton02=new Singleton02();
		}
		return singleton02;
	}
}

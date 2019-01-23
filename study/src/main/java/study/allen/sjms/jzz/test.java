package study.allen.sjms.jzz;
/**
 * 测试类【建造者模式】
 * @author lulf
 * @date 2019年1月22日
 */
public class test {
	public static void main(String[] args) {
		//客户A
		MealA mealA=new MealA();
		Meal meal=new KFCWaiter(mealA).construct();
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}
}

package study.allen.sjms.jzz;
/**
 * 具体建造者【套餐A】
 * @author lulf
 * @date 2019年1月22日
 */
public class MealA extends MealBuilder {

	@Override
	public void buildFood() {
		meal.setFood("汉堡");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("可乐");
	}
}

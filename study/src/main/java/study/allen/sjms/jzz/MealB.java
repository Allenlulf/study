package study.allen.sjms.jzz;
/**
 * 具体建造者【套餐B】
 * @author lulf
 * @date 2019年1月22日
 */
public class MealB extends MealBuilder{

	@Override
	public void buildFood() {
		meal.setFood("薯条");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("柠檬汁");	
	}
}

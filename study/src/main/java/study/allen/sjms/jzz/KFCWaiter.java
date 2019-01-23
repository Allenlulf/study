package study.allen.sjms.jzz;

/**
 * Director【指挥者】
 * 
 * @author lulf
 * @date 2019年1月22日
 */
public class KFCWaiter {
	
	private MealBuilder mealBuilder;
	
	public KFCWaiter(MealBuilder mealBuilder){
		this.mealBuilder=mealBuilder;
	}
	
	public Meal construct(){
		//准备食物
		mealBuilder.buildFood();
		//准备饮料
		mealBuilder.buildDrink();
		//返回完整套餐
		return mealBuilder.getMeal();
	}

}

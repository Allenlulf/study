package study.allen.sjms.jzz;

/**
 * 抽象建造者
 * 
 * @author lulf
 * @date 2019年1月22日
 */
public abstract class MealBuilder {
     Meal meal=new Meal();
     
     public abstract void buildFood();
     
     public abstract void buildDrink();
     
     public Meal getMeal(){
    	 return meal;
     }

}

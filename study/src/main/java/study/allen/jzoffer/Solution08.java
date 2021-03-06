package study.allen.jzoffer;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author lulf
 * @date 2019年1月18日
 */
public class Solution08 {
	public int JumpFloor(int target) {
		if(target<=0){
			return -1;
		}else if(target<=2){
			return target;
		}else{
			return JumpFloor(target-1)+JumpFloor(target-2);
		}
    }
}

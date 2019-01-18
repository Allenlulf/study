package study.allen.jzoffer;

/**
 * 【替换空格】 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are
 * Happy.则经过替换之后的字符串为We%20Are%20Happy
 * 
 * @author lulf
 * @date 2019年1月18日
 */
public class Solution02 {

	public String replaceSpace(StringBuffer str) {
		String value = str.toString();
		return value.replaceAll(" ", "%20");
	}
}

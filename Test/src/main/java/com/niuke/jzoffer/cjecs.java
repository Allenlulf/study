package com.niuke.jzoffer;
/**
 * �ؽ�������
 * @author lulf
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 */
public class cjecs {
	
	public static void main(String[] args) {
		
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		 if(pre == null || in == null || pre.length != in.length )//��������������������һ��Ϊ�յĻ������޷�����������Ϊ��
			 return null;
		 else
		 {
			 return reBulidTree(pre,0,pre.length-1,in,0,in.length-1);
		 }
	}
	
	private TreeNode reBulidTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn)
	 {
		 if(startPre > endPre || startIn > endIn)//�ȶԴ��Ĳ������м���ж�
			 return null;
		 int root = pre[startPre];//����Ŀ�ʼλ�õ�Ԫ���Ǹ�Ԫ��
		 int locateRoot = locate(root,in,startIn,endIn);//�õ����ڵ������������е�λ�� ��������������������������Ը��ڵ�λ��Ϊ��
		 if(locateRoot == -1) //������������û���ҵ����ڵ㣬�򷵻ؿ�
		   return null;
		 TreeNode treeRoot = new TreeNode(root);//���������ڵ�
		 treeRoot.left = reBulidTree(pre,startPre + 1,startPre + locateRoot - startIn,in,startIn,locateRoot-1);//�ݹ鹹��������
		 treeRoot.right = reBulidTree(pre,startPre+locateRoot-startIn+1,endPre,in,locateRoot+1,endIn);//�ݹ鹹��������
		 return treeRoot;
	 }
	 //�ҵ����ڵ������������е�λ�ã����ڵ�֮ǰ�������������������飬���ڵ�֮���������������������
	 private int locate(int root,int[] in,int startIn,int endIn)
	 {
		 for (int i = startIn; i < endIn; i++)
		{
			if(root == in[i])
				return i;
		}
		 return -1;
	 }

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

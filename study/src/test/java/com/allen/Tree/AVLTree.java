package com.allen.Tree;

/**
 * 二叉平衡树AVL树
 * 
 * @author lulf
 * @date 2019年1月23日
 * @param <T>
 */
public class AVLTree<T extends Comparable<T>> {
	// 根节点
	private AVLTreeNode<T> mRoot;

	/**
	 * 构造函数
	 */
	public AVLTree() {
		mRoot = null;
	}

	/**
	 * 获取树的高度
	 * 
	 * @return
	 */
	public int getTreeHigh() {
		return getTreeHigh(mRoot);
	}

	/**
	 * 获取树的高度
	 * 
	 * @return
	 */
	private int getTreeHigh(AVLTreeNode<T> treeNode) {
		if (treeNode != null) {
			return treeNode.height;
		}
		return 0;
	}

	/**
	 * 查找
	 */
	public AVLTreeNode<T> search(T key) {
		return search(mRoot, key);
	}

	/**
	 * 递归查找
	 * 
	 * @param x
	 * @param key
	 * @return
	 */
	private AVLTreeNode<T> search(AVLTreeNode<T> x, T key) {
		// 代表AVL树为空
		if (x == null) {
			return x;
		}
		// 比较下根节点和我们要搜索的节点大小
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {// key比根小，查左孩子
			return search(x.left, key);
		} else if (cmp > 0) {// key比根大，查右孩子
			return search(x.right, key);
		} else {
			return x;
		}
	}

	/**
	 * 
	 * @return
	 */
	public AVLTreeNode<T> getMin() {
		return getMin(mRoot);
	}

	/**
	 * 获取最小的节点
	 * 
	 * @param root
	 * @return
	 */
	private AVLTreeNode<T> getMin(AVLTreeNode<T> root) {
		if (root == null) {
			return root;
		}
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	/**
	 * 获取最大节点【其实就是右子节点】
	 * 
	 * @return
	 */
	public AVLTreeNode<T> getMax() {
		return getMax(mRoot);
	}

	private AVLTreeNode<T> getMax(AVLTreeNode<T> root) {
		if (root == null) {
			return root;
		}
		while (root.right != null) {
			root = root.right;
		}
		return root;
	}

	/**
	 * 左左【左单旋】
	 * 
	 * @param x
	 * @return 旋转后的根节点
	 */
	public AVLTreeNode<T> LLRotation(AVLTreeNode<T> k2) {
		AVLTreeNode<T> k1;
		k1 = k2.left;
		k2.left = k1.right;
		k1.right = k2;
		k2.height = Math.max(getTreeHigh(k2.left), getTreeHigh(k2.right)) + 1;
		k1.height = Math.max(getTreeHigh(k1.left), k2.height) + 1;
		return k1;
	}

	/**
	 * 右右【右单旋】
	 * 
	 * @param k1
	 * @return
	 */
	public AVLTreeNode<T> RRRotation(AVLTreeNode<T> k1) {
		AVLTreeNode<T> k2;
		k2 = k1.right;
		k1.right = k2.left;
		k2.left = k1;
		k1.height = Math.max(getTreeHigh(k1.left), getTreeHigh(k1.right)) + 1;
		k2.height = Math.max(getTreeHigh(k2.right), k1.height) + 1;
		return k2;
	}

	/**
	 * 左右【左双旋转】
	 * 
	 * @param k3
	 * @return
	 */
	public AVLTreeNode<T> LRRotation(AVLTreeNode<T> k3) {
		k3.left = LLRotation(k3.left);
		return RRRotation(k3);
	}

	/**
	 * 右左【右双旋转】
	 * 
	 * @param k4
	 * @return
	 */
	public AVLTreeNode<T> RLRotation(AVLTreeNode<T> k4) {
		k4.right = RRRotation(k4.right);
		return LLRotation(k4);
	}

	/**
	 * 插入数据
	 * 
	 * @param key
	 */
	public void insert(T key) {
		mRoot = insert(mRoot, key);
	}

	/**
	 * 插入数据
	 * 
	 * @param mRoot2
	 * @param key
	 * @return
	 */
	private AVLTreeNode<T> insert(AVLTreeNode<T> tree, T key) {
		// 如果根节点为空则创建根节点
		if (tree == null) {
			tree = new AVLTreeNode(key, null, null);
		} else {
			int cmp = key.compareTo(tree.key);
			if (cmp < 0) { // key比根数值小，应该落地左子树
				tree.left = insert(tree.left, key);
				// 插入之后需要判断二叉树是否还维持平衡【左右高度差大于1】
				if (getTreeHigh(tree.left) - getTreeHigh(tree.right) == 2) {
					// 需要调节【key比根的左子数值小，意味着要进行左旋】
					if (key.compareTo(tree.left.key) < 0) {
						LLRotation(tree);
					} else {
						LRRotation(tree);
					}
				}
			} else if (cmp > 0) {// key比根数值小，应该落地右子树
				tree.right = insert(tree.right, key);
				if (getTreeHigh(tree.right) - getTreeHigh(tree.left) == 2) {
					if (key.compareTo(tree.right.key) < 0) {
						RRRotation(tree);
					} else {
						RLRotation(tree);
					}
				}
			} else {
				System.out.println("添加了相同的节点");
			}
		}
		tree.height = Math.max(getTreeHigh(tree.left), getTreeHigh(tree.right)) + 1;
		return tree;
	}

	public void remove(T key) {
		// 刪除先要看看这个key是否存在
		AVLTreeNode<T> z = search(key);
		if (z != null) {
			mRoot = remove(mRoot, z);
		}
	}

	private AVLTreeNode<T> remove(AVLTreeNode<T> tree, AVLTreeNode<T> z) {
		if (tree == null || z == null) {
			return null;
		}
		int cmp = z.key.compareTo(tree.key);
		if (cmp < 0) {
			tree.left = remove(tree.left, z);
			// 删除节点后，若AVL树失去平衡，则进行相应的调节。
			if (getTreeHigh(tree.right) - getTreeHigh(tree.left) == 2) {
				AVLTreeNode<T> r = tree.right;
				if (getTreeHigh(r.left) > getTreeHigh(r.right))
					tree = RLRotation(tree);
				else
					tree = RRRotation(tree);
			}
		} else if (cmp > 0) { // 待删除的节点在"tree的右子树"中
			tree.right = remove(tree.right, z);
			// 删除节点后，若AVL树失去平衡，则进行相应的调节。
			if (getTreeHigh(tree.left) - getTreeHigh(tree.right) == 2) {
				AVLTreeNode<T> l = tree.left;
				if (getTreeHigh(l.right) > getTreeHigh(l.left))
					tree = LRRotation(tree);
				else
					tree = LLRotation(tree);
			}
		} else { // tree是对应要删除的节点。
			// tree的左右孩子都非空
			if ((tree.left != null) && (tree.right != null)) {
				if (getTreeHigh(tree.left) > getTreeHigh(tree.right)) {
					// 如果tree的左子树比右子树高；
					// 则(01)找出tree的左子树中的最大节点
					// (02)将该最大节点的值赋值给tree。
					// (03)删除该最大节点。
					// 这类似于用"tree的左子树中最大节点"做"tree"的替身；
					// 采用这种方式的好处是：删除"tree的左子树中最大节点"之后，AVL树仍然是平衡的。
					AVLTreeNode<T> max = getMax(tree.left);
					tree.key = max.key;
					tree.left = remove(tree.left, max);
				} else {
					// 如果tree的左子树不比右子树高(即它们相等，或右子树比左子树高1)
					// 则(01)找出tree的右子树中的最小节点
					// (02)将该最小节点的值赋值给tree。
					// (03)删除该最小节点。
					// 这类似于用"tree的右子树中最小节点"做"tree"的替身；
					// 采用这种方式的好处是：删除"tree的右子树中最小节点"之后，AVL树仍然是平衡的。
					AVLTreeNode<T> min = getMax(tree.right);
					tree.key = min.key;
					tree.right = remove(tree.right, min);
				}
			} else {
				AVLTreeNode<T> tmp = tree;
				tree = (tree.left != null) ? tree.left : tree.right;
				tmp = null;
			}
		}
		return tree;
	}
}

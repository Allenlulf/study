package com.sbcq;

/**
 * ����ӿڱ��
 * 
 * @author lulf
 * @param <K>
 * @param <V>
 */
public interface MyMap<K, V> {
	// MyMap ���������ǿ��ٴ�
	public V put(K k, V v);

	// ����ȡ
	public V get(K k);

	// ����һ���ڲ��Ľӿ�
	public interface Entry<K, V> {
		public K getKey();

		public V getValue();
	}
}
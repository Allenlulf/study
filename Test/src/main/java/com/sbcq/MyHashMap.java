package com.sbcq;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> implements MyMap<K, V> {

	// ���������С 16
	// ������������������������һ���������������� 4 usesize/defaulLenth =4/16=0.25 ��ʹ����<0.75,��������
	private static int defaulLenth = 1 << 4;
	// ���ݱ�׼ ��ʹ�õ�useSize / ���鳤�� >0.75
	// defaulAddSizeFactor ���� ������ݸ��ʱ�� �洢С ���Ǿ��Ǵ���ȡ��Ч�ʽ���
	// 0.9 ���޵����鳤�ȿռ�λ���ڻ��γ����� �ڴ���ȡֵ�ж�������д����ı������ж�(�߼�)
	// ��С �ڴ�ʹ�ñȽ϶࣬ʹ���ʲ��ߣ�����˷�
	private static double defaulAddSizeFactor = 0.75;

	// ʹ������λ�õ�����
	private int useSize;

	// ����Map �Ǽ� ֻҪ ����֮һ ����
	private Entry<K, V>[] table = null;

	// Spring ����ģʽ����
	public MyHashMap() {
		this(defaulLenth, defaulAddSizeFactor);
	}

	public MyHashMap(int length, double defaulAddSizeFactor) {
		if (length < 0)
			throw new IllegalArgumentException("��������Ϊ����" + length);
		if (defaulAddSizeFactor <= 0 || Double.isNaN(defaulAddSizeFactor)) {
			throw new IllegalArgumentException("���ݱ�׼�����Ǵ���0������" + defaulAddSizeFactor);
		}
		this.defaulLenth = length;
		this.defaulAddSizeFactor = defaulAddSizeFactor;
		table = new Entry[defaulLenth];
	}

	@Override
	public V put(K k, V v) {
		// �洢���ж��Ƿ���Ҫ����
		if (useSize > defaulAddSizeFactor * defaulLenth) {
			up2Size();
		}
		// ��ȡ�����±�
		int index = getIndex(k, table.length);
		Entry<K, V> entry = table[index];
		// �ж����entry�Ƿ�Ϊ�գ�Ϊ����ζ��δ��ɢ�е�
		if (entry == null) {
			table[index] = new Entry(k, v, null);
			useSize++;
		} else if (entry != null) {
			// �γ�������ṹ
			table[index] = new Entry(k, v, entry);
		}
		return table[index].getValue();
	}

	// Ѱ��������±�
	private int getIndex(K k, int length) {
		int m = length - 1;
		int index = hash(k.hashCode()) & m;
		return index;
	}

	// �Զ���д�Լ���hash�㷨
	private int hash(int hashCode) {
		hashCode = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
		return hashCode ^ ((hashCode >>> 7) ^ (hashCode >>> 4));
	}

	// ����
	private void up2Size() {
		// ������ݣ��޷Ǿ����½�һ��2���ռ������
		Entry<K, V>[] newTable = new Entry[2 * defaulLenth];
		// ������������õ���������
		againHash(newTable);
	}

	// ������������ɢ�е���������
	private void againHash(MyHashMap<K, V>.Entry<K, V>[] newTable) {
		List<Entry<K, V>> entryList = new ArrayList<MyHashMap<K, V>.Entry<K, V>>();
		// forѭ�� �����������ݱ�ȫ����������entryList��
		for (int i = 0; i < table.length; i++) {
			if (table[i] == null) {
				continue;
			}
			// �����Ҵ浽�����ϵ�entry����
			foundEntryByNext(table[i], entryList);
		}
		// ����entryList
		if (entryList.size() > 0) {
			useSize = 0;
			defaulLenth = 2 * defaulLenth;
			for (Entry<K, V> entry : entryList) {
				if (entry.next != null) {
					entry.next = null;
				}
				put(entry.getKey(), entry.getValue());
			}
		}
	}

	private void foundEntryByNext(MyHashMap<K, V>.Entry<K, V> entry, List<MyHashMap<K, V>.Entry<K, V>> entryList) {
		// �γ�������ṹ
		if (entry != null && entry.next != null) {
			entryList.add(entry);
			// �ݹ飬���ϵ�һ���ȡ��entry
			foundEntryByNext(entry.next, entryList);
		} else {
			// û����������
			entryList.add(entry);
		}
	}

	public int getUseSize() {
		return useSize;
	}

	@Override
	public V get(K k) {
		// hashCode (new Person(10,'llf'))--->hash---getindex--->����λ��
		int index = getIndex(k, table.length);
		if (table[index] == null) {
			throw new NullPointerException();
		}
		return findByValueByEqualKey(k, table[index]);
	}

	private V findByValueByEqualKey(K k, MyHashMap<K, V>.Entry<K, V> entry) {
		if (k == entry.getKey() || k.equals(entry.getKey())) {
			return entry.getValue();
		} else if (entry.next != null) {
			return findByValueByEqualKey(k, entry.next);
		}
		return null;
	}

	// ����һ���ڲ��洢�Ķ�������

	class Entry<K, V> implements MyMap.Entry<K, V> {
		K k;
		V v;
		// ָ���Ǳ�this��ѹϽ����Entry����
		Entry<K, V> next;

		public Entry(K k, V v, Entry<K, V> next) {
			this.k = k;
			this.v = v;
			this.next = next;
		}

		@Override
		public K getKey() {
			return k;
		}

		@Override
		public V getValue() {
			return v;
		}
	}
}
package study.allen.Map;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义HashMap
 * 
 * @author lulf
 * @date 2019年1月14日
 * @param <K>
 * @param <V>
 */
public class HashMap<K, V> implements Map<K, V> {

	// 底层数据结构为散列，散列数组的默认大小
	private static int DEFAULTSIZE = 1 << 4;

	// 扩容因子
	private static double DEFAULTADDSIZE = 0.75;

	// 当前使用的大小
	private static int usesize;

	// 散列数组
	private Entry[] table;

	public HashMap() {
		this(DEFAULTSIZE, DEFAULTADDSIZE);
	}

	public HashMap(int dEFAULTSIZE2, double dEFAULTADDSIZE2) {
		if (dEFAULTSIZE2 <= 0) {
			throw new IllegalArgumentException("初始化大小不可以为负数");
		}
		if (dEFAULTADDSIZE2 <= 0 || Double.isNaN(dEFAULTADDSIZE2)) {
			throw new IllegalArgumentException("扩载因子不符合规范");
		}
		this.usesize = 0;
		this.DEFAULTSIZE = dEFAULTSIZE2;
		this.DEFAULTADDSIZE = dEFAULTADDSIZE2;
		table = new Entry[DEFAULTSIZE];
	}

	@Override
	public V put(K k, V v) {
		// 判断是否需要扩容
		if (usesize > DEFAULTSIZE * DEFAULTADDSIZE) {
			resize();
		}
		int index = getIndex(k, table.length);
		Entry<K, V> entry = table[index];
		if (entry == null) {
			table[index] = new Entry<K, V>(k, v, null);
			usesize++;
		} else {
			table[index] = new Entry<K, V>(k, v, entry);
		}
		return (V) table[index].getValue();
	}

	// 获取数组下标
	private int getIndex(K k, int length) {
		int m = length - 1;
		int result = hash(k.hashCode()) & m;
		return result;
	}

	// 自定义hash函数
	private int hash(int hashCode) {
		hashCode = hashCode ^ (hashCode >>> 12) ^ (hashCode >>> 7);
		return hashCode ^ (hashCode >>> 8) ^ (hashCode >>> 5);
	}

	// 扩容
	private void resize() {
		Entry[] newtable = new Entry[2 * DEFAULTSIZE];
		List<Entry<K,V>>list=new ArrayList<Entry<K,V>>();
		//复制旧的散列
		for(int i=0;i<table.length;i++){
			if(table[i]==null){
				continue;
			}
			Found1(table[i],list);	
		}
		
		if(list.size()>0){
			usesize=0;
			this.DEFAULTSIZE=2 * DEFAULTSIZE;
			table=newtable;
			for (Entry<K, V> entry : list) {
				if(entry.next!=null){
					entry.next=null;
				}
				put(entry.getKey(), entry.getValue());
			}
		}
	}

	private void Found1(Entry entry, List<Entry<K, V>> list) {
		if(entry.next!=null){
			list.add(entry);
			Found1(entry.next,list);
		}else{
			list.add(entry);
		}
	}

	@Override
	public V get(K k) {
		int index=getIndex(k, table.length);
		Entry<K, V>entry=table[index];
		if(entry==null){
			throw new NullPointerException("沒有此鍵");
		}
		return Found2(entry,k);
	}

	// 拉链法解决散列冲突
	private V Found2(Entry<K, V> entry, K k) {
		if(k.equals(entry.getKey())&&k==entry.getKey()){
			return entry.getValue();
		}else if(entry.next!=null){
			return Found2(entry.next, k);
		}
		return null;
	}
}

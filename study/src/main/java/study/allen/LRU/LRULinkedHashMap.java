package study.allen.LRU;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 基于LinkedHashMap实现LRU缓存
 * 
 * @author lulf
 * @date 2019年1月14日
 * @param <K>
 * @param <V>
 */
public class LRULinkedHashMap<K, V> {

	// 最大缓存大小
	private int cacheSize;

	// 接触LinkedHashMap来做
	private LinkedHashMap<K, V> cacheMap;

	// 初始化
	public LRULinkedHashMap(int cachesize) {
		this.cacheMap = cacheMap;
		cacheMap = new LinkedHashMap<K, V>(1 << 4, 0.75F, true) {
			protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
				if (cacheSize + 1 == cacheMap.size()) {
					return true;
				} else {
					return false;
				}
			}
		};
	}

	public void put(K k, V v) {
		cacheMap.put(k, v);
	}

	public V get(K k) {
		return cacheMap.get(k);
	}

	public Collection<Map.Entry<K, V>> getAll() {
		return new ArrayList<Map.Entry<K, V>>(cacheMap.entrySet());
	}
}

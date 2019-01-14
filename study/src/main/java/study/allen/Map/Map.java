package study.allen.Map;

public interface Map<K,V> {
	
	public V put(K k,V v);
	
	public V get(K k);

}

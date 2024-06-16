package it.unipr.informatica.exam20230606.es3;

public interface Queue<Object> {
	public void add(Object val);
	public Object remove()throws IllegalStateException;
}

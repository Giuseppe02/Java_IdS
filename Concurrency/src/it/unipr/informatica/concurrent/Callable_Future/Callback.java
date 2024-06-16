package it.unipr.informatica.concurrent.Callable_Future;

public interface Callback<T> {
	public void onSuccess(T result);
	public default void onFailure(Throwable t) {
		t.printStackTrace();
	}
}

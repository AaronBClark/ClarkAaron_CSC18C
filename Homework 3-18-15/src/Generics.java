
public class Generics<T> {
	private T t;
	public Generics(T data){t = data;}
	public void set(T t){this.t = t;}
	public T get(){return t;}
}

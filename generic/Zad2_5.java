package generic;

import java.util.ArrayList;

public class Zad2_5<E> extends ArrayList {
//	public int getSize() {
//		return list.size();
//	}

	public E peek() {
		return (E)get(size() - 1);
	}

	public void push(E o) {
		add(o);
	}

	public E pop() {
		E o = (E)get(size() - 1);
		remove(size() - 1);
		return o;
	}

	public boolean isEmpty() {
		return isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + super.toString();
	}
}


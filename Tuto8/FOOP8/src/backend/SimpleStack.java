package backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SimpleStack<T> {

	private ArrayList<T> stack;
	
	public SimpleStack() {
		stack = new ArrayList<T>();
	}
	
	public void push(T truc) {
		stack.add(truc);
	}
	
	public T pop() {
		if(stack.size()>0) {
			T tmp;
			tmp = stack.get(stack.size()-1);
			stack.remove(tmp);
			return tmp;
		} else {
			return null;
		}

	}
	
	public T peek() {
		if(stack.size()>0)
			return stack.get(stack.size()-1);
		else
			return null;
	}
	
	public static void main(String[] args) {
		ArrayList<Double> tab = new ArrayList<Double>();
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Saisissez un double : "+(5-i));
			tab.add(s.nextDouble());
		}
		
		ArrayList<Double> tmp = new ArrayList<Double>(tab);
		Collections.sort(tmp);
		
		for(int i=tmp.size(); i<=0; i--) {
			System.out.println(tmp.get(i));
		}
	}
}

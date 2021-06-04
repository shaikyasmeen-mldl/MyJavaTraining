package com.rakute.train.generic;
import java.util.*;
public class FixedArrayClass implements Stack {
	//List<Integer>mylist=new ArrayList<Integer>();
	Object[] contents;
	int top = -1;
	
	public FixedArrayClass(int capacity) {
		contents = new Object[capacity];
	}

	@Override
	public void push(Object element) {
		contents[++top] = element;
	}
	
	@Override
	public Object pop() {
		return contents[top--];
	}
}

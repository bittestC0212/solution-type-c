package problem03;

public class MyStack {
	
	private String[] buffer;
	private int sizes;
	private int top;

	public MyStack( int size ) {
		sizes = size;
		top =0;
		String[] buffer = new String[sizes];
	}
	
	public void push(String item) {
		if(isFull()) {
			return null;
		}else {
			buffer[top++]=item;
		}
	}

	public String pop() {
		if(isEmpty()){
			return null;
		}else {
			top =top-1;
		}
		return top;
	}

	public boolean isEmpty() {
		return top <=0 ? true : false;
	}
	public boolean isFull() {
		return top == sizes ? true : false;
	}
	public int size() {
		return 0;
	}

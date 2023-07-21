package Exception;

public class Sample {
	public void findA() {
		findB();
			}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.findA();
	}

}

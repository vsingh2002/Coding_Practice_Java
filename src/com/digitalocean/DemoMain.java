package com.digitalocean;

// Program to show the example of Inheritance
class Demo {
	public void write() {
		System.out.println("This is write method");
	}

	public void read() {
		System.out.println("This is read method");
	}
}

public class DemoMain extends Demo {
	public static void main(String[] args) {
		DemoMain dm = new DemoMain();
		dm.write();
		dm.read();
	}

}

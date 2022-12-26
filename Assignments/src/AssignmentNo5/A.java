//11.What will be the output of the following program?
package AssignmentNo5;

class A {
	String s = "Class A";
}

class B extends A {
	String s = "Class B";

	B() {
		System.out.println(super.s);
	}
}

class C extends B {
	String s = "Class C";

	C() {
		System.out.println(super.s);
	}
}


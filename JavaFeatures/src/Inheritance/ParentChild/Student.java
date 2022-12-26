package Inheritance.ParentChild;

public class Student extends CollagePerson {
	int percent;

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	void Grade() {
		if (percent <= 95 && percent >= 85) {
			System.out.println("A grade");
		} else if (percent <= 85 && percent >= 70) {
			System.out.println("B grade");
		} else if (percent <= 70 && percent >= 55) {
			System.out.println("c grade");
		} else {
			System.out.println("pass");
		}
	}
}

package HomeVideoPrograms;

public class Whileprinttableof7and8 {
	public static void main(String[] args) {
		int i = 1, num1 = 7, num2 = 8;
		System.out.println("Table of 7\tTable of 8");
		while (i <= 10) {

			System.out.println(i * num1 + " \t " + i * num2);
			i++;
		}
	}
}

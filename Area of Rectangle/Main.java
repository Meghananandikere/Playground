import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		 Scanner in = new Scanner(System.in);
      int length=in.nextInt();
      int breadth =in.nextInt();
		int area = length*breadth;
      System.out.println(area);
	}
}
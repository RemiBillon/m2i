package m2i;

public class Boucles {

	public static void main(String[] args) {
		int i = 0, j = 10;
		// for (; ;) {
		// System.out.println(i++ + " " + j--);
		// if(i==10) break;
		// }
		boolean isCorrect= i< j;
//		while (j > 0) {
//			System.out.println(i++ + " " + j--);
//
//		}
		while (isCorrect) {
			System.out.println(i++ + " " + j--);
			if(i == 10){
				isCorrect = false;
			}
		}
		

	}

}

package LearningPackage;

class AccessSpecifiers {
	public static void main(String[] args) {
		for(int i = 1; i<=3;i++) {
			for(int j=1;j<= i-1;j++) {
				System.out.print(" ");
				for (int k = 1; k<=j-2; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}

public class JavaPramid{

	public static void createPramid(int num){

		int j;
		for(int i = 1; i < num; i++){
			for(j = (num - i); j >= 0; j--){
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++){
				System.out.print(j);
			}
			for(j = i - 1; j > 0; j--){
				System.out.print(j);
			}
			System.out.println("");
		}

	}
}
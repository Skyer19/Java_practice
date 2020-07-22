public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mar1 ={ {3, 9, 18, 2, 6, 7 },
				      {11, 0, 50, 2, 41, 49},
				      {37, 11, 68, 2, 96, 20 },
				      {2, 23, 33, 22, 61, -89},
				      };
		int[][] mar2 ={
			          {70, 21, 1, 2, 49, 26 },
				      {90, 19, 33, 22, 43, 9 },
				      {102, 28, 83, 1, -30, 99 },
				      {72, 55, 39, 17, 103, 99 }
		};
		for(int i=0;i<4;i++) {
			for(int j=0;j<6;j++) {
				mar2[i][j]=mar1[i][j]-mar2[i][j];
			}
		}
		int sum=0;
		for(int i=0;i<4;i++) {
			for(int k=0;k<6;k++) {
				if(mar2[i][k]>0) {
					sum=sum+mar2[i][k];
				}
			}
			
		}
		System.out.println(sum);
		for(int i=0;i<4;i++) {
			System.out.print("{");
			for(int k=0;k<6;k++) {
			    if(k<5){
				System.out.print(mar2[i][k]+", ");
			    }else{
			      System.out.print(mar2[i][k]);  
			    }
			}
			System.out.println("},");
		}
	}

}
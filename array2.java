class array2{
	public static void main(String args[]){
		int[][] arr;	
		arr= new int[2][4];	
		
		int cnt=1;
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				arr[i][j]=cnt; cnt++;	
			}	
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");	
		}
	}
}
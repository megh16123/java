//scope of variable


 class scope{
	public static void main(String args[]){
		int i=10;
		if(i==10)
		{//starts a new scope/block of code
	        int j=20;
			
			//i and j both variable are known in this scope.
			System.out.println("i="+i+" and j="+j);
			i=j/4;
		}
		//j=50; Error!! as j is not known in this scope
		
		//i is still known in this scope/block
		
		System.out.println("i="+i);
	}
}
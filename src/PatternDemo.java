
public class PatternDemo {

	public static void main(String[] args) {
		int n=4;
		
		//Using 2 for loops
		for(int i=0;i<n;i++){

			for(int j=n-1;j>=0;j--){
				if(j>i){
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}   
			System.out.println("");
		}
		
		//System.out.println("reminder:"+4%1+" "+4%2+" "+4%3);
		
		/*int rem;
		try{
		for(int i=1;i>=n;i++){
			System.out.println("Inside for loop:");
			rem = (n-i)%10; //3
			System.out.println("rem:"+rem);
			if(i>= rem){
				System.out.print("#");
			}else{
				System.out.print(" ");
			}
			
		}
		}catch(Exception ex){
			ex.printStackTrace();
		}*/

	}
}


/*
___*
__**
_***
****

 */
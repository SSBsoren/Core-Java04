//write a program to use a break statement to go to the end of block.

public class Break {

	public static void main(String[] args) {
		boolean x=true;
		bl1 : {
			bl2 : {
			   bl3 : {
			       System.out.println("BLOCK ");
			       if(x) break bl2;// goto end of bl2
			       		}//end of bl3
		System.out.println("Block2");
				}//end of bl2
		System.out.println("Block1");
		}//end of bl1
		System.out.println("out of all block");
	}

}

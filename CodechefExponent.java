/* package practice from codechef; // don't place package name! 
    Finding a number exponential using 2 methods
    1. Recursion
    2. Tree
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodechefExponent
{
    public static int pow(int x, int n)
    {
        if(n > 1 ){
            x = x * pow(x,n-1);
            
        }
        return x;
    }
    
    public static int exp(int x, int b){
        if(x == 1 || x == 0){ return b; }
        else{
            int y = x/2;
            int z = x - y;
            return ( exp(y,b) * exp(z,b) );
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int x = 3;
		int y = 6;
		
		int ans1 = pow(x,y);
		int ans2 = exp(y,x);
		System.out.println(ans1);
		System.out.println(ans2);
	}
}

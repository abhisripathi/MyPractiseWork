/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class MathematicsForCp
{
	public static void main(String[] args) {
        boolean isPrime[]=seiveOfErasthenes(20);
        for(int i=0; i<=20; i++){
            System.out.println(i+ " " + isPrime[i]);
        }
	}
        
    static boolean[] seiveOfErasthenes(int n){
        boolean isPrime[]=new boolean[n+1];
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2; i*i<=n; i++){
            for(int j=2*i; j<=n; j+=i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}

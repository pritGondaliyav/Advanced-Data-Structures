/*

1) What is  Dynamic programming ?
 --> Dynamic programming is a technique that breaks the problems into sub-problems, and saves the result for future purposes so that we do not need to compute the result again 
 --> Dp is tack bruteforce and it optimize it 

Some time some Qes Coding is problomatic  
becuse we redo stap again & again 
we need to avoid repeting think we done earlier 
like:-
 1 + 1 + 1 + 1 + 1  = 6 
if we store sum and use agin in other opration than we get ans faster 

This is a DP Principal 

*/


/*
Pattern Of sudocode  every DP pro follow this pattern 
*/

dp(perametrs,  perametrs ){
 
 /*
      memo :- something to whare store your reminders 
      memo will memorised everything what you are done earlier
      
      most of time memo formet are array memo[]
      memo[] in filled -1 is this is defult value 
 */
 if(check base condition)
 {
  return  value ;
 }
 // Before moving down i am calculating it if memo has ans alerady  
 
 if(memo[parameters] != -1)
 {
   return memo[parameters];
 }
 
  memo
   
   
}





=======================Fibonacci Of N Numberusing recursion =======================

// Time Complexity 2*N

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        System.out.print("Fibo" + fibo(n));
    }

    public static int fibo(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {

            return fibo(n - 1) + fibo(n - 2);
        }
    }
}






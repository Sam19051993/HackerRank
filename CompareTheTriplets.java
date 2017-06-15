/****************************************************************************************************************************************************************************************************/
/*																			COMPARE THE TRIPLETS																									*/
/*																																																    */
/*								Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points															*/
/*										on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.     															*/
/*																																																	*/
/*								We define the rating for Alice's challenge to be the triplet A = (a0,a1,a2), and the rating for Bob's challenge to be the											*/
/*																					triplet B = (b0,b1,b2).																							*/
/*																																																	*/
/*										Your task is to find their comparison points by comparing a0 with b0, a1 with b1, and a2 with b2.															*/
/*																																																	*/
/*																	If ai > bi, then Alice is awarded  point.																						*/
/*																	If ai < bi, then Bob is awarded  point.																							*/
/*																	If ai = bi, then neither person receives a point.																				*/
/*																	Comparison points is the total points a person earned.																			*/
/*																																																	*/
/*										Given A and B, can you compare the two challenges and print their respective comparison points?																*/
/****************************************************************************************************************************************************************************************************/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        
        int [] result = new int[3];
        
        if(a0 > b0){
            result[0] = 1;
        }
        else if (a0 < b0){
            result[0] = -1;
        }
        else{
            result[0] = 0;
        }
        
        if(a1 > b1){
            result[1] = 1;
        }
        else if (a1 < b1){
            result[1] = -1;
        }
        else{
            result[1] = 0;
        }
        
        if(a2 > b2){
            result[2] = 1;
        }
        else if (a2 < b2){
            result[2] = -1;
        }
        else{
            result[2] = 0;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        int aliceCount = 0 , bobCount = 0;
        
        for (int loopIndex = 0 ; loopIndex < result.length ; loopIndex ++){
            
            if(result[loopIndex] == 1){
                aliceCount++;
            }
            
            else if (result[loopIndex] == -1){
                bobCount++;
            }
        }
        
        System.out.println(aliceCount + " " + bobCount);
        System.out.println("");
    }
}

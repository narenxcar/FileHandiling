/*
 * You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.

Example

Remove an  at positions  and  to make  in  deletions.

Function Description

Complete the alternatingCharacters function in the editor below.

alternatingCharacters has the following parameter(s):

string s: a string
Returns

int: the minimum number of deletions required
Input Format

The first line contains an integer , the number of queries.
The next  lines each contain a string  to analyze.

Constraints

Each string  will consist only of characters  and .
Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
Sample Output

3
4
0
0
4
Explanation

The characters marked red are the ones that can be deleted so that the string does not have matching adjacent characters.

 */
import java.util.*;
class Alternate{
	public int alternatingCharacters(String s) {
        int count=0;
    for(int index=0;index<s.length()-1;index++){
        if(s.charAt(index)==s.charAt(index+1)){
            count++;
        }
    }
    return count;
    }

}
public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		//Enter the String character
		String character=in.next();
		Alternate alternate=new Alternate();
		System.out.print("Number of elements are deleted : ");
		System.out.println(alternate.alternatingCharacters(character));
	}

}

package com.org.tech;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/*Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. 
 * She tabulates the number of times she breaks her season record for most points and least points in a game
 Points scored in the first game establish her record for the season, and she begins counting from there.
Example :
		scores=[10,20,4,21]
		
Scores are in the same order as the games played. She tabulates her results as follows:
                                    Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.
Function Description
Complete the breakingRecords function in the editor below.
breakingRecords has the following parameter(s):
int scores[n]: points scored per game
Returns
int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records, and index  is for breaking least points records.
Input Format

The first line contains an integer , the number of games.
The second line contains  space-separated integers describing the respective values of*/

class Result {
	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> breakingRecordList= new ArrayList<>();

		int minimuScore=scores.get(0);
		int leastbreakingpoints=0;
		int maximunScore=scores.get(0);
		int mostbreakingpoints=0;

		for(int i=1;i<scores.size();i++){
			if(scores.get(i)<minimuScore){
				minimuScore=scores.get(i);
				leastbreakingpoints++;
			}
			else if(scores.get(i)>maximunScore){
				maximunScore=scores.get(i);
				mostbreakingpoints++;
			}
		}
		breakingRecordList.add(mostbreakingpoints);
		breakingRecordList.add(leastbreakingpoints);

		return breakingRecordList;
	}

}

public class BreakingRecords {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter how many times that he want to play :");
		int sizeOftheScore=scanner.nextInt();
	
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter the Scores :");
		for(int i=0;i<sizeOftheScore;i++) {
			list.add(scanner.nextInt());
		}
		System.out.println(Result.breakingRecords(list));
	}
}

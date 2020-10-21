package chapter_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Extra_Hacker_Rank_List_Sort {

	private int id;
	private String fname;
	private double cgpa;
	public Extra_Hacker_Rank_List_Sort(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
 class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		ArrayList<Extra_Hacker_Rank_List_Sort> studentList = new ArrayList<Extra_Hacker_Rank_List_Sort>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Extra_Hacker_Rank_List_Sort st = new Extra_Hacker_Rank_List_Sort(id, fname, cgpa);
			studentList.add(st);
			
			
			testCases--;
		}
			Collections.sort(studentList, new Comparator<Extra_Hacker_Rank_List_Sort>(){
	              @Override
	               public int compare(Extra_Hacker_Rank_List_Sort s1, Extra_Hacker_Rank_List_Sort s2) {
	                    if(s2.getCgpa()>s1.getCgpa()){
	                        return 1;
	                    }else if(s2.getCgpa()<s1.getCgpa()){
	                        return -1;
	                    }
	                    return s1.getFname().compareTo(s2.getFname());
	                }

				
	        });
			
      	for(Extra_Hacker_Rank_List_Sort st: studentList){
			System.out.println(st.getFname());
		}
	}
}

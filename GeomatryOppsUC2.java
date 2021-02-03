package com.oops;

import java.util.Scanner;

public class GeomatryOppsUC2 {
	
	public static int calc(int x1, int y1, int x2, int y2)
	{
		
        System.out.println("ur cordinates are : ("+x1+ "," +y1+ ")" );
        System.out.println("ur cordinates are : ("+x2+ "," +y2+ ")" );
        int a1=x2-x1;
        int a2=y2-y1;
        
        int sq1=(int) Math.pow(a1, 2);
        int sq2=(int) Math.pow(a2, 2);
        
        System.out.println(a1+ " " +a2);
        int value = sq1+sq2;
        
        int value2=(int) Math.sqrt(value);
        //System.out.println("length of the line is " +value2);
        return value2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter the cordinates of the line");
		Scanner sc =new Scanner(System.in);
		int a1=sc.nextInt();
        int b1=sc.nextInt();
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        
        System.out.println("enter the cordinates of the line 2");
        int a11=sc.nextInt();
        int b11=sc.nextInt();
        int a22=sc.nextInt();
        int b22=sc.nextInt();
       
         //int result= calc(a1,b1,a2,b2);
         //int result2= calc(a11,b11,a22,b22);
          Integer res=new Integer(calc(a1,b1,a2,b2));
          Integer res1=new Integer(calc(a11,b11,a22,b22));
          System.out.println(res);
          System.out.println(res1);
         
          Boolean result = equalsfunction(res,res1); 
          
          if(result==true)
          {
           System.out.println("lines are equal");
          }
          else
          {
        	  System.out.println("lines are not equal");
          }
        
         
         
	}

	private static Boolean equalsfunction(Integer n1, Integer n2) {
		// TODO Auto-generated method stub
		boolean s;
		s=n1.equals(n2);
		
		return s;
	}

}

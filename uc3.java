package com.oops;



public class uc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation line1=new length1();
		line1.calc();
	    Integer res=new Integer(line1.calc());
	    
		
		Calculation line2=new length1();
		line2.calc();
		Integer res1=new Integer(line2.calc());
		
		 Boolean result = equalsfunction1(res,res1); 
         
         if(result==true)
         {
          System.out.println("lines are equal");
         }
         else
         {
       	  System.out.println("lines are not equal");
       	   
       	  Integer compare= res.compareTo(res1);
       	  
       	     if(compare>0)
       	     {
       	    	 System.out.println("the longer lines is "+res);
       	     }
       	     
       	     else
       	         {
       	    	 System.out.println("the longer line is "+res1);
       	         }
         }
       
        
        
	

	
	}

	private static Boolean equalsfunction1(Integer n1, Integer n2) {
		// TODO Auto-generated method stub
		
		
		boolean s;
		s=n1.equals(n2);
		
		return s;
	}	

}


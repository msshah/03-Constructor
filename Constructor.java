/**
	* Copyright (c) 2017 Mian Safyan Shah
	*
	* WRITTEN BY		: MIAN SAFYAN SHAH
	* CONTACT		: safyanshah@live.com
	*
	* This program demonstrates the use of Constructors in Java and creating Class Object
	*
	* Use the command line to compile and run this program. It'll run in any IDE but 
	* using command line is preferred.
	*
	* How to compile : Open Command Prompt on Windows or Terminal on Mac OS/Linux/Unix
	* then navigate to the directory of this program and type the following command
	*
	* javac Constructor.java
	*
	* How to Run : after successful compilation, type java Constructor, you'll see output
	* on the command line.
	*
	*
  */
  
  class Constructor
  {
  
  	public Constructor()
  	{
  		System.out.println("This is a constructor.");
  	}
  	
  	public static void main(String[] args)
  	{
  		Constructor constructor = new Constructor();
  	}
  	
  } // end of class

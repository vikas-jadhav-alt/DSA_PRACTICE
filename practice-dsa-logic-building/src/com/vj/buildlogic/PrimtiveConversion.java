package com.vj.buildlogic;

public class PrimtiveConversion {

	public static void main(String[] args) {

		/** Execution: Right to Left Always */
		// Char PDT

		char ch = 'A';
		int x = ch;
		System.out.println(x); // 65
		
		double j = 78.9D;
		
		int i = 679; //Allowed
//		int i2 = 889890898908; //CTE: Right Side literal 889890898908 of type int is out of range
//		int i3 = (int)889890898908; // CTE: Same Reason as above: The literal 889890898908 of type int is out of range 

		int i3 = (int)889890898908L; // Allowed //Here RightSide literal is Long, not int..hence literal is lying in range of long data type=> then
												// long right hand side value is forcefully demoted type casted to int data type... then demoted data into int is saved in left side variable xyz which is also of type int

//		int i4 = (int)(long)889890898908; // CTE: Same Reason as above: The literal 889890898908 of type int is out of range 

		
		
		/** int hold's decimal value of char */

//		=====================================================

		// Left hand thing should able to hold right hand side value

		char ch2 = 65;
		System.out.println(ch2); // A

		/** char holds char equivalent of int value on right hand side */

//		char ch3 = 7787897;
		
		/** left hand side variable must be able to hold right hand side value */

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE); // -128 to 127

		byte b1 = 28; // int to byte
//		byte b2 = 128;
		byte b3 = 127;

		long l1 = 1; // int to long
		long l2 = 1L;// captial L or small l //long to long

		/** By defualt 'int', .. 'double' */
		/** Double float */

		int i1 = 34;
		float f1 = 34; // int to float

//		float f2 = 34.5; //CTE: double to float can't be converted
		float f2 = 34.5f;

		double d1 = 35.1;

		//
//		/** Arithmetic Operationns*/ ==> int + double + long = convert first all variables in highest DT and do operation and return result in same DT
		
		byte b6 = 127; // Implicit Type CAsting by Compiler
		byte b7 = 127;
//		byte b8 = b6+b7; //CTE: TypeCasting int to byte: not pssible
		byte b9 = (byte)(b6+b7);
		
//		byte b8 = b6 + b7; //byte + byte = byte but value out of range hence CTE
		
		byte b8 = (byte) (b6 + b7); // Explicit type casting
		System.out.println("b8:" + b8); // b8:-2

//		float fkk = 56.8; //CTE: TypeCasting: double to float not possible
		
		float fll = 56.8f; //No CTE: with f we are telling/instructing the compiler/JVM to store 56.8 as float temporary in compiled code/RAM, not as double.
		
		
		char varun = 45;
//		char varun1 = 40909879875;
	
		
		
		int i8 = b6 + b7;
		System.out.println(i8); // 254

		double d8 = (float) 67.8;
		double d9 = (int) 67.8;
		
		byte ghgj = 50;
		
		int jkl = 50;
//		byte ll = jkl; //CTE: can convert int to byte
		
//		byte lklkl = 8927389728937; //CTE: literal 8927389728937 of type int is out of range
//
//		byte uou = 129; //CTE: can not convert int to byte
//		
		float f9 = (long) 78.9;
		System.out.println(f9); // 78.0

		double d10 = 78; // int to double //
		double d11 = (byte) 78; // byte to double
		
		
//		int i15 = 56L; ///CTE: long to int : not possible: demotion can't happen
		
		int i16 = (int)56L; //MAGIC!!!!
		
		
		
		
		double d90 =56.7;
		System.out.println(d90); //56.7
		
		System.out.println(11.1+11.2); // not 22.3 //22.299999999999997
		
//		int j = 78L;//CTE
		

		
		char ch22 = 65;
//		char ch33 = 98798789; //CTE
		
		char ch33 = (char)908908908; //Explicit Type Cast
		
		
		int f88 = (byte)(long) 78.9; // double->long->byte (demotion) -> int (promotion)
		
		
		char jjj = (short)5;
//		char chk= (long)56; //CTE
		char chk= (char)(long)56; 
		
		short s1 = 5;
//		char manipal = s1; //CTE: Short to Char not Possible Implicitely
		char jhjhj = (char)s1; //Explicitely Possible
		
		

		
		// Integer Primtive Data Types
		byte va = 5;
		byte vb = 6;
//		byte vc = 234; //CTE: Can't Convert Int to Byte
		
		short vsa = 5;
		
		//Floating Primitive Data Types:
//		float vfa = 45.6; //CTE: can convert double to float (Without F)
		
		float vfa = 45.6f;
		double vda = 67.8;
		
		
		
		
		/**
		0. Execution always takes from "right to left"
				int f88 = (byte)(long) 78.9; // double->long->byte (demotion) -> int (promotion)

		1. Promotion sbko psand hain
		2. Demotion kisi ko nahi pasand;... kyonki compiler don't want any data loss
		- Implicit Demotion not allowed by compiler but we can forcefully can do demotion by Explicit Type Casting
			 //  double to int //implicit demotion not allowed..as there precision data loss
			 // similary long to int is not possible implicitely...but we can explicitely type cast and force it to happen
			 
			  * There is Exception:   Character to Interger vice-versa conversion
			  * // int to char// char ch = 65; //implicit demotion is allowed till the point there is no data loss
			  *but ==>  char ch = 2838237; //This implicit demotion is not allowed as data loss will happen
			  *....here also we can use Explicit Type Cast
			  *
			
		3. 
		4. default = 'int', for long L/l ==> default double (d can be used) => for float F/f
		5. double j = 78; //GOOD: Promotion of int to double
		6. int i6= 56.7;   //BAD: CTE: compiler implictely try to demote saved double in RAM into int
		7. int i7 = (int)56.7; //GOOD: 56 // Explicitely Type CAsting: Forcing the compiler not to save right hand side value as double, instead save as int in RAM temporary and then assign this temporary int to xyz variable on left side which is of data type int.. overall here==> Then int to int //no change
		8. long j = 45.7; //CTE:doube(savedinRAM) to long : demotion// pasand nahi aya
		9. long j = (long)45.7; //GOOD
		10. long k = (byte)56.7; // forcing not to save as double intead in byte (forcing demotion explicitely)...but from byte to long (promotion of byte--> bale-bale!!!)
	   
	    Arithmetic Operation:
	    11. = int + doube + long /// result = typecast all constants/variable into highest DT among all first ==> int XYZ data type, second do operations (easy to do as all contants are of XYZ type) , third save data in XYZ data type (obvisouly highest among all)
	    12. => byte + byte = result in byte data type
	    		//but if result exceeding the byte range, then CTE
	    		// but to avoid CTE" we can explicietly type cast like 'int =(byte)result' and  force the compiler to save data in byte data type..even though overflow, data loss take place there ==> ORDER is ORDER like a boss
	   
	    */
		
		
		System.out.println("========================================================");
		System.out.println("========================================================");
		System.out.println("========================================================");
		System.out.println("========================================================");
		System.out.println("========================================================");
		
		
		
		System.out.println((int)Character.MAX_VALUE); //65535
		
		char chx1 = 56;
//		char chx2 = 3248903284908329; //CTE:  literal 3248903284908329 of type int is out of range
		
//		char chx3 = 65538; //CTE: Type mismatch: cannot convert from int to char
		
		char chx3 = (byte)65538; //No CTE
		
		char chx5 = (short)50;
		
		byte bbb1 = 78;
		int gh = bbb1;
		
		int bbb2 = 78;
		byte gh2 = bbb2;
		
		int bbb3 = (int)Integer.valueOf(args[0]);
		byte gh3 = bbb3;
		
		
		
		byte sskkl = 'A';
		char chhh = (short)50;
		char chhh1 = 57;
		int kkkll = '*';
		
		long jjkkl = 'A';
		
//		short shj = (long)89; //CTE: int to long to short
		
		
		char jjkk = 50;
		char chhh3 = (short)50;
		char chhh2 = (byte)50;
		
		char lklkl = 50L; //CTE: type-casting
		char lklkl1 = (long)50; //CTE:  type-casting
		
		char lklkl12 = (int)(long)50; 
		
		char klkl = 50.0; //CTE: double to char not possible
		
		char klkl2 = (int)50.0; 
		
		long jj = 'A';
		int jj2 = 'A';
		short jj3 = 'A';
		byte jj4 = 'A';
		float h = 'A';
		double h2 = 'B';

	}

}

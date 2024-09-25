package first;

public class WrapperClass {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=39;
		double d=60.0D;
		char c='a';
		boolean boo=true;
		
		//Autoboxing:Converting primitives into objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=boo;
		
		
		
		//printing objects
		System.out.println("Byte object:"+byteobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Long object:"+longobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Character object:"+charobj);
		System.out.println("Boolean object:"+booleanobj);
		
		
		//unboxing:Converting objects to primitives
		
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charv=charobj;
		boolean booleanv=booleanobj;
		
		//Printing primitives
		System.out.println("--------->primtives value<---------------");
		System.out.println("Byte value:"+bytevalue);
		System.out.println("Short value:"+shortvalue);
		System.out.println("Integer value:"+intvalue);
		System.out.println("Long value:"+longvalue);
		System.out.println("Float value:"+floatvalue);
		System.out.println("Double value:"+doublevalue);
		System.out.println("Character value:"+charv);
		System.out.println("Boolean value:"+booleanv);
		
		
		


	}

}

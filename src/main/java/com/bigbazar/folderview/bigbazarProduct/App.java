package com.bigbazar.folderview.bigbazarProduct;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    private static int sum = 0;
	private static int val=80;
	
private long valueretuning(long integer){
	System.out.println("Long");
	return integer;
}
private double valueretuning(double integer){
	System.out.println("double");
	return integer;
}
private float valueretuning(float integer){
	System.out.println("float");
	return integer;
}

//details



	public static void main( String[] args )
    {
		
		Properties prop=new Properties();
		
		try {
			prop.load(new FileInputStream(new File("D:/2018_Java-practice_luna/LUNA_workSpace/bigbazarProduct/src/main/java/propertyfiles/variables")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        sum=Integer.parseInt(prop.getProperty("value"));
        System.out.println("-----------------------"+sum);
        System.out.println(null+"");
        System.out.println(null+"sum");
        System.out.println(sum+"val");
        System.out.println("val"+"sum");
        System.out.println(val+"sum");
        System.out.println(val+ sum);
        System.out.println("null"+val+ sum);
        String total = val +"null"+  sum;
		System.out.println(total);

        System.out.println(val+ sum+"null");
        int[] numbers = {1,2,3,4};
		for (int number : numbers) {
			sum=sum+number;
		}
		 System.out.println("sum:"+sum);
	        
    }
}

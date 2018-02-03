import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.twmacinta.*;
import com.twmacinta.util.MD5;

public class Main {
	
	public static void main(String[] args) {	
		
		//first();
		//second();
		//third();
		System.out.println(Method.f("7303c0bf2f"));
		System.out.println(Method.f2("79fd67d181aab976"));
	}

	public static void first() {	
		//--------------------------------------------------------------------------
		String hex1 = "";
		String hex2 = "";
		String text1 = "";
		String text2 = "";
		long licznik = 0;
		String timestamp = "";
		
		//--------------------------------------------------------------------------
		String startText = "40c66634";
		String tortoise = Method.f(startText);
		String hare = Method.f(tortoise);		
		while(!Method.equals(tortoise, hare)) {
			text1 = tortoise;
			tortoise = Method.f(tortoise);
			hare = Method.f(Method.f(hare));
			licznik++;
			if(licznik % 100000000 == 0) System.out.println("1. " + licznik);
		}
		licznik = 0;
		System.out.println("Cycle");
		hex1 = tortoise;
		timestamp = timestamp + System.currentTimeMillis();
		
		//--------------------------------------------------------------------------
		long mu = 0;
		hare = startText;	
		while(!Method.equals(tortoise, hare)) {
			text2 = tortoise;
			tortoise = Method.f(tortoise);
			hare = Method.f(hare);
			mu++;
			licznik++;
			if(licznik % 100000000 == 0) System.out.println("2. " + licznik);
		}
		licznik = 0;
		System.out.println("Cycle beginning");
		hex2 = tortoise;
		timestamp = timestamp + " / " + System.currentTimeMillis();
		
		//--------------------------------------------------------------------------
		long lambda = 1;
		hare = Method.f(tortoise);		
		while(!Method.equals(tortoise, hare)) {
			hare = Method.f(hare);
			lambda++;
			licznik++;
			if(licznik % 100000000 == 0) System.out.println("3. " + licznik);
		}
		licznik = 0;
		System.out.println("Cycle length");
		timestamp = timestamp + " / " + System.currentTimeMillis();
		
		//SPRAWDZENIE--------------------------------------------------------------------------
		/*String temp = startText;
		for(int i=0; i<mu - 1; i++) {
			temp = Method.f(temp);
		}
		text1 = temp;
		temp = hex2;
		for(int i=0; i<lambda-1; i++) {
			temp = Method.f(temp);
		}
		text2 = temp;*/
		
		//--------------------------------------------------------------------------
		System.out.println("hex1 = " + hex1 + " / hex2 = " + hex2);
		System.out.println("text1 = " + text1 + " / text2 = " + text2);
		System.out.println("timestamp = " + timestamp);
	}
	
	public static void second() {	
		//--------------------------------------------------------------------------
		String hex1 = "";
		String hex2 = "";
		String text1 = "";
		String text2 = "";
		
		//--------------------------------------------------------------------------
		String startText = "40c66634";
		String tortoise = Method.f2(startText);
		String hare = Method.f2(Method.f2(tortoise));		
		while(!tortoise.equals(hare)) {
			text1 = tortoise;
			tortoise = Method.f2(tortoise);
			hare = Method.f2(Method.f2(hare));
		}
		System.out.println("Cycle");
		hex1 = tortoise;
		
		//--------------------------------------------------------------------------
		long mu = 0;
		hare = startText;	
		while(!tortoise.equals(hare)) {
			text2 = tortoise;
			tortoise = Method.f2(tortoise);
			hare = Method.f2(hare);
			mu++;
		}
		System.out.println("Cycle beginning");
		hex2 = tortoise;
		
		//--------------------------------------------------------------------------
		/*long lambda = 1;
		hare = Method.f2(tortoise);		
		while(!tortoise.equals(hare)) {
			hare = Method.f2(hare);
			lambda++;
		}
		System.out.println("Cycle length");*/
		
		//SPRAWDZENIE--------------------------------------------------------------------------
		/*String temp = startText;
		for(int i=0; i<mu - 1; i++) {
			temp = Method.f2(temp);
		}
		text1 = temp;
		temp = hex2;
		for(int i=0; i<lambda-1; i++) {
			temp = Method.f2(temp);
		}
		text2 = temp;*/
		
		//--------------------------------------------------------------------------
		System.out.println("hex1 = " + hex1 + " / hex2 = " + hex2);
		System.out.println("text1 = " + text1 + " / text2 = " + text2);
	}
	
	public static void third() {	
		//--------------------------------------------------------------------------
		String hex1 = "";
		String hex2 = "";
		String text1 = "";
		String text2 = "";
		String timestamp = "";
		
		//--------------------------------------------------------------------------
		String startText = "40c66634";
		String tortoise = Method.f(startText);
		String hare = Method.f(Method.f(tortoise));		
		while(!Method.equals(tortoise, hare)) {
			text1 = tortoise;
			tortoise = Method.f(tortoise);
			hare = Method.f(Method.f(hare));
		}
		System.out.println("Cycle");
		hex1 = tortoise;
		timestamp = timestamp + System.currentTimeMillis();
		
		//--------------------------------------------------------------------------
		hare = startText;	
		while(!Method.equals(tortoise, hare)) {
			text2 = tortoise;
			tortoise = Method.f(tortoise);
			hare = Method.f(hare);
		}
		System.out.println("Cycle beginning");
		hex2 = tortoise;
		timestamp = timestamp + " / " + System.currentTimeMillis();
		
		
		//--------------------------------------------------------------------------
		System.out.println("hex1 = " + hex1 + " / hex2 = " + hex2);
		System.out.println("text1 = " + text1 + " / text2 = " + text2);
		System.out.println("timestamp = " + timestamp);
	}
}

package testngprograms;

import org.testng.annotations.Test;

public class Testng1 {

	@Test
	public void print(){
		System.out.println("0");}


	@Test(priority=0)
	public void print1(){
		System.out.println("test");
	}


	@Test(priority=-1)
	public void print2(){
		System.out.println("1");}
	
	@Test(priority=6)
	public void print3(){
		System.out.println("last");}



}

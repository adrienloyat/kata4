package fr.loyat.kata4;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestFootBallTest {

	FileProcessor f = new FileProcessor("/football.dat",new FootBallLineProcessor());
	
	@Test
	public void test() throws IOException{
		Assert.assertEquals(f.process(),"Arsenal");
		

		
	}
}

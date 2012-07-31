package fr.loyat.kata4;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestWeatherTest {

	FileProcessor w = new FileProcessor("/weather.dat",new WeatherLineProcessor());
	
	@Test
	public void test() throws IOException{
		Assert.assertEquals(w.process(),"9");
		

		
	}
	
}

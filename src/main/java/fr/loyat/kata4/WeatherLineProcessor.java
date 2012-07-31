package fr.loyat.kata4;

import java.util.Map;
import java.util.TreeMap;


public class WeatherLineProcessor implements ILineProcessor {


	public Map<Integer,String> processALine(String ligne) {
		TreeMap<Integer,String> map = new TreeMap<>();
		String[] operandes = ligne.trim().split(" +");
		try {
			Integer.parseInt(operandes[0]);
		} catch (NumberFormatException e) {
			return map;
		}
		int tempMax = Integer.parseInt(operandes[1].replace("*", ""));
		int tempMin = Integer.parseInt(operandes[2].replace("*", ""));

		map.put(tempMax - tempMin, operandes[0]);
		return map;
	}


}

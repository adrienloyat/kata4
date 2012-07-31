package fr.loyat.kata4;

import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;



public class FootBallLineProcessor implements ILineProcessor {
	

	public Map<? extends Integer, ? extends String> processALine(String ligne) {
		TreeMap<Integer,String> map = new TreeMap<>();
		String[] operandes = ligne.trim().split("[ -.]+");
		if (operandes.length!=9 || !StringUtils.isNumeric(operandes[0])) return map; //1ere ligne
	
		String team=operandes[1];
		int F = Integer.parseInt(operandes[6]);
		int A = Integer.parseInt(operandes[7]);
	
		map.put(F - A, team);
		return map;
	}
	
}

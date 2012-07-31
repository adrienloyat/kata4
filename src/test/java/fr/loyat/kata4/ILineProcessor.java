package fr.loyat.kata4;

import java.util.Map;

public interface ILineProcessor {
	Map<? extends Integer, ? extends String> processALine(String ligne);
}

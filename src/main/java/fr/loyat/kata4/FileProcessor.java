package fr.loyat.kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.TreeMap;

public class FileProcessor {

	private String file ;
	ILineProcessor lineProcessor;
	
	public FileProcessor(String fileName,ILineProcessor _lineProcessor) {
		super();
		file = fileName;
		this.lineProcessor = _lineProcessor;
	}

	TreeMap<Integer,String> map;

	public String process() throws IOException {
		URI uri=getUri(file);
		try(BufferedReader bf = new BufferedReader(new FileReader(new File(uri)))){
			getDatas(bf);
		}
		return map.lastEntry().getValue();
	}

	private void getDatas(BufferedReader bf) {
		map = new TreeMap<>();
		try {
			while(!bf.readLine().startsWith("<pre>")){}//début data
			String ligne;
			while( !(ligne=bf.readLine()).startsWith("</pre>")){
				map.putAll(lineProcessor.processALine(ligne));
				
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private URI getUri(String fileName) throws IOException {
		URL url = this.getClass().getResource(fileName);
		System.out.println(new java.io.File(".").getCanonicalPath());
		try {
			return url.toURI();
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}

}
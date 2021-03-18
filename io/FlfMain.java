package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FlfMain {

	public static void main(String[] args) {
		Path file = Paths.get( "/home", "cris", "code", "java", "src" , "io" , "io", "bulbhead.flf");
		try (BufferedReader reader = Files.newBufferedReader(file)) {
		    FlfHeader header = readHeader(reader);
		    skipLines(reader, header.getCommentLines());

		} catch (IOException x) {
		    System.err.println("IOException: "+ x);
		}
			System.out.println(file);
	}
	
	private static FlfHeader readHeader(BufferedReader reader) throws IOException {

		//read line (or use Scanner)
		//split line (or use Scanner)

		String[] headerArray = reader.readLine().split(" ");
		char[] signatureAndHardBlankArray = headerArray[0].toCharArray();
		char hardBlank = signatureAndHardBlankArray[signatureAndHardBlankArray.length - 1];
		int height =Integer.parseInt(headerArray[1]);
		int maxLength = Integer.parseInt(headerArray[3]);
		int commentLines = Integer.parseInt(headerArray[5]);

		//create and populate FlfHeader object
		FlfHeader header = new FlfHeader();
		header.setHardBlank(hardBlank);
		header.setHeight(height);;
		header.setMaxLength(maxLength);
		header.setCommentLines(commentLines);

		return  header;
	}

	private static void skipLines( BufferedReader reader, int lineCount) throws IOException {
		//read "lineCount" number of lines
		//from reader and ignore the resultss
		while (lineCount > 0){
			System.out.println(reader.readLine());;
			lineCount--;
		}

	}

	private static List<String> readLines( BufferedReader reader, int lineCount) throws IOException {
		 List<String> lines = new ArrayList<>();
		//read "lineCount" number of lines
		//from reader and add the results to a list

		while (lineCount > 0){
			lines.add(reader.readLine());
		}

		return lines;
	}
 }

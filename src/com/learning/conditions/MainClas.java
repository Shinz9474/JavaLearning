package com.learning.conditions;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClas {
	
	public static void main(String[] args) 
	{
		String path = "G:\\Mine";
		System.out.println(path);
		
		try
		{
			Path paths = Paths.get(path);
			Files.isWritable(paths);
			Files.createDirectories(paths);
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured. "+ex.getMessage());
		}
	}

}

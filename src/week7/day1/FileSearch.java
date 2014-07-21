package week7.day1;

import java.io.File;

public class FileSearch {

	public static void seach(File dir, String fileName) {

		if(dir == null){
			throw new NullPointerException();
		}
		
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isDirectory()){
				seach(file, fileName);
			} else {
				if(file.getName().equals(fileName)){
					System.out.println(file.getAbsolutePath());
					return;
				} 
			}
		}
	}
	
	public static void main(String[] args) {
		String path = "e:/dev/";
		for(String p : new File(path).list()){
			System.out.println(p);
		}
		seach(new File(path), "FileSearch.java");
	}
}

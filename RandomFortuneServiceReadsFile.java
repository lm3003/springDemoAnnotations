package com.luv2code.springdemo;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceReadsFile implements FortuneService {
	private String fileName="C:/Users/Love/myWS/springDemoAnnotations/src/fortunes.properties";
	private List<String> data;
	
	//create a random number generator
	private Random myRandom=new Random();
	
	public RandomFortuneServiceReadsFile(){
	}
	
	@PostConstruct
	public void readFilesAtStartUp(){
		System.out.println("Inside PostConstruct Method");
		File theFile=new File(fileName);
		System.out.println("Reading fortunes from file"+theFile);
		System.out.println("File exists: "+theFile.exists());
		//initialize the array list
		data=new ArrayList<String>();
		//read the contents from the file
		try(BufferedReader br=new BufferedReader(
				new FileReader(theFile))){
			String eachLine;
			while((eachLine=br.readLine())!=null){
				data.add(eachLine);
			}			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
//	@Value("${foo.one}")
//	private String s1;
//	
//	@Value("${foo.two}")
//	private String s2;
//	
//	@Value("${foo.three}")
//	private String s3;
	
	
	//private String [] data=new String[3];
	
	
	@Override
	public String getFortune() {
//		data[0]=s1;
//		data[1]=s2;
//		data[2]=s3;
		int index=myRandom.nextInt(data.size());
		return data.get(index);
	}

}

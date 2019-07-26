package com.deloitte.util;

import java.io.*;
import java.nio.file.*;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.deloitte.model.Dss;
import com.deloitte.model.Sip;

public class SipArchivalUtility {
	
	public int getBatchCount(int batch) 
	{
		int numberOfBatches;
		if(batch%10 == 0)
		{
			numberOfBatches = batch/10;
		}
		else
		{
			numberOfBatches = batch/10 + 1;
		}
		return numberOfBatches;
	}
	
	public void createBatchSubdirectory(String sourceFileLocation,String batchFoldersLocation)
	{
		
		File folder = new File("C:\\Users\\spiili\\Documents\\jdk1.8.0_211\\bin\\july_24");
		File[] listOfFiles = folder.listFiles();
		int numberOfXmls = listOfFiles.length;
		System.out.println("number of xmls is: "+numberOfXmls);
		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("File " + listOfFiles[i].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory " + listOfFiles[i].getName());
		  }
		}
		
		int n = getBatchCount(numberOfXmls);
		for(int i = 0; i <= n; i++)
		{
			
		}
		//Create the batchSubdirectory
		/*try
		{
			String strDirectoy ="test";
			
			// Create one directory
			boolean success = (new File(strDirectoy)).mkdir();
			if (success)
			{
				System.out.println("Directory: " + strDirectoy + " created");
			}  
		}
		catch (Exception e)
		{
			//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}*/
		try {
			Path temp = Files.move (Paths.get("C:\\Users\\spiili\\xyz.xml"),Paths.get("C:\\Users\\spiili\\Desktop\\pqr.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//Read the sourceFileLocation
		
		//Paste the xmls in the newly created batchsubdirectory
		
		
	}
	
	public int createSIPDescriptor()
	{
       //create the xml file
		Sip sipObj = new Sip();
		
		sipObj.setAiu_count("10");
		sipObj.setIs_last("true");
		sipObj.setPage_count("0");
		sipObj.setSeqno("1");
		
		Dss dssObj = new Dss();
		
		dssObj.setHolding("PhoneCallsGranular");
		dssObj.setId("1000001");
		dssObj.setPdi_schema("urn:eas-samples:en:xsd:phonecalls.1.0");
		dssObj.setProduction_date("2002-12-01T00:00:00.000+01:00");
		dssObj.setBase_retention_date("2002-12-01T00:00:00.000+01:00");
		dssObj.setProducer("CC");
		dssObj.setEntity("Platform");
		dssObj.setPriority("0");
		dssObj.setApplication("UA");
		
		sipObj.setDss(dssObj);
        
        try {
        	JAXBContext jc = JAXBContext.newInstance(Sip.class);
        	Marshaller marshaller = jc.createMarshaller();
        	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(sipObj, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sipObj);
		
		return 0;
		//save the file with name "eas_sip.xml".
	}
/*	
	public int createConsolidatedPdiXmlFile()
	{
		//Insert root tag before starting the consolidation
		
		//save the file with name "eas_pdi.xml".
	}
	
	public int createSipArchive()
	{
		
	}*/
	
	public void countOfXmls()
	{	
		FileReader fileReaderObj = null;
		try {
			fileReaderObj = new FileReader("resource/config.properties");
			System.out.println("Debug:"+fileReaderObj);
			Properties propObj = new Properties();
			File xmlFileLocation = null;
		
			propObj.load(fileReaderObj);
			
			xmlFileLocation = new File(propObj.getProperty("SOURCE_FILE_LOCATION"));
			
			File[] listOfFiles = xmlFileLocation.listFiles();
			
			
			System.out.println("Total number of xml files:"+listOfFiles.length);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

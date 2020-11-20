package com.qa.base;

import java.awt.image.SampleModel;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Practice {

	
	/*"msp_accounts": {
    "organizations": [
      {
        "organization_id": "string"
      }
    ]
  }*/
	/*
	 * public HashMap<String, Object> sample(String org_id){
	 * 
	 * ArrayList<HashMap<String, Object>> organizationInfo = new
	 * ArrayList<HashMap<String, Object>>();
	 * 
	 * 
	 * 
	 * HashMap<String, Object>org_id1 = new HashMap<String, Object>();
	 * org_id1.put("organization_id", "String");
	 * 
	 * 
	 * 
	 * organizationInfo.add(org_id1);
	 * 
	 * 
	 * 
	 * HashMap<String, Object> mspaccounts = new HashMap<String, Object>();
	 * mspaccounts.put("msp_accounts",organizationInfo);
	 * 
	 * 
	 * 
	 * return mspaccounts; }
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		 * Practice p = new Practice(); HashMap<String,Object> m = p.sample("sampleid");
		 * 
		 * PrintWriter pw = new PrintWriter("sample32433.txt");
		 * pw.write(m.toString());pw.flush();pw.close();
		 */
		
		
		
		String names[] = {"sample","ajay","ramya","goutham","abhi"};
		
		System.out.println( names[new Random().nextInt(names.length)]);
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.println("name = "+names[i]);
		}
			
		
		
		
		
	}
}

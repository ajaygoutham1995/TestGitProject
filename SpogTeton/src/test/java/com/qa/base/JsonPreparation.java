package com.qa.base;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonPreparation {


public Map<String, Object> composeshareFolderAuthentication(String site_id, String rps_id,String lbs_id,String path,String username, String password,String shared_folder_type){
		
		Map<String, Object> parentMap = new HashMap<String, Object>();
		if(!site_id.equalsIgnoreCase("null")) {parentMap.put("site_id", site_id);}
		if(!rps_id.equalsIgnoreCase("null")) {parentMap.put("rps_id", rps_id);}
		if(!lbs_id.equalsIgnoreCase("null")) {parentMap.put("lbs_id", lbs_id);}
		
		Map<String, Object> sharefolderMap = new HashMap<String, Object>(); 
		if (!path.equalsIgnoreCase("null")) {sharefolderMap.put("path", path);}
		if (!username.equalsIgnoreCase("null")) {sharefolderMap.put("username", username);}
		if (!password.equalsIgnoreCase("null")) {sharefolderMap.put("password", password);}
		if (!shared_folder_type.equalsIgnoreCase("null")) {sharefolderMap.put("shared_folder_type", shared_folder_type);}
		
		parentMap.put("sharefolder", sharefolderMap);
		return parentMap;
	}




/*{
	  "source_name": "string",
	  "source_type": "string",
	  "username": "string",
	  "password": "string",
	  "site_id": "string",
	}*/

public Map<String, Object> composeSourceinfo(String source_name, String connection_status, String os_major,String site_id,String source_type,String product_type,String organization_id){
	
	Map<String, Object> sourceMap = new HashMap<String, Object>();
	
	if(!source_name.equalsIgnoreCase("null")) {sourceMap.put("source_name", source_name);};
	if(!connection_status.equalsIgnoreCase("null")) {sourceMap.put("connection_status", connection_status);};
	if(!os_major.equalsIgnoreCase("null")) {sourceMap.put("os_major", os_major);};
	if(!site_id.equalsIgnoreCase("null")) {sourceMap.put("site_id", site_id);};
	if(!source_type.equalsIgnoreCase("null")) {sourceMap.put("source_type", source_type);};
	if(!product_type.equalsIgnoreCase("null")) {sourceMap.put("product_type", product_type);};
	if(!organization_id.equalsIgnoreCase("null")) {sourceMap.put("organization_id", organization_id);};
	
	return sourceMap;
}

/*
 * public static void main(String[] args) {
 * 
 * JsonPreparation jp = new JsonPreparation(); Map<String,Object> map =
 * jp.composeSourceinfo("ajay", "online", "windows", "123445r", "machine",
 * "udp", "sadjksj"); System.out.println(map); }
 */

/*{
 * 	  "source_name": "10.55.17.174",
	  "connection_status": "online",
	  "os_major": "windows",
	  "site_id": "bb248863-74af-4a31-a961-66e0a43fc6a9",
	  "source_type": "machine",
	  "product_type": "udp",
	  "organization_id": "c58ed277-6fcb-4891-a405-743d4cbadc1b"
	}*/


public Map<String, Object> updateSourceInfo(String source_name, String connection_status,String username,String d2d_protocol,
		String d2d_port_number,String os_version, String os_description,String os_type){
	
	Map<String, Object> updateSourceMap = new HashMap<String, Object>();
	
	if (!source_name.equalsIgnoreCase("null")) {updateSourceMap.put("source_name", source_name);}
	if (!connection_status.equalsIgnoreCase("null")) {updateSourceMap.put("connection_status", connection_status);}
	
	Map<String, Object> udp_agentMap = new HashMap<String, Object>();
	
	if (!username.equalsIgnoreCase("null")) {udp_agentMap.put("username", username);}
	if (!d2d_protocol.equalsIgnoreCase("null")) {udp_agentMap.put("d2d_protocol", d2d_protocol);}
	if (!d2d_port_number.equalsIgnoreCase("null")) {udp_agentMap.put("d2d_port_number", d2d_port_number);}
	if (!os_version.equalsIgnoreCase("null")) {udp_agentMap.put("os_version", os_version);}
	if (!os_description.equalsIgnoreCase("null")) {udp_agentMap.put("os_description", os_description);}
	if (!os_type.equalsIgnoreCase("null")) {udp_agentMap.put("os_type", os_type);}
	
	updateSourceMap.put("udp_agent", udp_agentMap);
	
	
	return updateSourceMap;
	
}




/*{
	 
    "source_name":"gowtam",
    "connection_status": "online",

 "udp_agent": {
            "username": "administrator",
            "d2d_protocol": "http",
            "d2d_port_number": 8015,
            "os_version": "6.4(9600)",
            "os_description": "Windows Server 2012 R2 Standard version",
            "os_type": "32-bit"
        }*/	
public static void main(String[] args) throws FileNotFoundException {
	JsonPreparation jp = new JsonPreparation();
	
	HashMap<String, Object> map = jp.composeReturnPremiumCapacityLimit("sample", "12354", "sjcnjncjz","65432","jdnvkjfn453423");
	
	
	PrintWriter pw = new PrintWriter("sample34.txt");
	pw.write(map.toString());
	pw.flush();
	pw.close();
	
	/*
	 * Map<String,Object> pmap = jp.updateSourceInfo("jkjsdb", "sdbkjsakjd",
	 * "jdkhuwkj", "jdkbjksx", "hdhbasbj", "wagdj", "jhsabdhk", "jasdk");
	 * //System.out.println(pmap);
	 * 
	 * Map<String, Object> map1 = (Map<String, Object>) pmap.get("udp_agent");
	 * Map<String, Object> map2 = (Map<String, Object>) pmap.get("udp_agent");
	 * System.out.println(map1);
	 * 
	 * Collection<Object> actualValues = map1.values(); Collection<Object>
	 * expectedValues = map2.values();
	 * 
	 * ArrayList<Object> actual = new ArrayList<Object>(actualValues);
	 * ArrayList<Object> expected = new ArrayList<Object>(expectedValues);
	 * 
	 * 
	 * if (actual.containsAll(expected)) { System.out.println("success");
	 * 
	 * }else { System.out.println("notsuccess"); }
	 * 
	 */
	
	/*
	 * HashMap <String,Object> map = jp.vmwareConnectInfo("hbsdbj", "dbckjbjkc",
	 * "jsgjbskj", "dkbs", "sahdjs", "jjkcjk", "hsdhjahasb", "jshadgysdgh");
	 * System.out.println(map);
	 * 
	 * ArrayList<HashMap<String,Object>> smsp = jp.composesourcelistinfo("123456",
	 * "jwdjkwjkdk","jwdjkwjkdk","jwdjkwjkdk", "jwdjkwjkdk", "jwdjkwjkdk",
	 * "jwdjkwjkdk", "jwdjkwjkdk", "jwdjkwjkdk", "jwdjkwjkdk", "jwdjkwjkdk",
	 * "jwdjkwjkdk");
	 * 
	 * HashMap<String, Object> values = new HashMap<String, Object>();
	 * 
	 * for (HashMap<String, Object> hashMap : smsp) { values.putAll(hashMap); }
	 * System.out.println("values :" +values); String id = (String)
	 * values.get("source_id"); System.out.println("id = "+id);
	 */
		

}
	
public HashMap<String, Object> vmwareConnectInfo(String site_id, String server_name,String protocol, String port, String username,String password,String recursive,String hypervisor_inventory_type){
	
	HashMap<String, Object> connectMap = new HashMap<String, Object>();
	
	if (!site_id.equalsIgnoreCase("null")) {connectMap.put("site_id", site_id);}
	if (!server_name.equalsIgnoreCase("null")) {connectMap.put("server_name", server_name);}
	if (!protocol.equalsIgnoreCase("null")) {connectMap.put("protocol", protocol);}
	if (!port.equalsIgnoreCase("null")) {connectMap.put("port", port);}
	if (!username.equalsIgnoreCase("null")) {connectMap.put("username", username);}
	if (!password.equalsIgnoreCase("null")) {connectMap.put("password", password);}
	if (!recursive.equalsIgnoreCase("null")) {connectMap.put("recursive", recursive);}
	if (!hypervisor_inventory_type.equalsIgnoreCase("null")) {connectMap.put("hypervisor_inventory_type", hypervisor_inventory_type);}
	
	return connectMap;
}



/*{
	  "site_id": "bb248863-74af-4a31-a961-66e0a43fc6a9",
	  "server_name": "10.55.14.190",
	  "protocol": "https",
	  "port": "442",
	  "username": "administrator@vsphere.local",
	   "password": "Caworld1!",
	  "recursive": true,
	  "hypervisor_inventory_type": "vsphere_hosts_clusters"
	}*/



/*[
    { 

   "source_id":"4211d150-eb78-d784-adb7-9dc3293611d7",
   "source_name":"Direct_Machine1",
   "site_id":"cb837ea7-8489-41ea-a875-526f07817ec4",
   "organization_id":"b6f7329f-2905-48d2-8567-ec4eaef4f888",
   "source_product":"udp",
   "source_type":"agentless_vm",
   "product_type":"udp",
   "connection_status":"online",
   "os_major":"windows",
   "udp_vm":{ 

      "hypervisor_id":"b8f0ba9b-63e0-4f60-a9fe-7f0eede34cbb",
      "vm_name":"Direct_Machine1",
   }
}
]*/





public ArrayList<HashMap<String, Object>> composesourcelistinfo (String source_id,String source_name, String site_id,String organization_id,String source_product,
													  String source_type,String product_type,String connection_status,String os_major,String hypervisor_id,
													  String vm_name,String vm_hostname){
	
	ArrayList<HashMap<String, Object>> sourcelist = new ArrayList<HashMap<String, Object>>();

	HashMap<String, Object> sourcelistmap = new HashMap<String, Object>();
	if (!source_id.equalsIgnoreCase("null")) {sourcelistmap.put("source_id", source_id);}
	if (!source_name.equalsIgnoreCase("null")) {sourcelistmap.put("source_name", source_name);}
	if (!site_id.equalsIgnoreCase("null")) {sourcelistmap.put("site_id", site_id);}
	if (!organization_id.equalsIgnoreCase("null")) {sourcelistmap.put("organization_id", organization_id);}
	if (!source_product.equalsIgnoreCase("null")) {sourcelistmap.put("source_product", source_product);}
	if (!source_type.equalsIgnoreCase("null")) {sourcelistmap.put("source_type", source_type);}
	if (!product_type.equalsIgnoreCase("null")) {sourcelistmap.put("product_type", product_type);}
	if (!connection_status.equalsIgnoreCase("null")) {sourcelistmap.put("connection_status", connection_status);}
	if (!os_major.equalsIgnoreCase("null")) {sourcelistmap.put("os_major", os_major);}
	
	
	
	HashMap<String, Object> udp_vm_map = new HashMap<String, Object>();
	if (!hypervisor_id.equalsIgnoreCase("null")) {udp_vm_map.put("hypervisor_id", hypervisor_id);}
	if (!vm_name.equalsIgnoreCase("null")) {udp_vm_map.put("vm_name", vm_name);}
	
    sourcelistmap.put("udp_vm",udp_vm_map);
    sourcelist.add(sourcelistmap);
	
	return sourcelist;
}




/*{
	  "source_name": "10.55.17.188",
	  "organization_id": "c58ed277-6fcb-4891-a405-743d4cbadc1b",
	  "site_id": "bb248863-74af-4a31-a961-66e0a43fc6a9",
	  "source_type": "machine",
	  "product_type": "udp",
	  "os_major": "windows",
	  "connection_status": "online"
	}*/

public HashMap<String, Object> composesourceinfo(String source_name,String organization_id,String site_id,String source_type,String product_type,String os_major,String connection_status) {
	
	HashMap<String, Object> sourceinfo = new HashMap<String, Object>();
	
	if (!source_name.equalsIgnoreCase("null")) {sourceinfo.put("source_name",source_name);}
	if (!organization_id.equalsIgnoreCase("null")) {sourceinfo.put("organization_id",organization_id);}
	if (!site_id.equalsIgnoreCase("null")) {sourceinfo.put("site_id",site_id);}
	if (!source_type.equalsIgnoreCase("null")) {sourceinfo.put("source_type",source_type);}
	if (!product_type.equalsIgnoreCase("null")) {sourceinfo.put("product_type",product_type);}
	if (!os_major.equalsIgnoreCase("null")) {sourceinfo.put("os_major",os_major);}
	if (!connection_status.equalsIgnoreCase("null")) {sourceinfo.put("connection_status",connection_status);}
	
	return sourceinfo;
	
}
/*
 * {"site_name": "string", "site_type": "string",
 * "organization_id": "string", "product_type": "string" }
 */

/*
 * author Ajay.Gowtam
 * @param site_name
 * @param site_type
 * @param organization_id
 * @param product_type
 * */
public HashMap<String, Object> CreateSiteinfo(String site_name,String site_type,String organization_id,String product_type){
	
	HashMap<String, Object> siteMap = new HashMap<String, Object>();
	
	if (!site_name.equalsIgnoreCase("null")) {siteMap.put("site_name", site_name);}
	if (!site_type.equalsIgnoreCase("null")) {siteMap.put("site_type", site_type);}
	if (!organization_id.equalsIgnoreCase("null")) {siteMap.put("organization_id", organization_id);}
	if (!product_type.equalsIgnoreCase("null")) {siteMap.put("product_type", product_type);}
		
	return siteMap;

}



/*
 * { "username": "string", "password": "string", "parent_path": "string",
 * "foldername": "string", "rps_id": "string", "site_id": "string" }
 */
 

/*
 * author Ajay.Gowtam
 * @param username
 * @param password
 * @param parent_path
 * @param foldername
 * @param rps_id
 * @param site_id
 * */
public HashMap<String, Object> composeCreatefolderInfo(String username,String password,String parent_path,String foldername,String rps_id,String site_id){
	
	HashMap<String, Object> createFolderMap = new HashMap<String, Object>();
	
	if (!username.equalsIgnoreCase("null")) {createFolderMap.put("username", username);}
	if (!password.equalsIgnoreCase("null")) {createFolderMap.put("password", password);}
	if (!parent_path.equalsIgnoreCase("null")) {createFolderMap.put("parent_path", parent_path);}
	if (!foldername.equalsIgnoreCase("null")) {createFolderMap.put("foldername", foldername);}
	if (!rps_id.equalsIgnoreCase("null")) {createFolderMap.put("rps_id", rps_id);}
	if (!site_id.equalsIgnoreCase("null")) {createFolderMap.put("site_id", site_id);}
		
	return createFolderMap;

}



public HashMap<String, Object> source_status(String num_total,String num_protected,String num_unprotected,String num_partial_protected,String num_online,String num_offline){
	
	HashMap<String, Object> source_statusMap = new HashMap<String, Object>();
	
	if (!num_total.equalsIgnoreCase("null")) {source_statusMap.put("num_total", num_total);}
	if (!num_protected.equalsIgnoreCase("null")) {source_statusMap.put("num_protected", num_protected);}
	if (!num_unprotected.equalsIgnoreCase("null")) {source_statusMap.put("num_unprotected", num_unprotected);}
	if (!num_partial_protected.equalsIgnoreCase("null")) {source_statusMap.put("num_partial_protected", num_partial_protected);}
	if (!num_online.equalsIgnoreCase("null")) {source_statusMap.put("num_online", num_online);}
	if (!num_offline.equalsIgnoreCase("null")) {source_statusMap.put("site_id", num_offline);}
		
	return source_statusMap;

}


public HashMap<String, Object> udp_usage(String threshold,String stored_data,String source_data,String ingress_data){
	
	HashMap<String, Object> udp_usageMap = new HashMap<String, Object>();
	
	if (!threshold.equalsIgnoreCase("null")) {udp_usageMap.put("threshold", threshold);}
	if (!stored_data.equalsIgnoreCase("null")) {udp_usageMap.put("stored_data", stored_data);}
	if (!source_data.equalsIgnoreCase("null")) {udp_usageMap.put("source_data", source_data);}
	if (!ingress_data.equalsIgnoreCase("null")) {udp_usageMap.put("ingress_data", ingress_data);}
		
	return udp_usageMap;

}


/*
 * "udp": { "state": "none", "trial_start": null, "billing_type": null,
 * "enable": false, "baas": null }
 */

/*
 * Author Ajay.Gowtam
 * @param state
 * @param trial_start
 * @param billing_type
 * @param enable
 * @param baas
 * 
 * */
public HashMap<String, Object> udp_notrail(String state,String trial_start,String billing_type,String enable,String baas){
	
	HashMap<String, Object> udp_notrail = new HashMap<String, Object>();
	
	if (!state.equalsIgnoreCase("null")) {udp_notrail.put("state", state);}
	if (!trial_start.equalsIgnoreCase("null")) {udp_notrail.put("trial_start", trial_start);}
	if (!billing_type.equalsIgnoreCase("null")) {udp_notrail.put("billing_type", billing_type);}
	if (!baas.equalsIgnoreCase("null")) {udp_notrail.put("baas", baas);}
		
	return udp_notrail;

}

/*{
	  "first_name": "string",
	  "last_name": "string",
	  "email": "string",
	  "phone_number": "string",
	  "role_id": "string",
	  "organization_id": "string",
	  "preference_language": "string",
	  "password": "string",
	  "msp_accounts": {
	    "organizations": [
	      {
	        "organization_id": "string"
	      }
	    ]
	  }
	}*/


public HashMap<String, Object> postUsers(String first_name, String last_name,String email,String phone_number,String role_id,String organization_id,String preference_language, String password,String parent_organization_id) throws FileNotFoundException{
	
	
	HashMap<String, Object> usermap = new HashMap<String, Object>();
	if (!first_name.equalsIgnoreCase("null")) {usermap.put("first_name", first_name);}
	if (!last_name.equalsIgnoreCase("null")) {usermap.put("last_name", last_name);}
	if (!email.equalsIgnoreCase("null")) {usermap.put("email", email);}
	if (!phone_number.equalsIgnoreCase("null")) {usermap.put("phone_number", phone_number);}
	if (!role_id.equalsIgnoreCase("null")) {usermap.put("role_id", role_id);}
	if (!organization_id.equalsIgnoreCase("null")) {usermap.put("organization_id", organization_id);}
	if (!preference_language.equalsIgnoreCase("null")) {usermap.put("preference_language", preference_language);}
	if (!password.equalsIgnoreCase("null")) {usermap.put("password", password);}
	
	HashMap<String, Object> orgid = new HashMap<String, Object>();
	if (!organization_id.equalsIgnoreCase("null")) {orgid.put("organization_id", organization_id);}
	
	ArrayList<HashMap<String, Object>> organizations = new ArrayList<HashMap<String,Object>>();
	organizations.add(orgid);
	
	HashMap<String, Object> accountmap = new HashMap<String, Object>();
	accountmap.put("organizations", organizations);
	
	usermap.put("msp_accounts",accountmap);
	
	return usermap;
	
}

/*{
    "udp_expiration_exemption": "true",
    "clouddirect_trial_length": 15,
    "clouddirect_trial_end": 1598977641541,
    "cloudhybrid_deletion_queue_length": 30,
    "udp_trial_length": 1000,
    "udp_trial_end": 1684081641541,
    "clouddirect_trial_start": 1597681641541,
    "enrollment_country": "india",
    "clouddirect_state": "trial",
    "udp_state": "trial",
    "udp_trial_start": 1597681641541,
    "sale_region": "APAC",
    "cloudhybrid_trial_length": 15,
    "udp_billing_type": "subscription",
    "clouddirect_volume_count": 5,
    "clouddirect_deletion_queue_length": 30,
    "udp.deletion.queue.length": 30
  },*/
	

public HashMap<String, Object> composeOrganizationPropertiesmap(String udp_expiration_exemption,String clouddirect_trial_length,String clouddirect_trial_end,String cloudhybrid_deletion_queue_length,String udp_trial_length,String udp_trial_end,String clouddirect_trial_start,String enrollment_country,String clouddirect_state, String udp_state,String udp_trial_start,String sale_region, String cloudhybrid_trial_length,String udp_billing_type,String clouddirect_volume_count,String clouddirect_deletion_queue_length){
	
	HashMap<String, Object> udp_notrail = new HashMap<String, Object>();
	
	if (!udp_expiration_exemption.equalsIgnoreCase("null")) {udp_notrail.put("udp_expiration_exemption", udp_expiration_exemption);}
	if (!clouddirect_trial_length.equalsIgnoreCase("null")) {udp_notrail.put("clouddirect_trial_length", clouddirect_trial_length);}
	if (!clouddirect_trial_end.equalsIgnoreCase("null")) {udp_notrail.put("clouddirect_trial_end", clouddirect_trial_end);}
	if (!cloudhybrid_deletion_queue_length.equalsIgnoreCase("null")) {udp_notrail.put("cloudhybrid_deletion_queue_length", cloudhybrid_deletion_queue_length);}
	if (!udp_trial_length.equalsIgnoreCase("null")) {udp_notrail.put("udp_trial_length", udp_trial_length);}
	if (!udp_trial_end.equalsIgnoreCase("null")) {udp_notrail.put("udp_trial_end", udp_trial_end);}
	if (!clouddirect_trial_start.equalsIgnoreCase("null")) {udp_notrail.put("clouddirect_trial_start", clouddirect_trial_start);}
	if (!enrollment_country.equalsIgnoreCase("null")) {udp_notrail.put("enrollment_country", enrollment_country);}
	if (!clouddirect_state.equalsIgnoreCase("null")) {udp_notrail.put("clouddirect_state", clouddirect_state);}
	if (!udp_state.equalsIgnoreCase("null")) {udp_notrail.put("udp_state", udp_state);}
	if (!udp_trial_start.equalsIgnoreCase("null")) {udp_notrail.put("udp_trial_start", udp_trial_start);}
	if (!sale_region.equalsIgnoreCase("null")) {udp_notrail.put("sale_region", sale_region);}
	if (!cloudhybrid_trial_length.equalsIgnoreCase("null")) {udp_notrail.put("cloudhybrid_trial_length", cloudhybrid_trial_length);}
	if (!udp_billing_type.equalsIgnoreCase("null")) {udp_notrail.put("udp_billing_type", udp_billing_type);}
	if (!clouddirect_volume_count.equalsIgnoreCase("null")) {udp_notrail.put("clouddirect_volume_count", clouddirect_volume_count);}
	if (!clouddirect_deletion_queue_length.equalsIgnoreCase("null")) {udp_notrail.put("clouddirect_deletion_queue_length", clouddirect_deletion_queue_length);}
		
	return udp_notrail;

}

/*{
	  "user": {
	    "first_name": "string",
	    "last_name": "string",
	    "email": "string",
	    "phone_number": "string"
	  },
	  "organization": {
	    "countryDTO": {
	      "name": "string",
	      "callingCode": "string"
	    },
	    "country": {
	      "name": "string",
	      "callingCode": "string"
	    },
	    "organization_name": "string",
	    "organization_type": "string",
	    "partner_enrollment_code": "string",
	  },
	  "clouddirect_trial": true
	}*/



public HashMap<String, Object> createIngramByEnroll(String first_name,String last_name,String email,String phone_number,String countryDTOname,String countryname,String countryDTOcallingCode,String countrycallingCode ,String organization_name,String organization_type,String partner_enrollment_code,String clouddirect_trial){
	
	HashMap<String, Object> parentMap = new HashMap<String, Object>();
	
	HashMap<String, Object> usermap = new HashMap<String, Object>();
	if (!first_name.equalsIgnoreCase("null")) {usermap.put("first_name", first_name);}
	if (!last_name.equalsIgnoreCase("null")) {usermap.put("last_name", last_name);}
	if (!email.equalsIgnoreCase("null")) {usermap.put("email", email);}
	if (!phone_number.equalsIgnoreCase("null")) {usermap.put("phone_number", phone_number);}
	parentMap.put("user", usermap);
	
	HashMap<String, Object> organizationmap = new HashMap<String, Object>();
	
	HashMap<String, Object> countryDTOmap = new HashMap<String, Object>();
	if (!countryDTOname.equalsIgnoreCase("null")) {countryDTOmap.put("name", countryDTOname);}
	if (!countryDTOcallingCode.equalsIgnoreCase("null")) {countryDTOmap.put("callingCode", countryDTOcallingCode);}
	organizationmap.put("countryDTO", countryDTOmap);
	
	HashMap<String, Object> countrymap = new HashMap<String, Object>();
	if (!countryname.equalsIgnoreCase("null")) {countrymap.put("name", countryname);}
	if (!countrycallingCode.equalsIgnoreCase("null")) {countrymap.put("callingCode", countrycallingCode);}
	organizationmap.put("country", countrymap);
	
	if (!organization_name.equalsIgnoreCase("null")) {organizationmap.put("organization_name", organization_name);}
	if (!organization_type.equalsIgnoreCase("null")) {organizationmap.put("organization_type", organization_type);}
	if (!partner_enrollment_code.equalsIgnoreCase("null")) {organizationmap.put("partner_enrollment_code", partner_enrollment_code);}
	
	parentMap.put("organization", organizationmap);
	if (!clouddirect_trial.equalsIgnoreCase("null")) {parentMap.put("clouddirect_trial", clouddirect_trial);}
	
	
	
	
	return parentMap;
	
	}
	
/*"source_status": {
        "": 4,
        "": 4,
        "": 0,
        "": 0,
        "": 4,
        "": 0,
        "": 4,
        "": 2,
        "": 4,
        "": 2,
        "": 0,
        "": 0,
        "": 0,
        "": 4
    },*/

/**
 * 
 * @param num_total
 * @param num_protected
 * @param num_unprotected
 * @param num_partial_protected
 * @param num_online
 * @param num_offline
 * @param num_with_backups
 * @param num_without_backups
 * @param num_with_policy
 * @param num_without_policy
 * @param num_backups_missed
 * @param num_backups_failed
 * @param num_backups_warning
 * @param num_backups_success
 * @return
 */

/*"source_status": {
        "num_total": 5,
        "num_protected": 4,
        "num_unprotected": 1,
        "num_partial_protected": 0,
        "num_online": 5,
        "num_offline": 0,
        "num_with_backups": 4,
        "num_without_backups": 2,
        "num_with_policy": 4,
        "num_without_policy": 2,
        "num_backups_missed": 0,
        "num_backups_failed": 0,
        "num_backups_warning": 0,
        "num_backups_success": 4
    },*/

public HashMap<String, Object> sourceStatus(String num_total,String num_protected,String num_unprotected,String num_partial_protected,String num_online,String num_offline,
		String num_with_backups,String num_without_backups, String num_with_policy,String num_without_policy,String num_backups_missed,String num_backups_failed,String num_backups_warning, String num_backups_success){
	
	HashMap<String, Object> parentMap = new HashMap<String, Object>();
	
	HashMap<String, Object> sourceStatusMap = new HashMap<String, Object>();
	sourceStatusMap.put("num_total", 5);
	sourceStatusMap.put("num_protected", 4);
	sourceStatusMap.put("num_unprotected", 1);
	sourceStatusMap.put("num_partial_protected", 0);
	sourceStatusMap.put("num_online", 5);
	sourceStatusMap.put("num_offline", 0);
	sourceStatusMap.put("num_with_backups", 4);
	sourceStatusMap.put("num_without_backups", 2);
	sourceStatusMap.put("num_with_policy", 4);
	sourceStatusMap.put("num_without_policy", 2);
	sourceStatusMap.put("num_backups_missed", 0);
	sourceStatusMap.put("num_backups_failed", 0);
	sourceStatusMap.put("num_backups_warning", 0);
	sourceStatusMap.put("num_backups_success", 4);
	
	parentMap.put("source_status", sourceStatusMap);

	return parentMap;
	
}

/*"machine_info": {
    "hostName": "10.55.20.46",
    "hostUuid": "d7673fed-f49e-40f2-8848-054d0d2e7a3c",
    "serverName": "10.55.20.46",
    "serverUuid": "d7673fed-f49e-40f2-8848-054d0d2e7a3c",
    "socketCount": 0,
    "serverSocketCount": 0,
    "jobId": 0,
    "jobType": 0,
    "policyUUID": "3b53ac6d-76c7-48ae-8c27-2a7780ea1b94"
  },*/


public HashMap<String, Object> composeReturnPremiumCapacityLimit(String hostName,String hostUuid,String serverName,String serverUuid,String policyUUID){
	
	HashMap<String, Object> parentMap = new HashMap<String, Object>();
	parentMap.put("client_type", "UDP_CLIENT_UNKNOWN");
	parentMap.put("required_feature", 0);
	
	HashMap<String, Object> machine_info = new HashMap<String, Object>();
	if (!hostName.equalsIgnoreCase("null")) {machine_info.put("hostName", hostName);}
	if (!hostUuid.equalsIgnoreCase("null")) {machine_info.put("hostUuid", hostUuid);}
	if (!serverName.equalsIgnoreCase("null")) {machine_info.put("serverName", serverName);}
	if (!serverUuid.equalsIgnoreCase("null")) {machine_info.put("serverUuid", serverUuid);}
	machine_info.put("socketCount", 0);
	machine_info.put("serverSocketCount", 0);
	machine_info.put("jobId", 0);
	machine_info.put("jobType", 0);
	if (!policyUUID.equalsIgnoreCase("null")) {machine_info.put("policyUUID", policyUUID);}
	
	parentMap.put("machine_info", machine_info);
	
	return parentMap;
}

public HashMap<String, Object> composeUpdateActionForUdpSources(String source_name,String username,String password,String use_existing_credential){
	
	HashMap<String, Object> updateInfoMap =  new HashMap<String, Object>();
	
	if (!source_name.equalsIgnoreCase("null")) {updateInfoMap.put("source_name", source_name);}
	if (!username.equalsIgnoreCase("null")) {updateInfoMap.put("username", username);}
	if (!password.equalsIgnoreCase("null")) {updateInfoMap.put("source_name", source_name);}
	if (!use_existing_credential.equalsIgnoreCase("null")) {updateInfoMap.put("use_existing_credential", use_existing_credential);}
	
	return updateInfoMap;
}


/*{
	  "source_id": "string",
	  "connection_status": "string",
	  "os_major": "string",
	  "organization_id": "string",
	  "source_name": "string",
	  "site_id": "string",
	  "source_type": "string",
	  "product_type": "string"
	}*/



public HashMap<String, Object> composeSourceInformation(String source_name,String connection_status,String os_major,String organization_id,String site_id,String source_type,String product_type){
	
	HashMap<String, Object> sourceMap = new HashMap<String, Object>();
	
	if (!source_name.equalsIgnoreCase("null")) {sourceMap.put("source_name", source_name);}	
	if (!connection_status.equalsIgnoreCase("null")) {sourceMap.put("connection_status", connection_status);}
	if (!os_major.equalsIgnoreCase("null")) {sourceMap.put("os_major", os_major);}
	if (!organization_id.equalsIgnoreCase("null")) {sourceMap.put("organization_id", organization_id);}
	if (!site_id.equalsIgnoreCase("null")) {sourceMap.put("site_id", site_id);}
	if (!source_type.equalsIgnoreCase("null")) {sourceMap.put("source_type", source_type);}
	if (!product_type.equalsIgnoreCase("null")) {sourceMap.put("product_type", product_type);}
	
	return sourceMap;
}











}


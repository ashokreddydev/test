package egsd.service;

import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.parse4j.ParseBatch;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteLocationDetails {
	
	private static Logger logger = LoggerFactory.getLogger(DeleteLocationDetails.class);
	ParseBatch directoryBatch = new ParseBatch();
	ParseBatch menuBatch = new ParseBatch();
	ParseBatch phoneBatch = new ParseBatch();
	ParseBatch styleBatch = new ParseBatch();
	
	public String deleteLocationDetails(String locationId)
	{
		ParseQuery<ParseObject> queryForDirectoriesObject = ParseQuery.getQuery("DirectoryItem");
		queryForDirectoriesObject.whereEqualTo("LocationId", locationId);

		List<ParseObject> listForDirectoriesObject = null;

		try {
			listForDirectoriesObject = queryForDirectoriesObject.find();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		Iterator<ParseObject> iteratorForDirectoryOnject = listForDirectoriesObject.listIterator();
		while(iteratorForDirectoryOnject.hasNext())
		{
			ParseObject directoryObject = iteratorForDirectoryOnject.next();		
			ParseObject directoryDelete = ParseObject.createWithoutData("DirectoryItem", directoryObject.getObjectId());
			directoryBatch.deleteObject(directoryDelete);
		}
		try {
			JSONArray batch = directoryBatch.batch();
			for(int i=0;i<batch.length();i++){
	            JSONObject current = batch.getJSONObject(i);
	            if(current.get("success")!=null){
	                JSONObject obj = current.getJSONObject("success");
	                logger.info(current+" status is success ");
	            }else{
	                logger.info(current+" status is error ");
	            }
	        }
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		logger.info("Directory Items deleted");
		
		
		ParseQuery<ParseObject> queryForMenuObject = ParseQuery.getQuery("Menu");
		queryForMenuObject.whereEqualTo("LocationId", locationId);

		List<ParseObject> listForMenuObject = null;

		try {
			listForMenuObject = queryForMenuObject.find();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		Iterator<ParseObject> iteratorForMenuOnject = listForMenuObject.listIterator();
		while(iteratorForMenuOnject.hasNext())
		{
			ParseObject menuObject = iteratorForMenuOnject.next();		
			ParseObject menuDelete = ParseObject.createWithoutData("Menu", menuObject.getObjectId());
			menuBatch.deleteObject(menuDelete);		
			
		}
		
		try {
			JSONArray batch = menuBatch.batch();
			for(int i=0;i<batch.length();i++){
	            JSONObject current = batch.getJSONObject(i);
	            if(current.get("success")!=null){
	                JSONObject obj = current.getJSONObject("success");
	                logger.info(current+" status is success ");
	            }else{
	                logger.info(current+" status is error ");
	            }
	        }
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		logger.info("Menu Items deleted");
		
		ParseQuery<ParseObject> queryForPhoneObject = ParseQuery.getQuery("Phones");
		queryForPhoneObject.whereEqualTo("LocationId", locationId);

		List<ParseObject> listForPhoneObject = null;

		try {
			listForPhoneObject = queryForPhoneObject.find();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		Iterator<ParseObject> iteratorForPhoneOnject = listForPhoneObject.listIterator();
		while(iteratorForPhoneOnject.hasNext())
		{
			ParseObject phoneObject = iteratorForPhoneOnject.next();			
			ParseObject phoneDelete = ParseObject.createWithoutData("Phones", phoneObject.getObjectId());
			phoneBatch.deleteObject(phoneDelete);	
			
		}
		
		try {
			JSONArray batch = phoneBatch.batch();
			for(int i=0;i<batch.length();i++){
	            JSONObject current = batch.getJSONObject(i);
	            if(current.get("success")!=null){
	                JSONObject obj = current.getJSONObject("success");
	                logger.info(current+" status is success ");
	            }else{
	                logger.info(current+" status is error ");
	            }
	        }
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		logger.info("Phone Items deleted");
		
		ParseQuery<ParseObject> queryForStyleObject = ParseQuery.getQuery("Style");
		queryForStyleObject.whereEqualTo("LocationId", locationId);

		List<ParseObject> listForStyleObject = null;

		try {
			listForStyleObject = queryForStyleObject.find();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		

		Iterator<ParseObject> iteratorForStyleOnject = listForStyleObject.listIterator();
		while(iteratorForStyleOnject.hasNext())
		{
			ParseObject styleObject = iteratorForStyleOnject.next();			
			ParseObject styleDelete = ParseObject.createWithoutData("Style", styleObject.getObjectId());
			styleBatch.deleteObject(styleDelete);
			
		}
		
		try {
			JSONArray batch = styleBatch.batch();
			for(int i=0;i<batch.length();i++){
	            JSONObject current = batch.getJSONObject(i);
	            if(current.get("success")!=null){
	                JSONObject obj = current.getJSONObject("success");
	                logger.info(current+" status is success ");
	            }else{
	                logger.info(current+" status is error ");
	            }
	        }
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		logger.info("Style Items deleted");
		
		return "success";
		
	}

}

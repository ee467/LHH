package ee467.lhh.curriculum.io.extensions;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import ee467.lhh.curriculum.WorkOrder.WorkOrder;


public class WorkOrderReader {

	public WorkOrder getWorkOrder(String fName){

	    	   /**
	    		* Work Order fields
	    		*/	
	    		String orderId = "";
	    		String submittedTime = "";
	    	    String submittedBy = "";
	    	    String completedTime = "";
	    	    String operationId = "";
	    	    String studentId = "";
	    	    String data = "";
	    	    String status = "";

	    		/**
	    		 * file reader function/method. It opens a work order file then reads in
	    		 * each field of the work order and stores it. Then prints our each field onto 
	    		 * the console
	    		 * @param args
	    		 */
	    		    File file = new File(fName);
	    		    FileInputStream fis = null;
	    		    BufferedInputStream bis = null;
	    		    DataInputStream dis = null;
	    		    
	    		    String sTemp = "";
	    		    int cTemp,count;
	    		    count=1;

	    		    try {
	    		      fis = new FileInputStream(file);

	    		      // Here BufferedInputStream is added for fast reading.
	    		      bis = new BufferedInputStream(fis);
	    		      dis = new DataInputStream(bis);

	    		      // dis.available() returns 0 if the file does not have more lines.
	    		      while (dis.available() != 0) {

	    		      /* Here the program reads char by char until it his a delimiter
	    		       * then it stores the string of chars into a work order field
	    		       */
	    		    	  if((cTemp = dis.readByte()) != '|')
	    		    		  sTemp =  sTemp+ (char)cTemp;
	    		    	  else
	    		    	  {	  switch(count)
	    		    		  {
	    		    		  	case 1: orderId = sTemp;
	    		    		  			break;
	    		    		  	case 2: submittedTime = sTemp;
	    		    		  			break;
	    		    		  	case 3: submittedBy = sTemp;
	    		    		  			break;
	    		    		  	case 4: completedTime = sTemp;
	    		    		  			break;
	    		    		  	case 5: operationId = sTemp;
	    		    		  			break;
	    		    		  	case 6: studentId = sTemp;
	    		    		  			break;
	    		    		  	case 7: data= sTemp;
	    		    		  			break;
	    		    		  	case 8: status = sTemp;
	    		    		  			break;
	    		    		  	default: break;
	    		    		  }
	    		    	  		//updates count and clears temp
	    		    	  		count=count+1;
	    		    	  		sTemp = "";
	    		    	  }
	    		      
	    		      }
	    		      
	    		      
/*	    		      //print all fields
	    		      System.out.println("      orderID: "+orderID);
	    		      System.out.println("submittedTime: "+submittedTime);
	    		      System.out.println("  submittedBy: "+submittedBy);
	    		      System.out.println("completedTime: "+completedTime);
	    		      System.out.println("  operationID: "+operationID);
	    		      System.out.println("    studentID: "+studentID);
	    		      System.out.println("         data: "+data);
	    		      System.out.println("       status: "+status);*/
	    		      
	    		      
	    		      // dispose all the resources after using them.
	    		      fis.close();
	    		      bis.close();
	    		      dis.close();

	    		    } catch (FileNotFoundException e) {
	    		      e.printStackTrace();
	    		    } catch (IOException e) {
	    		      e.printStackTrace();
	    		    }
					return new WorkOrder(orderId, operationId, studentId, data);
		}
	    
}


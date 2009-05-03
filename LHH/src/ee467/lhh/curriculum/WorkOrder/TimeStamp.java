package ee467.lhh.curriculum.WorkOrder;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class TimeStamp {
  //Format is == hr:min,(AM/PM),day,month,year
    public static final String DATE_FORMAT_NOW = "hh:mm,aa,dd,MM,yyyy";
    
    public static String now() {
    // Gets the timezone and locale 
      Calendar timezone = Calendar.getInstance();
      // Creates a string of the timestamp format
      SimpleDateFormat timestamp = new SimpleDateFormat(DATE_FORMAT_NOW);
      // Gets the time and date and returns with the completed string
      return timestamp.format(timezone.getTime());
    }
}
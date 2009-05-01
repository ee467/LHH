package ee467.lhh.curriculum.io.extensions;

import ee467.lhh.curriculum.io.FileReader;
import ee467.lhh.curriculum.io.SqlReader;

public class WorkOrderReader {

  /** The two readers that will be used depending on the case */
  private FileReader fileReader = null;
  private SqlReader sqlReader = null;
  private boolean isFileReader = true;
  
  public WorkOrderReader(boolean isFileReader) {
    this.isFileReader = isFileReader;
    if (this.isFileReader) {
      this.fileReader = new FileReader();
    }
    else {
      this.sqlReader = new SqlReader();
    }
  }
}

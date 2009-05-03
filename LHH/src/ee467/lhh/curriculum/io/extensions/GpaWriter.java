package ee467.lhh.curriculum.io.extensions;

import ee467.lhh.curriculum.io.FileWriter;
import ee467.lhh.curriculum.io.SqlWriter;

/**
 * This class is responsible for reading the data that would be stored on the
 * back of the check sheet. The data that has to deal with Gpa Calculations.
 * @author James Cuaresma
 */
public class GpaWriter {

  /** The two writers that will be used depending on the case */
  private FileWriter fileWriter = null;
  private SqlWriter sqlWriter = null;
  private boolean isFileWriter = true;
  
  public GpaWriter(boolean isFileWriter) {
    this.isFileWriter = isFileWriter;
    if (this.isFileWriter) {
      this.fileWriter = new FileWriter();
    }
    else {
      this.sqlWriter = new SqlWriter();
    }
  }
}

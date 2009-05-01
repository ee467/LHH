package ee467.lhh.curriculum.io.extensions;

import ee467.lhh.curriculum.io.FileWriter;
import ee467.lhh.curriculum.io.SqlWriter;

public class GradeReportLineWriter {

  /** The two writers that will be used depending on the case */
  private FileWriter fileWriter = null;
  private SqlWriter sqlWriter = null;
  private boolean isFileWriter = true;
  
  public GradeReportLineWriter(boolean isFileWriter) {
    this.isFileWriter = isFileWriter;
    if (this.isFileWriter) {
      this.fileWriter = new FileWriter();
    }
    else {
      this.sqlWriter = new SqlWriter();
    }
  }
}

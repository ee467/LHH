package ee467.lhh.curriculum.WorkOrder;

import java.util.Date;

/**
 * This class contains a single line from the work order table. WorkOrderHandler
 * will have a container of WorkOrders to process. Our WorkOrder class will only
 * draw important information that is required for processing
 * @author jleong
 */
public class WorkOrder {
  /** Work Order number 1 (Column 1) */
  private int orderNumber;
  /** Time completed (Column 4) */
  private Date timeCompleted = null;
  /** Operation Number (Column5) */
  private int operationNumber;
  /** Banner ID for student */
  private String bannerId = null;
  /** Data for work order */
  private String workOrderData = null;
  /** Boolean for completed or not */
  private boolean isCompleted = false;

  /**
   * Constructor for a work order, only contains information that would be helpful in processing a work order.
   * @param orderNumber of this work order
   * @param operationNumber of this work order
   * @param bannerId of the student that this workorder pertains to
   * @param workOrderData of this work order
   */
  public WorkOrder(int orderNumber, int operationNumber, String bannerId, String workOrderData) {
    this.orderNumber = orderNumber;
    this.timeCompleted = null;
    this.operationNumber = operationNumber;
    this.bannerId = bannerId;
    this.workOrderData = workOrderData;
    this.isCompleted = false;
  }

  /**
   * Method that returns the order Number of this workorder
   * @return order number of this particular work order
   */
  public int getOrderNumber() {
    return this.orderNumber;
  }

  /**
   * Method that gets the time this work order was completed
   * @return timestamp of when this work order was completed
   */
  public Date getTimeCompleted() {
    return this.timeCompleted;
  }

  /**
   * Method that sets the time completed for this work order
   * @param timeCompleted for this work order
   */
  public void setTimeCompleted(Date timeCompleted) {
    this.timeCompleted = timeCompleted;
  }

  /**
   * Method that returns the operation number of this work order
   * @return operation number of this work order
   */
  public int getOperationNumber() {
    return this.operationNumber;
  }

  /**
   * Method that returns the banner ID for the student that this work order
   * refers to.
   * @return bannerId of the student
   */
  public String getBannerId() {
    return this.bannerId;
  }

  /**
   * Method that gets the work order data of this work order
   * @return data for this work order
   */
  public String getWorkOrderData() {
    return this.workOrderData;
  }

  /**
   * Method that returns true if the work order is already processed, false if
   * not processed
   * @return true/false depending on if finished/unfinished
   */
  public boolean isCompleted() {
    return this.isCompleted;
  }
  
  /**
   * Method that sets the work order as finished or not
   * @param isCompleted of the work order
   */
  public void setCompleted(boolean isCompleted) {
    this.isCompleted = isCompleted;
  }
}

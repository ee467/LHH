package ee467.lhh.curriculum.WorkOrder;


import java.util.ArrayList;
import java.util.List;

import ee467.lhh.curriculum.mysql.SqlController;
/**
 * The class that handles work orders
 * @author jasonleong
 */
public class WorkOrderHandler {
  private final String LOGIN = "";
  private final String PASSWORD = "";
  private final String URL = "";
  /** List of Work Orders */
  private ArrayList<WorkOrder> workOrders = new ArrayList<WorkOrder>();
  /** boolean to say whether WorkOrderHandler is finished */
  private boolean isFinished = false;
  /** The Sql controller which will handle reading and writing work orders */
  private SqlController sqlController;
  /**
   * Blank Constructor
   */
  public WorkOrderHandler() {
    this.isFinished = false;
    this.sqlController = new SqlController(LOGIN,PASSWORD,URL);
  }
  
  /**
   * Constructor if we already have a list of work orders
   * @param workOrders to be handled
   */
  public WorkOrderHandler(ArrayList<WorkOrder> workOrders) {
    this.workOrders = workOrders;
    this.isFinished = false;
  }
  
  /**
   * Method to add a WorkOrder to the work order list 
   * @param workOrder to be added
   */
  public void addWorkOrder(WorkOrder workOrder) {
    this.workOrders.add(workOrder);
  }
  
  /**
   * Method that gets a work order at a certain position in the list
   * @param position of the desired work order
   * @return work order
   */
  public WorkOrder getWorkOrderAt(int position) {
    List<WorkOrder> orders = new ArrayList<WorkOrder>();
    for (WorkOrder order : this.workOrders) {
      orders.add(order);
    }
    return orders.get(position);
  }
}

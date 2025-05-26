package practiso;
public class EncapsulationClass{
  public static void main(String[] args) {
    Department dept = new Department();
    dept.Department("afsdf", "asdfasd", "asdfasdf", "asdfasdf", "asdfasdf", "asdfasd", "dasfasd");
    dept.setSales("arket");
    System.out.println(dept.getSales());
  }
}


class Department{
  private String SalesDept;
  private String ITDept;
  private String Finance;
  private String ECommerce;
  private String HR;
  private String EventOrganizer;
  private String Maintenance;
  
  public void Department(String salesDept, String iTDept, String finance, String eCommerce, String hR, String eventOrganizer, String maintenance ){
    this.SalesDept = salesDept;
    this.ITDept = iTDept;
    this.Finance = finance;
    this.ECommerce = eCommerce;
    this.HR = hR;
    this.EventOrganizer = eventOrganizer;
    this.Maintenance = maintenance;

  }
  
  public void setSales(String salesDept){ 
    this.SalesDept = salesDept;
  }

  public String getSales(){
  return SalesDept;
  }

  public void setIT(String iTDept){
    this.ITDept = iTDept;
  }

  public String getIT(){
    return ITDept;
  } 
}


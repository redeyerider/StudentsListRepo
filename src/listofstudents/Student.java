package listofstudents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 * Date:Jan 30 2019
 * 
 */
public class Student {
  private String name;
  private int id;
  private String DOB;
  // this property is for parttime student only
  private int maxHrs;
  
  public Student()
  {
       this.id =0;
       this.name = "Not Set";
  }
  
  public Student(String givenName, int givenId)
  {
      this.name = givenName;
      this.id = givenId;
  }
  
  public void setName (String givenName)
  {
      this.name = givenName;
  }
  public String getName()
  {     
      return name;
  }
  
  public void setId(int givenId)
  {
     this.id = givenId;
  }
  /**
   * 
   * @return the id of the student
   */
  public int getId()
  {
      return id;
  }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the maxHrs
     */
    public int getMaxHrs() {
        return maxHrs;
    }
  
}

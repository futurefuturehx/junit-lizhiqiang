/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Totalscoremock;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class StuClass
        
{
    private String stuName;
    private MyStore store = null;
    private List<ClassName> items = new ArrayList();
 
    public String getStuName() 
    {
       return stuName;
    }
    public void setStuName(String stuName) 
    {
       this.stuName = stuName;
    }
    public List getItems() 
    {
      return items;
    }
    public void setItems(List items) 
    {
      this.items = items;
    }
    public void addItem(ClassName item)
    {
      items.add(item);
    }
    public void setStore(MyStore store)
    {
      this.store=store;
    }
    public MyStore getStore()
    {
      return (this.store);
    }
    public Double calculateTotalCredits()
    {
       Double totalCredits = 0.0;
       for(ClassName item : this.items)
       {
         totalCredits+= (store.getCredits(item.getClassName()) * item.getCredit());
       }
          DecimalFormat decim = new DecimalFormat("0.00");
          Double credits = Double.parseDouble(decim.format(totalCredits));
          return credits;
       }
  
}

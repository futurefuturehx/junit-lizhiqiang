/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetest;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
public class xuanke 
{
    private String sname;
    IMyCredit mycredit = null;
    private MyCredit credit = null;
    private List<course> courses = new ArrayList();
    
    public xuanke(IMyCredit credit)
    {
        mycredit = credit;
    }
    
    public xuanke()
    {
        mycredit = new MyCredit();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<course> getCourses() {
        return courses;
    }

    public void setCourses(List<course> courses) {
        this.courses = courses;
    }
    
    public void addCourse(course c)
    {
        courses.add(c);
    }

    public MyCredit getCredit() {
        return (this.credit);
    }

    public void setCredit(MyCredit credit) {
        this.credit = credit;
    }
    
    public Double calculateTotalCredit()
    {
       Double totalCredit = 0.0;
       for(course course : this.courses)
       {
         totalCredit+= mycredit.getCredit(course.getCname());
         
       }       
         DecimalFormat decim = new DecimalFormat("0.0");
         Double price = Double.parseDouble(decim.format(totalCredit));
         return price;
    }
}

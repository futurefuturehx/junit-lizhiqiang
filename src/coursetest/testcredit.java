/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetest;
public class testcredit {
    public double testgrade (double a)
    {
        double testgrade = 0;
        
        if(a>=0.5)
        {
          double b = 10*a;
          if(b%5==0)
          {
              testgrade=1.0;
          }
            
        }        
        return testgrade;
    }
}

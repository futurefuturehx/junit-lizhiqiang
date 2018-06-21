/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetest;
public class stubMyCredit implements IMyCredit{
    @Override
    public double getCredit(String cname)
    {
        double credit = 0;
        switch (cname) {
            case "软件工程":
                credit = 4.00;
                break;
            case "操作系统":
                credit = 5.00;
                break;
            case "数据库":
                credit = 3.00;
                break;
            default:
                credit = 0;
        }
        return credit;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetest;

public class course {
    private int cid;
    private String cname;
    private double credit;

    public course(int cid, String cname, double credit) {
        this.cid = cid;
        this.cname = cname;
        this.credit = credit;
    }
    
    
    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public double getCredit() {
        return credit;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
  
}

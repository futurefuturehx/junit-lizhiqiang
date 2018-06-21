package test;

/**
 * @author hx
 */
public class InputChecker {

    public boolean isbeishu(double a) {
        if(a<=0.5){
            return false;
        }else{
            int b=(int)(a/0.5);
            if (a-b*0.5<=1e-6&&a-b*0.5>=-1e-6){
                return true;
            }else{
                return false;
            }
        }
    }
}
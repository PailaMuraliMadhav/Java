import java.math.MathContext;
import java.math.BigDecimal;// use* for importing all math
public class SecondProgram{
    public static void main(String[] args){
        MathContext zz=new MathContext(5);
        BigDecimal aa=new BigDecimal("3.255655");
        BigDecimal ss=new BigDecimal("123.4567890");
        BigDecimal vv=ss.setScale(3, BigDecimal.roundingmode_up);
        System.out.println(vv);
        System.out.println(vv);
        BigDecimal cc=new BigDecimal(9);
        BigDecimal result =aa.add(cc,zz);
        System.out.println(result);
    }
}


// error
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RateTest {
    HashMap<String, String > tw_dollarMap = new HashMap<>();

    HashMap<String, String > jp_dollarMap = new HashMap<>();

    HashMap<String, String > us_dollarMap = new HashMap<>();

    Map<String ,Object> ratemap= new HashMap<>();

    @Test
    public  void rateTest(){
        String source="USD";
        String target="JPY";
        String amount="$1,525";
        String amount_str = amount.replace("$", "").replace(",", "");
        init_rate();

        BigDecimal bigDecimal = rateToAmount(source, target, amount_str);
        String str = "$" + bigDecimal;
        System.out.println(str);
    }

    private void init_rate() {
        tw_dollarMap.put("TWD","1");
        tw_dollarMap.put("JPY","3.669");
        tw_dollarMap.put("USD","0.03281");
        jp_dollarMap.put("TWD","0.26956");
        jp_dollarMap.put("JPY","1");
        jp_dollarMap.put("USD","0.00885");
        us_dollarMap.put("TWD","30.444");
        us_dollarMap.put("JPY","111.801");
        us_dollarMap.put("USD","1");
        ratemap.put("TWD", tw_dollarMap);
        ratemap.put("JPY", jp_dollarMap);
        ratemap.put("USD", us_dollarMap);
    }

    public  BigDecimal rateToAmount(String source,String target,String amount){
        HashMap<String, String > rate= (HashMap<String, String>) ratemap.get(source);
        String s = rate.get(target);
        System.out.println(s);
        BigDecimal bigDecimal = new BigDecimal(s);
        System.out.println(bigDecimal);
        return new BigDecimal(amount).multiply(bigDecimal);
    }
}

import cn.jpush.api.JPushClient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Think on 2017/03/01.
 */
public class Test {
    @Autowired
    JPushClient jPushClient;

    public String testSend(){
        System.out.print("hello world");
        return "";
    }
}

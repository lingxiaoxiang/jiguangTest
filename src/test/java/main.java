import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

import java.util.*;

/**
 * Created by Think on 2017/03/01.
 */
public class main {
    public static void main(String args[]) {
        System.out.print("test");

        JPushClient pushClient = new JPushClient("0d61f04466178ed9f07835dd", "402a29888f54f4824c0656cf");
        List<String> regList = new ArrayList<String>();
        regList.add("190e35f7e04bbc945e2");
        regList.add("190e35f7e04b5c12a6d");
        regList.add("120c83f7602a1cb2c30");
        regList.add("1104a89792a713a57a9");
        regList.add("100d85590949dc628d1");
        regList.add("120c83f7602a1ca18d7");
        regList.add("1a1018970aa8be54701");
        Platform platform = Platform.all();
        // 传过来的registerId
        Audience audience = Audience.registrationId(regList);
        Options options = Options.newBuilder().setApnsProduction(false).build();
        // 入参
        AndroidNotification androidNotification = AndroidNotification.newBuilder().setAlert("测试极光").setTitle("交易助手").addExtra("page_code", "").addExtra("id", "").addExtra("notice_type", "").addExtra("receiver_type", "").build();

        Map<String, Object> iosAlertMap = new HashMap<>();
        iosAlertMap.put("title", "交易助手"); // 入参
        iosAlertMap.put("body", "测试极光"); // 入参
        // 入参
        IosNotification iosNotification = IosNotification.newBuilder().setAlert(iosAlertMap).setSound("default").setBadge(+1).addExtra("page_code", "").addExtra("id", "").addExtra("notice_type", "").addExtra("receiver_type", "").build();
        Notification notification = Notification.newBuilder().addPlatformNotification(androidNotification).addPlatformNotification(iosNotification).build();
        PushPayload pushPayload = PushPayload.newBuilder().setPlatform(platform).setAudience(audience).setOptions(options).setNotification(notification).build();
        try {
            PushResult pushResult = pushClient.sendPush(pushPayload);
            System.out.print("+++++++++++++pushResult+++++++++++++++" + pushResult);
            System.out.print("+++++++++++++pushResult+++++++++++++++" + pushResult.getResponseCode());
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
}

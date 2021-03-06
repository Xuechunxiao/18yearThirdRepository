package demo.example.com.buglydemo;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by 丁军明 on 2018/1/22.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        /* Bugly SDK初始化
        * 参数1：上下文对象
        * 参数2：APPID，平台注册时得到,注意替换成你的appId
        * 参数3：是否开启调试模式，调试模式下会输出'CrashReport'tag的日志
        */
        CrashReport.initCrashReport(getApplicationContext(), "f5d78c4b44", true);
    }
}

package core;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;

public class ThreadLocalDriver {
    public static ThreadLocal<MobileDriver<AndroidElement>> tl1Driver = new ThreadLocal<>();

    public static ThreadLocal<MobileDriver<AndroidElement>> tlDriver = new ThreadLocal<>();
    public static ThreadLocal<IOSDriver> tlIOSDriver = new ThreadLocal<>();


    public static AndroidDriver<AndroidElement> getTL1Driver() {
        return (AndroidDriver<AndroidElement>) tl1Driver.get();
    }

    public static void setTL1Driver(AndroidDriver<AndroidElement> driver) {
        tl1Driver.set(driver);
    }


    public static AndroidDriver<AndroidElement> getTLDriver() {
        return (AndroidDriver<AndroidElement>) tlDriver.get();
    }

    public static void setTLDriver(AndroidDriver<AndroidElement> driver) {
        tlDriver.set(driver);
    }

    public static IOSDriver getTLIOSDriver() {
        return tlIOSDriver.get();
    }

    public static void setTLIOSDriver(IOSDriver driver) {
        tlIOSDriver.set(driver);
    }

}

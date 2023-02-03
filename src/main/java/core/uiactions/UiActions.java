package core.uiactions;

import com.google.common.collect.ImmutableMap;
import core.enums.Direction;
import core.managers.logmanager.MyLogger;
import io.appium.java_client.*;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class UiActions {
    public MobileDriver<MobileElement> driver;
    private Screen screen;
    private String basePath;

    public UiActions(MobileDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        URL resourceFolderURL = this.getClass().getClassLoader().getResource("images");

    }

    public UiActions pushtodevice(String dest, String source, AndroidDriver driver) {
        try {
            if (driver.getPlatformName().equalsIgnoreCase("Android")) {
                driver.pushFile(dest, new File(source));
                System.out.println("Added to the Location");
            } else if (driver.getPlatformName().equalsIgnoreCase("IOS")) {
                driver.pushFile(dest, new File(source));
                System.out.println("Added to the Location");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }


    public static int generateID() {
        int numbers;
        Random r = new Random();
        numbers = 1000000000 + (int) (r.nextDouble() * 999999999);
        return numbers;
    }

    public float compareImage(File fileA, File fileB) {
        float percentage = 0;
        try {
            // take buffer data from both image files //
            BufferedImage biA = ImageIO.read(fileA);
            DataBuffer dbA = biA.getData().getDataBuffer();
            int sizeA = dbA.getSize();
            BufferedImage biB = ImageIO.read(fileB);
            DataBuffer dbB = biB.getData().getDataBuffer();
            int sizeB = dbB.getSize();
            int count = 0;
            // compare data-buffer objects //
            if (sizeA == sizeB) {
                for (int i = 0; i < sizeA; i++) {
                    if (dbA.getElem(i) == dbB.getElem(i)) {
                        count = count + 1;
                    }

                }
                percentage = (count * 100) / sizeA;
            } else {
                System.out.println("Both the images are not of same size");
            }

        } catch (Exception e) {
            System.out.println("Failed to compare image files ...");
        }
        return percentage;
    }

    public static String getTextFromImage(String ImagePath) {
        String result = null;
        File imageFile = new File(ImagePath);
        ITesseract instance = new Tesseract();
        try {
            instance.setDatapath("./tessdata");
            result = instance.doOCR(imageFile);

        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    public int getRandom() {
        return (int) (Math.random() * 10);
    }

    public MobileElement findElementByAndroidUIAutomator(String ResourceID) {
        return driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"" + ResourceID + "\")"));
    }

    public void swipeDownward() {
        Dimension size = driver.manage().window().getSize();
        int width = size.getWidth() / 2;
        int startPoint = (int) (size.getHeight() * 0.8);
        int endPoint = (int) (size.getHeight() * 0.21);
        new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction()
                .moveTo(PointOption.point(width, endPoint)).release().perform();
    }

    public void swipeUpward() {
        Dimension size = driver.manage().window().getSize();
        int width = size.getWidth() / 2;
        int startPoint = (int) (size.getHeight() * 0.21);
        int endPoint = (int) (size.getHeight() * 0.08);
        new TouchAction(driver).press(PointOption.point(width, endPoint)).waitAction().moveTo(PointOption.point(width, startPoint)).release().perform();
    }

    public void scrollToBottom() {
        waitTime(2000);
        try {
            long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
            int cont=1000;
            while (true) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, "+cont+");");
                Thread.sleep(2000);

                long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
                if (newHeight <= cont) {
                    break;
                }
//                      lastHeight = newHeight;
                cont+=500;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public MobileElement waitToAppear(AndroidElement element) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofMillis(1000))
                    .ignoring(NoSuchElementException.class);
            return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException toe) {
            MyLogger.log.info("No element was found " + element.toString());
            return null;
        }
    }

    public WebElement waitToAppear(WebElement element) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofMillis(1000))
                    .ignoring(NoSuchElementException.class);
            return wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException toe) {
            MyLogger.log.info("No element was found " + element.toString());
            return null;
        }
    }


    public void waitTime(long timeInMiliSeconds) {
        try {
            Thread.sleep(timeInMiliSeconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public WebElement waitToAppear(MobileElement element) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(20))
                    .pollingEvery(Duration.ofMillis(2000))
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class);
            return wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException toe) {
            MyLogger.log.info("No element was found " + element.toString());
            return null;
        }
    }

    public MobileElement waitToAppear(MobileElement element, int waitSeconds) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(waitSeconds))
                    .pollingEvery(Duration.ofMillis(250))
                    .ignoring(NoSuchElementException.class);
            return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException toe) {
        }
        return element;
    }

    public WebElement waitToAppear(WebElement element, int waitSeconds) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(waitSeconds))
                    .pollingEvery(Duration.ofMillis(250))
                    .ignoring(NoSuchElementException.class);
            return wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException toe) {
        }
        return element;
    }


    public boolean waitForActivity(String appActivity, int waitSeconds) {
        MyLogger.log.info("Checking App Activity");
        String activity = "";
        boolean isActivityPresent = false;
        for (int i = 0; i < waitSeconds; i++) {
            activity = driver.getSessionDetail("appActivity").toString();
            MyLogger.log.info("Current AppActivity : " + activity);
            if (!activity.contains(appActivity)) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {

                }
            } else {
                isActivityPresent = true;
                MyLogger.log.info(activity + " - Activity is Present");
            }
        }
        return isActivityPresent;
    }

    public Boolean waitToDisappear(MobileElement element, int waitSeconds) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(waitSeconds))
                    .pollingEvery(Duration.ofMillis(250))
                    .ignoring(NoSuchElementException.class);
            return wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (TimeoutException toe) {
            return false;
        }
    }

    public void scrollToAWebElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public Boolean waitToDisappear(AndroidElement element) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(60))
                    .pollingEvery(Duration.ofMillis(250))
                    .ignoring(NoSuchElementException.class);
            return wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (TimeoutException toe) {
            return false;
        }
    }

    public WebElement waitForElementToBetapable(AndroidElement element, int waitSeconds) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(waitSeconds))
                    .pollingEvery(Duration.ofMillis(250))
                    .ignoring(NoSuchElementException.class);
            return wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (TimeoutException toe) {
        }
        return element;
    }

    public Boolean isElementPresent(AndroidElement element) {
        try {
            return waitToAppear(element).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void isPageCompletelyLoaded() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : "
                        + ((JavascriptExecutor) driver).executeScript("return document.readyState"));
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }

    public Boolean isElementPresent(MobileElement element) {
        try {
            MyLogger.log.info(element.toString());
            return waitToAppear(element).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean isElementPresent(WebElement element) {
        try {
            MyLogger.log.info(element.toString());
            return waitToAppear(element).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean isChecked(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("checked").contains("true");
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean isCheckable(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("checkable").contains("true");
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean istapable(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("tapable").contains("true");
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean isEnabled(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("enabled").contains("true");
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean isFocusable(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("focusable").contains("true");
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean isFocused(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("focused").contains("true");
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean isScrollable(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("scrollable").contains("true");
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean isLongtapable(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("long-tapable").contains("true");
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean isSelected(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("selected").contains("true");
        } catch (Exception e) {
            return null;
        }
    }

    public Point getLocation(MobileElement element) {
        try {
            return waitToAppear(element).getLocation();
        } catch (Exception e) {
            return null;
        }
    }

    public Dimension getSize(MobileElement element) {
        try {
            return waitToAppear(element).getSize();
        } catch (Exception e) {
            return null;
        }
    }

    public String getText(MobileElement element) {
        try {
            return waitToAppear(element).getText();
        } catch (Exception e) {
            return null;
        }
    }

    public String getResourceId(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("resourceId");
        } catch (Exception e) {
            return null;
        }
    }

    public String getClassName(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("className");
        } catch (Exception e) {
            return null;
        }
    }

    public String getContentDesc(MobileElement element) {
        try {
            return waitToAppear(element).getAttribute("content-desc");
        } catch (Exception e) {
            return null;
        }
    }

    public void clearText(MobileElement element) {
        try {
            waitToAppear(element).clear();
        } catch (Exception e) {
        }
    }


    public void typeTextAndHitEnter(MobileElement element, String text) {
        try {
            waitToAppear(element).sendKeys(text + "\n");
        } catch (Exception e) {
            Assert.fail("Unable to find the edit text to enter the text" + element);
        }
    }

    public void typeText(MobileElement element, String text) {
        try {
            waitToAppear(element).sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Unable to find the edit text to enter the text" + element);
        }
    }


    public UiActions tap(MobileElement element) {
        try {
            waitToAppear(element).click();
            MyLogger.log.info("Successfully tap on element" + element);

        } catch (Exception e) {
            MyLogger.log.info("No Element was found by this" + element + e.getMessage());
            Assert.fail("No Element was found by this" + element + e.getMessage());
        }
        return this;
    }

    public UiActions longPress(MobileElement element) {
        MyLogger.log.info("I am in inside longPress");
        try {
            waitToAppear(element);
            ElementOption option = new ElementOption().withElement(element);
            new TouchAction<>(driver)
                    .longPress(LongPressOptions
                            .longPressOptions()
                            .withElement(option))
                    .waitAction()
                    .perform();
        } catch (Exception e) {
        }
        return this;
    }

    public UiActions longPress(MobileElement element, int holdTimeSeconds) {
        MyLogger.log.info("I am in inside longPress");
        try {
            waitToAppear(element);
            ElementOption option = new ElementOption().withElement(element);
            new TouchAction<>(driver)
                    .longPress(LongPressOptions
                            .longPressOptions()
                            .withElement(option)
                            .withDuration(Duration
                                    .ofSeconds(holdTimeSeconds)))
                    .waitAction()
                    .perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public UiActions longPress(int positionX, int positionY, int holdTimeSeconds) {
        MyLogger.log.info("I am in inside longPress");
        try {
            TouchAction perform = new TouchAction(driver)
                    .longPress(point(positionX, positionY))
                    .waitAction(waitOptions(Duration
                            .ofSeconds(holdTimeSeconds)))
                    .perform();
        } catch (Exception e) {
        }
        return this;
    }

    /**
     * Go back to previous screen
     *
     * @return
     */
    public UiActions androidGoBack(AndroidDriver driver) {
        try {
            pressKey(AndroidKey.BACK, driver);
            MyLogger.log.info("Sucessfully get back to previous page");
        } catch (Exception e) {
            MyLogger.log.debug("Unable to get back to previous screen" + e.getMessage());
            Assert.fail("Unable to get back to previous screen" + e.getMessage());

        }

        return this;
    }

    public UiActions pressEnterKey(AndroidDriver driver) {
        try {
            pressKey(AndroidKey.ENTER, driver);
            MyLogger.log.info("Successfully pressed the ENTER key");
        } catch (Exception e) {
            MyLogger.log.debug("Not able to pressed the ENTER key" + e.getMessage());
            Assert.fail("Not able to pressed the ENTER key" + e.getMessage());
        }

        return this;
    }

    public UiActions pasteKey(AndroidDriver driver) {
        try {
            pressKey(AndroidKey.PASTE, driver);
            MyLogger.log.info("Successfully pressed the ENTER key");
        } catch (Exception e) {
            MyLogger.log.debug("Not able to pressed the ENTER key" + e.getMessage());
            Assert.fail("Not able to pressed the ENTER key" + e.getMessage());
        }

        return this;
    }

    /**
     * Displays home screen
     *
     * @param
     * @return
     */
    public UiActions goHome(AndroidDriver driver) {
        try {
            pressKey(AndroidKey.HOME, driver);
        } catch (Exception e) {
            Assert.fail("Unable to go to home page");
        }
        return this;
    }

    /**
     * taps on backspace
     *
     * @param
     * @return
     */
    public UiActions backSpace(AndroidDriver driver) throws InterruptedException {
        pressKey(AndroidKey.DEL, driver);
        return this;
    }

    /**
     * closes an app
     */
    public UiActions closeApp() {
        driver.closeApp();
        return this;
    }

    public void refreshApp(AndroidDriver driver) {
        try {
            pressKey(AndroidKey.APP_SWITCH, driver);
            Thread.sleep(2000);
            MyLogger.log.info("Successfully backs the app in background (event: APP SWITCH)");
        } catch (Exception e) {
            MyLogger.log.debug("Unable to backs the app in background (event:APP SWITCH)" + e.getMessage());
            Assert.fail("Unable to backs the app in background (event:APP SWITCH)" + e.getMessage());
        }
        //pressKey(AndroidKey.BACK);
    }

    public void startActivity(String appPackage, String appActivity, AndroidDriver driver) {
        driver.startActivity(new Activity(appPackage, appActivity));
        MyLogger.log.info("Started the activity");
    }

    public void restartApp(String bunbleId) {
        try {
//            driver.resetApp();
            driver.terminateApp(bunbleId);
            Thread.sleep(2000);
            MyLogger.log.info("Successfully restarted the app");
        } catch (Exception e) {
            MyLogger.log.debug("Unable to restart the app" + e.getMessage());
            Assert.fail("Unable to restart the app" + e.getMessage());
        }
        //pressKey(AndroidKey.BACK);
    }

    public void appSwitch(AndroidDriver driver) {
        pressKey(AndroidKey.APP_SWITCH, driver);
    }

    public UiActions volumeUp(AndroidDriver driver) {
        pressKey(AndroidKey.VOLUME_UP, driver);
        return this;
    }

    /**
     * Call and EndCall Android Keys used
     * to accept and end the calls
     */
    public void acceptCallButton(AndroidDriver driver) {
        try {
            pressKey(AndroidKey.CALL, driver);
        } catch (Exception e) {
            Assert.fail("Unable to receive the call");
        }
    }

    public void endCallButton(AndroidDriver driver) {
        try {
            pressKey(AndroidKey.ENDCALL, driver);
            MyLogger.log.info("Successfully ends the call");
        } catch (Exception e) {
            MyLogger.log.debug("Unable to end the call " + e.getMessage());
            Assert.fail("Unable to end the call " + e.getMessage());
        }

    }

    public UiActions powerKey(AndroidDriver driver) {
        pressKey(AndroidKey.POWER, driver);
        return this;
    }

    /**
     * Displays home screen
     *
     * @param
     * @return
     */
    public UiActions pressKey(AndroidKey androidKey, AndroidDriver driver) {
        try {
            driver.pressKey(new KeyEvent(androidKey));
            MyLogger.log.info("Pressed key " + androidKey.name());
        } catch (Exception e) {
            Assert.fail("Failed in pressAndroidKeyAction(" + androidKey.name() + ")", e);
        }
        return this;
    }

    /**
     * Scrolls to element
     *
     * @return
     */
    public UiActions scrollToText(String visibleElementText, AndroidDriver driver) {
        try {
            driver.findElementByAndroidUIAutomator("new UiScrollable(" +
                    "new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(" +
                    "new UiSelector().textContains(\"" + visibleElementText + "\").instance(0))");

        } catch (Exception e) {
            //sLogger.error(e.getMessage(), e);
            Assert.fail("Failed in scrollTo " + e.getMessage(), e);
        }
        return this;

    }

    public UiActions scrollToContentDesc(String contentDescription, AndroidDriver driver) {
        try {
            driver.findElementByAndroidUIAutomator("new UiScrollable(" +
                    "new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(" +
                    "new UiSelector().descriptionContains(\"" + contentDescription + "\").instance(0))");

        } catch (Exception e) {
            //sLogger.error(e.getMessage(), e);
            Assert.fail("Failed in scrollTo " + e.getMessage(), e);
        }
        return this;
    }

    public void launchApp() {
        driver.launchApp();
        MyLogger.log.info("Application is launched");

    }

    public UiActions captureAppLauchTime(AppiumDriver driver) {
        String timeBeforelaunchApp = null;
        String timeAfterlaunchApp = null;

        Map<String, Object> sessiondetails = driver.getSessionDetails();
        try {
            System.out.println(sessiondetails.get("platformName"));
            if (sessiondetails.get("platformName").equals("ios")) {
                driver.terminateApp((String) sessiondetails.get("bundleId"));
                HashMap<String, Object> params = new HashMap<>();
                params.put("bundleId", sessiondetails.get("bundleId"));
                timeBeforelaunchApp = new SimpleDateFormat("HH:mm:ss").format(new Date());
                driver.executeScript("mobile: launchApp", params);
                for (int i = 0; i <= 4; i++) {
                    if ((long) driver.executeScript("mobile: queryAppState", params) == 4) {
                        timeAfterlaunchApp = new SimpleDateFormat("HH:mm:ss").format(new Date());
                        break;
                    } else if (i == 4) {
                        throw new Exception("App is not launched yet");
                    } else {
                        Thread.sleep(1000);
                    }
                }
                int timetakenToLaunchApp = getTimeInSeconds(timeAfterlaunchApp) - getTimeInSeconds(timeBeforelaunchApp);
                System.out.println("Time Taking To Launch the App: " + timetakenToLaunchApp);

            } else if (sessiondetails.get("platformName").equals("android")) {
                AndroidDriver<MobileElement> driver1;
                driver1 = (AndroidDriver<MobileElement>) driver;
                String activity = (String) sessiondetails.get("appActivity");
                driver.terminateApp((String) sessiondetails.get("appPackage"));
                HashMap<String, Object> params = new HashMap<>();
                params.put("appPackage", sessiondetails.get("appPackage"));
                params.put("appActivity", sessiondetails.get("appActivity"));
                timeBeforelaunchApp = new SimpleDateFormat("HH:mm:ss").format(new Date());
                //driver.executeScript("mobile: launchApp", params);
                driver.launchApp();
                for (int i = 0; i <= 4; i++) {
                    if (activity.contains(driver1.currentActivity()) || activity.equals(driver1.currentActivity())) {
                        timeAfterlaunchApp = new SimpleDateFormat("HH:mm:ss").format(new Date());
                        break;
                    } else if (i == 4) {
                        throw new Exception("App is not launched yet");
                    } else {
                        Thread.sleep(1000);
                    }
                }
                int timetakenToLaunchApp = getTimeInSeconds(timeAfterlaunchApp) - getTimeInSeconds(timeBeforelaunchApp);
                System.out.println("Time Taking To Launch the App: " + timetakenToLaunchApp);
            }
        } catch (Exception e) {
            MyLogger.log.debug("App is not launched yet " + e.getMessage());
            Assert.fail("App is not launched yet " + e.getMessage());
        }
        return this;
    }

    public int getTimeInSeconds(String timetext) {
        int time = 0;
        if (timetext.trim().length() == 5) {
            int mins = Integer.parseInt(timetext.substring(0, 2));  //00:15
            int secs = Integer.parseInt(timetext.substring(3, 5));
            time = (mins * 60) + secs;
            return time;

        } else if (timetext.trim().length() == 7) {
            int hrs = Integer.parseInt(timetext.substring(0, 1));
            int mins = Integer.parseInt(timetext.substring(2, 4));  //0:00:15
            int secs = Integer.parseInt(timetext.substring(5, 7));
            time = (hrs * 3600) + (mins * 60) + secs;
            return time;

        } else if (timetext.trim().length() == 8) {
            int hrs = Integer.parseInt(timetext.substring(0, 2));
            int mins = Integer.parseInt(timetext.substring(3, 5));  //00:00:15
            int secs = Integer.parseInt(timetext.substring(6, 8));
            time = (hrs * 3600) + (mins * 60) + secs;
            return time;
        } else {
            return -1;
        }
    }

    public UiActions tap(int x, int y) {
        try {
            new TouchAction<>(driver).press(point(x, y)).perform();
            MyLogger.log.info("Successfully pressed the given co-ordinate" + x + "," + y);
        } catch (Exception e) {
            try {
                Thread.sleep(5000);
                new TouchAction<>(driver).press(point(x, y)).perform();
            } catch (Exception e1) {
                MyLogger.log.info("Successfully pressed the given co-ordinate" + x + "," + y);
                e1.printStackTrace();

            }
        }
        return this;
    }


    public boolean checkDriver() {
        try {
            new TouchAction<>(driver).perform();
        } catch (Exception e) {
            MyLogger.log.info("Driver is terminated");
            return false;
        }
        return true;
    }

    /**
     * Swipe horizontally on element
     *
     * @return
     */
    public UiActions swipe(int startPositionX, int startPositionY, int endPositionX, int endPositionY) {
        try {
            new TouchAction<>(driver).press(point(startPositionX, startPositionY)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endPositionX, endPositionY)).release().perform();
            MyLogger.log.info("Successfully swiped the app in upward direction to close it");
        } catch (Exception e) {
            MyLogger.log.debug("Not able to swipe the app in upward direction to close it" + e.getMessage());
            Assert.fail("Not able to swipe the app in upward direction to close it" + e.getMessage());
        }
        return this;
    }

    public UiActions swipeHorizontally(int startPositionX, int startPositionY, int endPositionX, int endPositionY) {
        try {
            new TouchAction<>(driver).press(point(startPositionX, startPositionY)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endPositionX, endPositionY)).release().perform();
        } catch (Exception e) {
            MyLogger.log.debug("Not able to swipe the app in upward direction to close it" + e.getMessage());
            Assert.fail("Not able to swipe the app in upward direction to close it" + e.getMessage());
        }
        return this;
    }

    /**
     * Swipes by Element
     *
     * @param startElement
     * @param direction
     * @throws InterruptedException
     */
    public void swipeByElement(AndroidElement startElement, Direction direction) throws InterruptedException {

        int startXCoord = startElement.getLocation().getX();
        int startYCoord = startElement.getLocation().getY();
        int endXCoord = startElement.getSize().getWidth();
        int endYCoord = startElement.getSize().getHeight();

        TouchAction<?> action = new TouchAction<>(driver);
        switch (direction) {
            case LEFTTORIGHT:
                action.press(point(startXCoord, startYCoord)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endXCoord, startYCoord)).release().perform();
                break;
            case RIGHTTOLEFT:
                action.press(point(endXCoord, startYCoord)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(startXCoord, startYCoord)).release().perform();
                break;
            case TOPTOBOTTOM:
                action.press(point(startXCoord, startYCoord)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(startXCoord, endYCoord)).release().perform();
                break;
            case BOTTOMTOTOP:
                action.press(point(startXCoord, endYCoord)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(startXCoord, startYCoord)).release().perform();
                break;

            default:
                break;
        }
    }

    /**
     * Swipe by Element
     *
     * @param startElement
     * @param anchor
     * @param direction
     * @throws InterruptedException
     */
    public void swipeByElement(MobileElement startElement, double anchor, Direction direction) throws InterruptedException {

        int startXCoord = startElement.getLocation().getX();
        int startYCoord = startElement.getLocation().getY();
        int endXCoord = startElement.getSize().getWidth();
        int endYCoord = startElement.getSize().getHeight();

        int y = driver.manage().window().getSize().getHeight();
//    	int x = getDriver().manage().window().getSize().getWidth();
        System.out.println("startXCoord:" + startXCoord + ",startYCoord:" + startYCoord + ",endXCoord:" + endXCoord + ", endYCoord: " + endYCoord);
        TouchAction<?> action = new TouchAction<>(driver);

        switch (direction) {
            case LEFTTORIGHT:
                action.press(point(startXCoord, startYCoord)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endXCoord, startYCoord)).release().perform();
                break;
            case RIGHTTOLEFT:
//    			action.press(point(endXCoord-10, startYCoord/2)).waitAction(waitOptions(ofMillis(1000))).moveTo(point((int)(startXCoord*anchor), startYCoord/2)).release().perform();
                action.press(point(endXCoord * 2, startYCoord)).waitAction(waitOptions(ofMillis(1000))).moveTo(point((int) (startXCoord * anchor), startYCoord)).release().perform();
                break;
            case TOPTOBOTTOM:
                action.press(point(startXCoord, startYCoord))/*.waitAction(waitOptions(ofMillis(1000)))*/.moveTo(point(startXCoord, y - 200)).release().perform();
                break;
            case BOTTOMTOTOP:
                action.press(point(endXCoord / 2, y - 200)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endXCoord / 2, (int) (y * anchor))).release().perform();
                break;

            default:
                break;
        }

    }

    //Horizontal Swipe by percentages
    public UiActions horizontalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
        return this;
    }

    //Vertical Swipe by percentages
    public UiActions verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);

        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
        return this;
    }

    //Multitouch action by using an android element
    public void multiTouchByElement(MobileElement element, Duration duration) {
        TouchAction press = new TouchAction(driver)
                .press(element(element))
                .waitAction(waitOptions(duration))
                .release();
        new MultiTouchAction(driver)
                .add(press)
                .perform();
    }

    //Swipe by elements
    public UiActions swipeByElements(MobileElement startElement, MobileElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

        new TouchAction(driver)
                .press(point(startX, startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
        return this;
    }


    //Verifies current android activity
    public boolean isActivityLaunched(String activity, AndroidDriver driver) {
        boolean isLaunched = false;
        try {
            if (driver.currentActivity().contains(activity))
                isLaunched = true;
        } catch (Exception e) {
            //sLogger.error(e.getMessage(), e);
            Assert.fail(activity + "is not launched", e);
        }
        return isLaunched;
    }

    public Boolean isKeyboardShown(AndroidDriver driver) {
        try {
            return driver.isKeyboardShown();
        } catch (Exception e) {
            Assert.fail("Failed in pressNavigationAction() due to: " + e.getMessage(), e);
            return null;
        }
    }

    public UiActions hideKeyboard() {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            Assert.fail("Failed in pressNavigationAction() due to: " + e.getMessage(), e);
        }
        return this;
    }

    public String getDeviceTime() {
        String deviceTime = "";
        try {
            deviceTime = driver.getDeviceTime();
        } catch (Exception e) {
            Assert.fail("Failed in pressNavigationAction() due to: " + e.getMessage(), e);
        }
        return deviceTime;
    }

    public String getClipboardText(AndroidDriver driver) {
        String clipBoardText = "";
        try {
            clipBoardText = driver.getClipboardText();
        } catch (Exception e) {
            Assert.fail("Failed in pressNavigationAction() due to: " + e.getMessage(), e);
        }
        return clipBoardText;
    }

    public String getPageSource() {
        String pageSource = "";
        try {
            pageSource = driver.getPageSource();
        } catch (Exception e) {
            Assert.fail("Failed in pressNavigationAction() due to: " + e.getMessage(), e);
        }
        return pageSource;
    }

    /**
     * Add comment and device screenshot to report.
     */

    public String executeADBShellScript(String command, AndroidDriver driver) {
        List<String> list = Arrays.asList(command.split(" "));
        Map<String, Object> map = ImmutableMap.of(
                "command", list.get(0), "args", list.subList(1, list.size()));
        return (String) driver.executeScript("mobile:shell", map);
    }

    //Opens notificationsText
    public UiActions openNotifications(AndroidDriver driver) {
        try {
            driver.openNotifications();
        } catch (Exception e) {
            Assert.fail("Failed in openNotifications()" + e.getMessage());
        }
        return this;
    }

//    public String captureLogcat(String testName) throws IOException {
//        List<LogEntry> logs = driver.manage().logs().get("logcats").getAll();
//        FileOutputStream fos = null;
//        String timeStamp = new DateTime().getTimeStampString();
//        String logFilePath = System.getProperty("user.dir") +
//                new ConfigManager().getProperty("LOGCAT_LOCATION") +
//                new DateTime().getDate() +
//                File.separator +
//                testName +
//                UNDERSCORE +
//                LOGCAT_NAME +
//                timeStamp +
//                TXT_FILE_TYPE;
//        File logFile = new File(logFilePath);
//        logFile.getParentFile().mkdirs();
//        try {
//            fos = new FileOutputStream(logFile);
//        } catch (FileNotFoundException e) {
//            MyLogger.log.info(e.getMessage());
//
//        }
//        PrintWriter writer = new PrintWriter(fos);
//        writer.println(logs);
//        writer.flush();
//        return logFilePath;
//    }

/*
    public BufferedImage takeScreenshot(String testName) throws IOException {
        File srcImage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage bufferedImage = null;
        String timeStamp = new DateTime().getTimeStampString();
        String destScreenshotFilePath = System.getProperty("user.dir") +
                new ConfigManager().getProperty("SCREENSHOTS_LOCATION") +
                new DateTime().getDate() +
                File.separator +
                testName +
                UNDERSCORE +
                LOGCAT_NAME +
                UNDERSCORE +
                timeStamp +
                PNG_FILE_TYPE;
        File screenshotFile = new File(destScreenshotFilePath);
        screenshotFile.getParentFile().mkdirs();
        // moveFile(srcImage, screenshotFile);
        try {
            bufferedImage = ImageIO.read(srcImage);
        } catch (IOException e) {
            MyLogger.log.info(e.getMessage());
        }
        return bufferedImage;
    }
*/

    public void navigateBack(AndroidDriver driver) {
        try {
            Thread.sleep(500);
            androidGoBack(driver);
            MyLogger.log.info("Navigated back successfully");
        } catch (Exception e) {
            MyLogger.log.debug("Not able to go back " + e.getMessage());
            Assert.fail("Not able to go back " + e.getMessage());
        }
    }

    public UiActions findElementByXpath(By xpath) {
        try {
            waitToAppear((AndroidElement) driver.findElement(xpath));
        } catch (Exception e) {
            MyLogger.log.info(e.getMessage());
        }
        return this;
    }

    public UiActions findElementById(By Id) {
        try {
            waitToAppear((AndroidElement) driver.findElement(Id));
        } catch (Exception e) {
            MyLogger.log.info(e.getMessage());

        }
        return this;
    }

    public UiActions findElementByClassName(By className) {
        try {
            waitToAppear((AndroidElement) driver.findElement(className));
        } catch (Exception e) {
            MyLogger.log.info(e.getMessage());

        }
        return this;
    }

    public UiActions findElementByContent(By content) {
        try {
            waitToAppear((AndroidElement) driver.findElement(content));
        } catch (Exception e) {

        }
        return this;
    }

    public UiActions findElementByText(By text) {
        try {
            waitToAppear((AndroidElement) driver.findElement(text));
        } catch (Exception e) {

        }
        return this;
    }

    public UiActions scrollTillElement(String text) {

        try {
            WebElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                    ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
            System.out.println(element);

        } catch (Exception e) {
            MyLogger.log.info("Failed in tapping with text " + e.getMessage(), e);
            Assert.fail("Failed in tapping with text " + e.getMessage(), e);
        }
        return this;
    }

    public boolean isElementPresentWitResurseID(String resourceID, AndroidDriver driver) {
        try {

            WebElement element = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"" + resourceID + "\"));");
            System.out.println(element.getAttribute("text"));
            return element.isDisplayed();

        } catch (Exception e) {
            MyLogger.log.info("Failed to find element with text " + e.getMessage(), e);
            Assert.fail("Failed to find element with text " + e.getMessage(), e);
            return false;
        }
    }

    public boolean hasElement(String text, AndroidDriver driver) {
        try {
            WebElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(" +
                    "new UiSelector().scrollable(false).instance(0))" + ".scrollIntoView(" +
                    "new UiSelector().textContains(\"" + text + "\").instance(0))");
            return element.isDisplayed();

        } catch (Exception e) {
            MyLogger.log.info("Failed to find element with text " + e.getMessage(), e);
            Assert.fail("Failed to find element with text " + e.getMessage(), e);
            return false;
        }
    }

    public void swipeRight() {

        //The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        //Starting x location set to 5% of the width (near left)
        int startx = (int) (size.width * 0.02);
        //Ending x location set to 95% of the width (near right)
        int endx = (int) (size.width * 0.95);
        //y position set to mid-screen vertically
        int starty = size.height / 20;

        swipeHorizontally(startx, starty, endx, starty);

    }

    //Swioe Left Operation
    public void swipeOnLeft(String res_ID) {
        List<MobileElement> e = driver.findElementsById(res_ID);
        AndroidElement firdelement = (AndroidElement) e.get(0);
        AndroidElement secondElement = (AndroidElement) e.get(1);
        //AndroidElement thirdElement= (AndroidElement) e.get(2);

        int midOfY = secondElement.getLocation().y + (secondElement.getSize().height / 2);
        System.out.println(midOfY);
        int fromXLocation = secondElement.getLocation().x;
        System.out.println(fromXLocation);
        int toXLocation = firdelement.getLocation().x;
        System.out.println(toXLocation);


        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(fromXLocation, midOfY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(toXLocation, midOfY))
                .release()
                .perform();
    }


    public MobileElement findByText(String text, AndroidDriver driver) {
        try {
            MobileElement element = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(" +
                    "new UiSelector().scrollable(false).instance(0))" + ".scrollIntoView(" +
                    "new UiSelector().textContains(\"" + text + "\").instance(0))");
            return element;
        } catch (Exception e) {
            return null;
        }
    }

    public UiActions tapUiAutomatorText(String text, AndroidDriver driver) {
        try {
            WebElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(" +
                    "new UiSelector().scrollable(false).instance(0))" + ".scrollIntoView(" +
                    "new UiSelector().textContains(\"" + text + "\").instance(0))");
            System.out.println(element);
            new TouchAction<>(driver).tap(tapOptions().withElement(element(element))).perform();
            MyLogger.log.info("Tapped to the element with text successfully");

        } catch (Exception e) {
            MyLogger.log.info("Failed in tapping with text " + e.getMessage(), e);
            Assert.fail("Failed in tapping with text " + e.getMessage(), e);
        }
        return this;
    }

    public UiActions tapUiAutomatorContent(String text, AndroidDriver driver) {
        try {
            WebElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(" +
                    "new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(" +
                    "new UiSelector().descriptionContains(\"" + text + "\").instance(0))");
            System.out.println(element);
            new TouchAction<>(driver).tap(tapOptions().withElement(element(element))).perform();
            MyLogger.log.info("Tapped to the element with content description successfully");

        } catch (Exception e) {
            MyLogger.log.info("Failed in tapping with content description " + e.getMessage(), e);
            Assert.fail("Failed in tapping with content description " + e.getMessage(), e);
        }
        return this;
    }

    public MobileElement swipeToElementByText(String exact_text) {
        MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
                        ".scrollIntoView(new UiSelector().text(\"" + exact_text + "\"))"));
        return element;
    }

    public UiActions tapUiAutomatorResourceId(String text, AndroidDriver driver) {
        try {
            WebElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(" +
                    "new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(" +
                    "new UiSelector().ResourceId(\"" + text + "\").instance(0))");
            System.out.println(element);
            new TouchAction<>(driver).tap(tapOptions().withElement(element(element))).perform();
            MyLogger.log.info("Tapped to the element with ID successfully");

        } catch (Exception e) {
            MyLogger.log.info("Failed in tapping with ID " + e.getMessage(), e);
            Assert.fail("Failed in tapping with ID " + e.getMessage(), e);
        }
        return this;
    }

    public UiActions tapUiAutomatorClassName(String text, AndroidDriver driver) {
        try {
            WebElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(" +
                    "new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(" +
                    "new UiSelector().className(\"" + text + "\").instance(0))");
            System.out.println(element);
            new TouchAction<>(driver).tap(tapOptions().withElement(element(element))).perform();
            MyLogger.log.info("Tapped to the element with className successfully");

        } catch (Exception e) {
            MyLogger.log.info("Failed in tapping with className " + e.getMessage(), e);
            Assert.fail("Failed in tapping with className " + e.getMessage(), e);
        }
        return this;
    }

    public void getScreenShot(String path_screenshot, AndroidDriver driver) throws IOException {
        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        String filename = "VPNStatus";
        File targetFile = new File(path_screenshot + filename + ".png");
        FileUtils.copyFile(srcFile, targetFile);


    }


    public String takeScreenShot() {
        // Set folder name to store screenshots.
        String destDir = "screenshots";
        String scrPath = null;
        // Capture screenshot.
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Set date format to set It as screenshot file name.
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        // Create folder under project with name "screenshots" provided to destDir.
        new File(destDir).mkdirs();
        // Set file name using current date time.
        String destFile = dateFormat.format(new Date()) + ".png";

        try {
            // Copy paste file at destination folder location
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
            scrPath = destDir + "/" + destFile;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return scrPath;
    }

    private void clickOnMatchScreenArea(String imageName) {
        try {
            screen.find(basePath + imageName);
            screen.click(basePath + imageName);
        } catch (Exception e) {
            MyLogger.log.info("No match found");
        }
    }

    private void doubleClickOnMatchScreenArea(String imageName) {
        try {
            screen.find(basePath + imageName);
            screen.doubleClick(basePath + imageName);
        } catch (Exception e) {
            MyLogger.log.info("No match found");
        }
    }

    public boolean isImagePresent(String image) {
        boolean status = false;
        Screen screen = new Screen();
        try {
            screen.find(image);
            status = true;
        } catch (FindFailed e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return status;
    }

    public boolean isImageExist(String imageName) {
        Match m = screen.exists(imageName);
        if (m != null) {
            MyLogger.log.info("Match found");
            return true;
        } else {
            MyLogger.log.info("No match found");
            return false;
        }
    }

    private void rightClickOnMatchScreenArea(String imageName) {
        try {
            screen.find(basePath + imageName);
            screen.rightClick(basePath + imageName);
        } catch (Exception e) {
            MyLogger.log.info("No match found");
        }
    }

    private void typeOnScreenArea(String imageName, String text) {
        try {
            screen.find(basePath + imageName);
            screen.type(basePath + imageName, text);
        } catch (Exception e) {
            MyLogger.log.info("No match found");
        }
    }


    private void dragAndDropScreenLocation(String imageName1, String imageName2) {
        try {
            screen.dragDrop(basePath + imageName1, basePath + imageName2);
        } catch (Exception e) {
            MyLogger.log.info("No match found");
        }
    }

    private void hoverOnScreenArea(String imageName) {
        try {
            screen.hover(basePath + imageName);
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    private void wheelActionOnScreenArea(String imageName, int position, int direction) {
        try {
            screen.wheel(basePath + imageName, position, direction);
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    public String elementScreenshot(MobileElement ele) {
        File screenshotLocation = null;
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            BufferedImage fullImg = ImageIO.read(scrFile);
            //Get the location of element on the page
            Point point = ele.getLocation();
            //Get width and height of the element
            int eleWidth = ele.getSize().getWidth();
            int eleHeight = ele.getSize().getHeight();
            //Crop the entire page screenshot to get only element screenshot
            BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
            ImageIO.write(eleScreenshot, "png", scrFile);
            String path = "screenshots/" + UUID.randomUUID() + "" + ".png";
            screenshotLocation = new File(System.getProperty("user.dir") + "/" + path);
            FileUtils.copyFile(scrFile, screenshotLocation);
            System.out.println(screenshotLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenshotLocation.toString();

    }

}





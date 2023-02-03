package app.tatasky.freemium;


import io.appium.java_client.MobileDriver;

public class TataSkyFreemiumApp {


    public MobileDriver driver;
    public FreemiumHomePage freemiumHomePage;
    public SideMenu sideMenu;
    public BottomNavigation bottomNavigation;
    public Search search;
    public AllCategoriesPage allCategoriesPage;
    public ContentDetails contentDetails;
    public Subscription subscription;


    public TataSkyFreemiumApp(MobileDriver driver) {
        this.driver = driver;
        freemiumHomePage = new FreemiumHomePage(driver);
        sideMenu = new SideMenu(driver);
        bottomNavigation = new BottomNavigation(driver);
        search = new Search(driver);
        allCategoriesPage = new AllCategoriesPage(driver);
        contentDetails = new ContentDetails(driver);
        subscription = new Subscription(driver);

    }
}

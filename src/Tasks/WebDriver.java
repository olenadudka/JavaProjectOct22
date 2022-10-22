package Tasks;

public interface WebDriver {
    /*
    Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them
     */
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
 interface TakesScreenShot extends RemoteWebDriver{
    void getScreenShot();
 }

 class ChromeDriver implements WebDriver, RemoteWebDriver{

     public void navigate(){
         System.out.println("Chromedriver navigate to page");
     }
     @Override
     public void open() {
         System.out.println("Chrome open the page");
     }

     @Override
     public void close() {
         System.out.println("Chrome close the page");
     }

     @Override
     public String getTitle() {
        return "google";
     }


 }
class FirefoxDriver implements WebDriver, RemoteWebDriver{

    public void navigate(){
        System.out.println("FirefoxDriver navigate to page");
    }
    @Override
    public void open() {
        System.out.println("FirefoxDriver open the page");
    }

    @Override
    public void close() {
        System.out.println("FirefoxDriver close the page");
    }

    @Override
    public String getTitle() {
        return "firefox";
    }


}
class SafariDriver implements WebDriver, RemoteWebDriver{

    public void navigate(){
        System.out.println("SafariDriver navigate to page");
    }
    @Override
    public void open() {
        System.out.println("SafariDriver open the page");
    }

    @Override
    public void close() {
        System.out.println("SafariDriver close the page");
    }

    @Override
    public String getTitle() {
        return "safari";
    }}

class TestWebDrivers{
    public static void main(String[] args) {


    RemoteWebDriver[] arr={new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
    for(RemoteWebDriver web:arr){
web.open();
web.close();
web.getTitle();
web.navigate();
//web.getScreenShot(); not avaliable
    }
}}
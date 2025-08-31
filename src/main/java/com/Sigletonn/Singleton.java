package com.Sigletonn;

public class Singleton {

/*

🧠 How to Explain Singleton in an Interview?
You can frame your answer like this:

"A Singleton class in Java ensures that only one instance of the class is created
throughout the application lifecycle.
In test automation, Singleton is extremely useful to manage shared resources
like the WebDriver instance, config readers, and loggers.
For example, if each test class creates its own WebDriver instance,
it would lead to multiple browser windows and wasted memory.
So we use a Singleton pattern to manage the WebDriver centrally and reuse it across tests,
ensuring consistency and resource optimization."

*/

    private static Singleton instance;

    private  Singleton(){
    }

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){  // this is for thread safety
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }



    /*📌 Example: Singleton for WebDriver in Selenium

    public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
*/
}

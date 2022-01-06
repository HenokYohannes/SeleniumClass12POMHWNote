package com.company.class12;

import com.company.loginPageWithPageFactory;
import com.company.testBase.Baseclass;
import com.company.utils.CommonMethods;
import org.openqa.selenium.WebElement;


public class PomTester {


    public static void main(String[] args) throws InterruptedException {
        Baseclass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        loginPageWithPageFactory login = new loginPageWithPageFactory();

        WebElement user = login.username;
        CommonMethods.sendText(user, "Admin");

        WebElement password = login.password;
        CommonMethods.sendText(password, "Hum@nhrm123");
        login.loginBtn.click();

        PomLoginpage page = new PomLoginpage();
        page.Admin.click();
        page.username.sendKeys("AlexBrown");
        page.UserRole.sendKeys("ESS");
        Thread.sleep(2000);
        CommonMethods.takeTheSs("DashBordPage2");
        CommonMethods.tearDown();
    }

}
/*DashboardPage dashboard=new DashboardPage();
        dashboard.adminbtn.click();
        dashboard.EmployeeName.sendKeys("AlexBrown");
        dashboard.searchButton.click();
Thread.sleep(2000);
CommonMethods.takeTheSs("screenshot");

Thread.sleep(3000);




 */
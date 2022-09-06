package addressbook.appmanager;

import org.openqa.selenium.WebDriver;

public class NavigationHelper {
  private WebDriver wd;
  protected GroupHelper groupHelper;

  public NavigationHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void gotoGroupPage() {
    groupHelper.returnGroupPage();
  }
}

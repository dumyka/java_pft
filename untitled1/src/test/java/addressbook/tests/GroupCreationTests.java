package addressbook.tests;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm();
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnGroupPage();
    app.logout();
  }

}


package addressbook;

public class ContactData {
  private final String lastName;
  private final String telephone;
  private final String mail;
  private final String firstName;

  public ContactData(String lastName, String telephone, String mail, String firstName) {
    this.lastName = lastName;
    this.telephone = telephone;
    this.mail = mail;
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getMail() {
    return mail;
  }

  public String getFirstName() {
    return firstName;
  }
}

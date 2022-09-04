package addressbook;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String telephone;
  private final String mail;


  public ContactData(String firstName, String lastName, String telephone, String mail ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.mail = mail;

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

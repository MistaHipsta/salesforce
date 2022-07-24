import com.github.javafaker.Faker;
import org.example.pages.AccountsPage;
import org.example.pages.LoginPage;
import org.example.pages.NewAccountModal;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void createAccountTest() {
        new LoginPage(driver).open()
                .inputTextInUserName("jack.suvorov13-8bfv@force.com")
                .inputTextInPassword("Sales255")
                .submitForm();
        new AccountsPage(driver).open()
                .clickNewButton();

        Faker faker = new Faker();
        new NewAccountModal(driver).fillInNewAccountModal(faker.company().name(),
                                                          faker.internet().url(),
                                                          faker.phoneNumber().phoneNumber(), "Competitor")
                .saveAccount();
    }
}
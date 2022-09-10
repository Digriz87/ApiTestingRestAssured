
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class AuthorizationTest {

    private String url = "https://ws-test.keepit.com/users";
    private String login = "automation@keepitqa.com";
    private String incorrectPassword = "incorrect";
    private String correctPassword = "E#*b2wGIbFHz";


    @Test(description = "Expected success Login status code 200 with correct password and login")
    public void successLogin() {
                given().auth().
                basic(login, correctPassword).
                when().
                get(url).
                then().
                assertThat().
                statusCode(200)
                .extract().response().asString();

    }

    @Test(description = "Expected not login without credentials 401 status code")
    public void loginWithNoCreds() {
        given().
                when().
                get(url).
                then().
                assertThat().
                statusCode(401);
    }

    @Test(description = "Expected not login with incorrect credentials 401 status code")
    public void loginWithIncorrectPassword() {
        given().auth().
                basic(login, incorrectPassword).
                when().
                get(url).
                then().
                assertThat().
                statusCode(401);
    }
}

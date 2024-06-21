package ReqresSandbox;

import ReqresSandbox.Register.RegisterRequest;
import ReqresSandbox.Register.RegisterResponse;
import ReqresSandbox.Users.UsersResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    private static final String BASE_URL = "https://reqres.in/api/";

    @Test
    public void checkAvatarAndIdTest() {
        Specs.installSpecs(Specs.requestSpec(BASE_URL), Specs.responseSpecOK200());
        UsersResponse response = given()
                .when()
                .get("users?page=1")
                .then()
                .assertThat()
                .log().all()
                .extract().body().as(UsersResponse.class);

        response.getData()
                .forEach(u -> Assertions.assertTrue(u.getAvatar().replace("-image.jpg", "").endsWith(u.getId().toString()))
        );

        response.getData()
                .forEach(u -> Assertions.assertTrue(u.getEmail().endsWith("reqres.in")));
    }

    @Test
    public void checkRegistrationOkTest() {
        Specs.installSpecs(Specs.requestSpec(BASE_URL), Specs.responseSpecOK200());

        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";

        RegisterRequest request = new RegisterRequest("eve.holt@reqres.in", "pistol");
        RegisterResponse response = given()
                .log().all()
                .body(request)
                .when()
                .post("register")
                .then()
                .log().all()
                .extract().as(RegisterResponse.class);

        Assertions.assertEquals(id, response.getId());
        Assertions.assertEquals(token, response.getToken());
    }

    @Test
    public void checkRegistationErrorTest() {
        Specs.installSpecs(Specs.requestSpec(BASE_URL), Specs.responseSpecError400());

        given()
                .log().all()
                .body(" {'email':'oaseijf@oasidf.sdd'} ")
                .when()
                .post("register")
                .then()
                .log().all();
    }
}

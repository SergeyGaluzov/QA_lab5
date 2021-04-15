import entities.User;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LoginTest {



    @Test
    public void validateUserByResponse200(){
        String id = "b7011bbf-eaaa-4924-be41-1184602b569d";
        new ApiEndpoints().getPantryDetails(id).then().assertThat().statusCode(200);
    }

    @Test
    public void validateUserByIdAndReturn()
    {
        String id = "b7011bbf-eaaa-4924-be41-1184602b569d";
        User user = new ApiEndpoints().getPantryDetails(id).as(User.class);
        assertEquals("Sergey Galuzov",user.getName());
    }

    @Test
    public void validateNotExistedUserReturn400(){
        String id = "not existed";
        new ApiEndpoints().getPantryDetails(id).then().assertThat().statusCode(400);
    }

}

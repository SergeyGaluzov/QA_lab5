import entities.Basket;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class BasketTest {

    @Test
    public void validateCreationBasketAndReturn200(){
        Basket basket = new Basket();
        basket.setDescr("description");
        basket.setIspayed(true);
        basket.setKeysLength(12);
        new ApiEndpoints().createBasket(basket,"xxx").then().assertThat().statusCode(200);
    }

    @Test
    public void validateGettingNotEmptyBodyAndReturn200(){
        new ApiEndpoints().getBasket("xxx").then().assertThat()
                .statusCode(200).assertThat().body(Matchers.notNullValue());
    }

    @Test
    public void validateNotExistedBacketAndReturn400(){
        new ApiEndpoints().getBasket("not existed basket").then().assertThat().statusCode(400);
    }

    @Test
    public void validateDeletingExistedBasketAndReturn200(){
        new ApiEndpoints().deleteBasket("xxx").then().assertThat().statusCode(200);
    }

    @Test
    public void validateDeletingNotExistedBasketAndReturn400(){
        new ApiEndpoints().deleteBasket("not existed basket").then().assertThat().statusCode(400);
    }

}

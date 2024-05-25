import org.example.UseCaseResponse;
import org.junit.jupiter.api.Test;

public class UseCaseResponseTest {

    @Test
    public void givenSuccessResponseThenIsSuccessIsTrue() {
        UseCaseResponse<Long> response = UseCaseResponse.createSuccessResponse(1L);
    }

}

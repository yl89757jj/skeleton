package api;

import io.dropwizard.jersey.validation.Validators;
import org.junit.Test;

import javax.validation.Validator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.collection.IsEmptyCollection.empty;

public class CreateReceiptTagRequestTest {
    private final Validator validator = Validators.newValidator();

    @Test
    public void testValid(){
        CreateReceiptTagRequest tagRequest = new CreateReceiptTagRequest();
        tagRequest.receiptId = 1;
        assert(tagRequest.receiptId == 1);
    }

    @Test
    public void testMissingReceiptId(){
        CreateReceiptTagRequest tagRequest = new CreateReceiptTagRequest();
        validator.validate(tagRequest);
        assertThat(validator.validate(tagRequest), hasSize(0));
    }
}

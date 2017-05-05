package jp.pigumer.lambda;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class HandlerSpec {

    @Test
    public void handleSpec() {
        RequestMessage msg = new RequestMessage();
        msg.timeZone = "Asia/Tokyo";

        ResponseMessage res = new Handler().handle(msg, null);
        System.out.println(res.now);
        assertThat(res.now, is(not(nullValue())));
    }
}

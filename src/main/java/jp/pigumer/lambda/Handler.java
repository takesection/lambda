package jp.pigumer.lambda;

import com.amazonaws.services.lambda.runtime.Context;

public class Handler {

	public ResponseMessage handle(RequestMessage msg, Context context) {
		ResponseMessage rm = new ResponseMessage();
		rm.result1 = msg.msg1;
		rm.result2 = msg.msg2;
		rm.result3 = msg.msg3;
		return rm;
	}
}

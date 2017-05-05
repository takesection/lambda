package jp.pigumer.lambda;

import com.amazonaws.services.lambda.runtime.Context;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Handler {

	public ResponseMessage handle(RequestMessage msg, Context context) {
		ResponseMessage rm = new ResponseMessage();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		rm.now = ZonedDateTime.now(ZoneId.of(msg.timeZone)).format(formatter);
		return rm;
	}
}

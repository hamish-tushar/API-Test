package insightly;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import io.restassured.http.ContentType;

@Retention(RetentionPolicy.RUNTIME)
public @interface Content {
	ContentType value();	
}

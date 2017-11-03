package insightly.test;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.ProxySpecification;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class InsightlyRequestSpecification implements RequestSpecification{
	private RequestSpecification spec;
    
    public InsightlyRequestSpecification(){
        spec = RestAssured.given();
    }
    
    public InsightlyRequestSpecification brief(boolean value) {
        spec.queryParam("brief", value);
        return this;
    }
    
    public InsightlyRequestSpecification countTotal(boolean value) {
        spec.queryParam("count_total", value);
        return this;
    }
    
    public InsightlyRequestSpecification skip(int value) {
        spec.queryParam("skip", value);
        return this;
    }
    
    public InsightlyRequestSpecification take(int value) {
        spec.queryParam("top", value);
        return this;
    }
    
    public InsightlyRequestSpecification withId(int id) {
        spec.queryParam("id", id);
        return this;
    }
    
	public Response get(String path, Object... pathParams) {
		return spec.get(path, pathParams);
	}
	
	public Response get(String path, Map<String, ?> pathParams) {
		return spec.get(path, pathParams);
	}
	
	public Response post(String path, Object... pathParams) {
		return spec.post(path, pathParams);
	}
	
	public Response post(String path, Map<String, ?> pathParams) {
		return spec.post(path, pathParams);
	}
	
	public Response put(String path, Object... pathParams) {
		return spec.put(path, pathParams);
	}
	
	public Response put(String path, Map<String, ?> pathParams) {
		return spec.put(path, pathParams);
	}
	
	public Response delete(String path, Object... pathParams) {
		return spec.delete(path, pathParams);
	}
	
	public Response delete(String path, Map<String, ?> pathParams) {
		return spec.delete(path, pathParams);
	}
	
	public Response head(String path, Object... pathParams) {
		return spec.head(path, pathParams);
	}
	
	public Response head(String path, Map<String, ?> pathParams) {
		return spec.head(path, pathParams);
	}
	
	public Response patch(String path, Object... pathParams) {
		return spec.patch(path, pathParams);
	}
	
	public Response patch(String path, Map<String, ?> pathParams) {
		return spec.patch(path, pathParams);
	}
	
	public Response options(String path, Object... pathParams) {
		return spec.options(path, pathParams);
	}
	
	public Response options(String path, Map<String, ?> pathParams) {
		return spec.options(path, pathParams);
	}
	
	public Response get(URI uri) {
		return spec.get(uri);	
	}
	
	public Response post(URI uri) {
		return spec.post(uri);		
	}
	public Response put(URI uri) {
		return spec.put(uri);	
	}
	
	public Response delete(URI uri) {
		return spec.delete(uri);		
	}
	
	public Response head(URI uri) {
		return spec.head(uri);		
	}
	
	public Response patch(URI uri) {
		return spec.patch(uri);		
	}
	
	public Response options(URI uri) {
		return spec.options(uri);		
	}
	
	public Response get(URL url) {
		return spec.get(url);	
	}
	
	public Response post(URL url) {
		return spec.post(url);		
	}
	
	public Response put(URL url) {
		return spec.put(url);		
	}
	
	public Response delete(URL url) {
		return spec.delete(url);		
	}
	
	public Response head(URL url) {
		return spec.head(url);		
	}
	
	public Response patch(URL url) {
		return spec.patch(url);		
	}
	
	public Response options(URL url) {
		return spec.options(url);	
	}
	
	public Response get() {
		return spec.get();	
	}
	
	public Response post() {
		return spec.post();		
	}
	
	public Response put() {
		return spec.put();	
	}
	
	public Response delete() {
		return spec.delete();		
	}
	
	public Response head() {
		return spec.head();		
	}
	
	public Response patch() {
		return spec.patch();		
	}
	
	public Response options() {
		return spec.options();		
	}
	
	public Response request(Method method) {
		return spec.request(method);		
	}
	
	public Response request(String method) {
		return spec.request(method);		
	}
	
	public Response request(Method method, String path, Object... pathParams) {
		return spec.request(method, path, pathParams);		
	}
	
	public Response request(String method, String path, Object... pathParams) {
		return spec.request(method, path, pathParams);		
	}
	
	public Response request(Method method, URI uri) {
		return spec.request(method, uri);		
	}
	
	public Response request(Method method, URL url) {
		return spec.request(method, url);		
	}
	
	public Response request(String method, URI uri) {
		return spec.request(method, uri);		
	}
	
	public Response request(String method, URL url) {
		return spec.request(method, url);		
	}
	
	public InsightlyRequestSpecification body(String body) {
		spec.body(body);			
		return this;	
	}
	
	public InsightlyRequestSpecification body(byte[] body) {
		spec.body(body);			
		return this;	
	}
	
	public InsightlyRequestSpecification body(File body) {
		spec.body(body);			
		return this;	
	}
	
	public InsightlyRequestSpecification body(InputStream body) {
		spec.body(body);			
		return this;
	}
	
	public InsightlyRequestSpecification body(Object object) {
		spec.body(object);				
		return this;
	}
	
	public InsightlyRequestSpecification body(Object object, ObjectMapper mapper) {
		spec.body(object, mapper);			
		return this;	
	}
	
	public InsightlyRequestSpecification body(Object object, ObjectMapperType mapperType) {
		spec.body(object, mapperType);		
		return this;
	}
	
	@Deprecated
	public InsightlyRequestSpecification content(String content) {
		spec.content(content);			
		return this;	
	}
	
	@Deprecated
	public InsightlyRequestSpecification content(byte[] content) {
		spec.content(content);			
		return this;	
	}
	
    /**
     * @deprecated Use {@link #body(File)} instead
     */
	@Deprecated
	public InsightlyRequestSpecification content(File content) {
		spec.content(content);			
		return this;
	}
	
	@Deprecated
	public InsightlyRequestSpecification content(InputStream content) {
		spec.content(content);			
		return this;
	}
	
	@Deprecated
	public InsightlyRequestSpecification content(Object object) {
		spec.content(object);	
		return this;
	}
	
	@Deprecated
	public InsightlyRequestSpecification content(Object object, ObjectMapperType mapperType) {
		spec.content(object, mapperType);			
		return this;
	}
	
	@Deprecated
	public InsightlyRequestSpecification content(Object object, ObjectMapper mapper) {
		spec.content(object, mapper);			
		return this;
	}
	
	public RedirectSpecification redirects() {
		return spec.redirects();			
	}
	
	public InsightlyRequestSpecification cookies(String firstCookieName, Object firstCookieValue,
			Object... cookieNameValuePairs) {
		spec.cookies(firstCookieName, firstCookieValue, cookieNameValuePairs);		
		return this;
	}
	
	public InsightlyRequestSpecification cookies(Map<String, ?> cookies) {
		spec.cookies(cookies);		
		return this;
	}
	
	public InsightlyRequestSpecification cookies(Cookies cookies) {
		spec.cookies(cookies);		
		return this;
	}
	
	public InsightlyRequestSpecification cookie(String cookieName, Object value, Object... additionalValues) {
		spec.cookie(cookieName, value, additionalValues);		
		return this;	
	}
	
	public InsightlyRequestSpecification cookie(String cookieName) {
		spec.cookie(cookieName);		
		return this;	
	}
	
	public InsightlyRequestSpecification cookie(Cookie cookie) {
		spec.cookie(cookie);	
		return this;		
	}
	
	public InsightlyRequestSpecification parameters(String firstParameterName, Object firstParameterValue,
			Object... parameterNameValuePairs) {
		spec.parameters(firstParameterName, firstParameterValue, parameterNameValuePairs);	
		return this;
	}
	
	
	@Deprecated
	public InsightlyRequestSpecification parameters(Map<String, ?> parametersMap) {
		spec.parameters(parametersMap);			
		return this;
	}
	
	public InsightlyRequestSpecification parameter(String parameterName, Object... parameterValues) {
		spec.parameter(parameterName, parameterValues);		
		return this;
	}
	
	public InsightlyRequestSpecification parameter(String parameterName, Collection<?> parameterValues) {
		spec.parameter(parameterName, parameterValues);		
		return this;	
	}
	
	public InsightlyRequestSpecification params(String firstParameterName, Object firstParameterValue,
			Object... parameterNameValuePairs) {
		spec.params(firstParameterName, firstParameterValue);		
		return this;	
	}
	
	public InsightlyRequestSpecification params(Map<String, ?> parametersMap) {
		spec.params(parametersMap);			
		return this;
	}
	
	public InsightlyRequestSpecification param(String parameterName, Object... parameterValues) {
		spec.param(parameterName, parameterValues);			
		return this;
	}
	
	public InsightlyRequestSpecification param(String parameterName, Collection<?> parameterValues) {
		spec.param(parameterName, parameterValues);			
		return this;
	}
	
	public InsightlyRequestSpecification queryParameters(String firstParameterName, Object firstParameterValue,
			Object... parameterNameValuePairs) {
		spec.queryParameters(firstParameterName, firstParameterValue, parameterNameValuePairs);		
		return this;
	}
	
	public InsightlyRequestSpecification queryParameters(Map<String, ?> parametersMap) {
		spec.queryParameters(parametersMap);		
		return this;
	}
	
	public InsightlyRequestSpecification queryParameter(String parameterName, Object... parameterValues) {
		spec.queryParameter(parameterName, parameterValues);	
		return this;		
	}
	
	public InsightlyRequestSpecification queryParameter(String parameterName, Collection<?> parameterValues) {
		spec.queryParameter(parameterName, parameterValues);		
		return this;
	}
	
	public InsightlyRequestSpecification queryParams(String firstParameterName, Object firstParameterValue,
			Object... parameterNameValuePairs) {
		spec.queryParams(firstParameterName, firstParameterValue, parameterNameValuePairs);			
		return this;
	}
	
	public InsightlyRequestSpecification queryParams(Map<String, ?> parametersMap) {
		spec.queryParams(parametersMap);		
		return this;
	}
	
	public InsightlyRequestSpecification queryParam(String parameterName, Object... parameterValues) {
		spec.queryParam(parameterName, parameterValues);		
		return this;	
	}
	
	public InsightlyRequestSpecification queryParam(String parameterName, Collection<?> parameterValues) {
		spec.queryParam(parameterName, parameterValues);		
		return this;	
	}
	
	public InsightlyRequestSpecification formParameters(String firstParameterName, Object firstParameterValue,
			Object... parameterNameValuePairs) {
		spec.formParameters(firstParameterName, firstParameterValue, parameterNameValuePairs);		
		return this;	
	}
	
	public InsightlyRequestSpecification formParameters(Map<String, ?> parametersMap) {
		spec.formParameters(parametersMap);		
		return this;	
	}
	
	public InsightlyRequestSpecification formParameter(String parameterName, Object... parameterValues) {
		spec.formParameter(parameterName, parameterValues);			
		return this;
	}
	
	public InsightlyRequestSpecification formParameter(String parameterName, Collection<?> parameterValues) {
		spec.formParameter(parameterName, parameterValues);			
		return this;
	}
	
	public InsightlyRequestSpecification formParams(String firstParameterName, Object firstParameterValue,
			Object... parameterNameValuePairs) {
		spec.formParams(firstParameterName, firstParameterValue, firstParameterValue);		
		return this;
	}
	
	public InsightlyRequestSpecification formParams(Map<String, ?> parametersMap) {
		spec.formParams(parametersMap);		
		return this;
	}
	
	public InsightlyRequestSpecification formParam(String parameterName, Object... parameterValues) {
		spec.formParam(parameterName, parameterValues);		
		return this;
	}
	
	public InsightlyRequestSpecification formParam(String parameterName, Collection<?> parameterValues) {
		spec.formParam(parameterName, parameterValues);		
		return this;
	}
	
	public InsightlyRequestSpecification pathParameter(String parameterName, Object parameterValue) {
		spec.pathParameter(parameterName, parameterValue);		
		return this;
	}
	
	public InsightlyRequestSpecification pathParameters(String firstParameterName, Object firstParameterValue,
			Object... parameterNameValuePairs) {
		spec.pathParameters(firstParameterName, firstParameterValue, parameterNameValuePairs);		
		return this;	
	}
	
	public InsightlyRequestSpecification pathParameters(Map<String, ?> parameterNameValuePairs) {
		spec.pathParameters(parameterNameValuePairs);		
		return this;
	}
	
	public InsightlyRequestSpecification pathParam(String parameterName, Object parameterValue) {
		spec.pathParam(parameterName, parameterValue);		
		return this;
	}
	
	public InsightlyRequestSpecification pathParams(String firstParameterName, Object firstParameterValue,
			Object... parameterNameValuePairs) {
		spec.pathParams(firstParameterName, firstParameterValue, firstParameterValue);		
		return this;	
	}
	
	public InsightlyRequestSpecification pathParams(Map<String, ?> parameterNameValuePairs) {
		spec.pathParams(parameterNameValuePairs);		
		return this;	
	}
	
	public InsightlyRequestSpecification config(RestAssuredConfig config) {
		spec.config(config);		
		return this;
	}
	
	public InsightlyRequestSpecification keyStore(String pathToJks, String password) {
		spec.keyStore(pathToJks, password);		
		return this;
	}
	
	public InsightlyRequestSpecification keyStore(File pathToJks, String password) {
		spec.keyStore(pathToJks, password);		
		return this;
	}
	
	public InsightlyRequestSpecification trustStore(String path, String password) {
		spec.trustStore(path, password);		
		return this;	
	}
	
	public InsightlyRequestSpecification trustStore(File path, String password) {
		spec.trustStore(path, password);	
		return this;	
	}
	
	public InsightlyRequestSpecification trustStore(KeyStore trustStore) {
		spec.trustStore(trustStore);	
		return this;
	}
	
	public InsightlyRequestSpecification keyStore(KeyStore keyStore) {
		spec.keyStore(keyStore);		
		return this;
	}
	
	public InsightlyRequestSpecification relaxedHTTPSValidation() {
		spec.relaxedHTTPSValidation();			
		return this;
	}
	
	public InsightlyRequestSpecification relaxedHTTPSValidation(String protocol) {
		spec.relaxedHTTPSValidation(protocol);		
		return this;	
	}
	
	public InsightlyRequestSpecification headers(String firstHeaderName, Object firstHeaderValue,
			Object... headerNameValuePairs) {
		spec.headers(firstHeaderName, firstHeaderValue, headerNameValuePairs);		
		return this;
	}
	
	public InsightlyRequestSpecification headers(Map<String, ?> headers) {
		spec.headers(headers);		
		return this;
	}
	
	public InsightlyRequestSpecification headers(Headers headers) {
		spec.headers(headers);		
		return this;
	}
	
	public InsightlyRequestSpecification header(String headerName, Object headerValue, Object... additionalHeaderValues) {
		spec.header(headerName, headerValue, additionalHeaderValues);
		return this;
	}
	
	public InsightlyRequestSpecification header(Header header) {
		spec.header(header);	
		return this;
	}
	
	public InsightlyRequestSpecification contentType(ContentType contentType) {
		spec.contentType(contentType);	
		return this;
	}
	
	public InsightlyRequestSpecification contentType(String contentType) {
		spec.contentType(contentType);	
		return this;
	}
	
	public InsightlyRequestSpecification accept(ContentType contentType) {
		spec.accept(contentType);	
		return this;
	}
	
	public InsightlyRequestSpecification accept(String mediaTypes) {
		spec.accept(mediaTypes);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(MultiPartSpecification multiPartSpecification) {
		spec.multiPart(multiPartSpecification);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(File file) {
		spec.multiPart(file);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, File file) {
		spec.multiPart(controlName, file);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, File file, String mimeType) {
		spec.multiPart(controlName, file, mimeType);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, Object object) {
		spec.multiPart(controlName, object);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, Object object, String mimeType) {
		spec.multiPart(controlName, object, mimeType);		
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, String filename, Object object, String mimeType) {
		spec.multiPart(controlName, filename, object, mimeType);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, String fileName, byte[] bytes) {
		spec.multiPart(controlName, fileName, bytes);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, String fileName, byte[] bytes, String mimeType) {
		spec.multiPart(controlName, fileName, bytes, mimeType);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, String fileName, InputStream stream) {
		spec.multiPart(controlName, fileName, stream);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, String fileName, InputStream stream, String mimeType) {
		spec.multiPart(controlName, fileName, stream, mimeType);
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, String contentBody) {
		spec.multiPart(controlName, contentBody);	
		return this;
	}
	
	public InsightlyRequestSpecification multiPart(String controlName, String contentBody, String mimeType) {
		spec.multiPart(controlName, contentBody, mimeType);		
		return this;
	}
	
	public AuthenticationSpecification authentication() {
		return spec.authentication();		
	}
	
	public AuthenticationSpecification auth() {
		return spec.auth();			
	}
	
	public InsightlyRequestSpecification port(int port) {
		spec.port(port);		
		return this;
	}
	
	public InsightlyRequestSpecification spec(InsightlyRequestSpecification MyRequestSpecificationToMerge) {
		spec.spec(MyRequestSpecificationToMerge);	
		return this;
	}
	
	public InsightlyRequestSpecification specification(InsightlyRequestSpecification MyRequestSpecificationToMerge) {
		spec.specification(MyRequestSpecificationToMerge);	
		return this;
	}
	
	public InsightlyRequestSpecification sessionId(String sessionIdValue) {
		spec.sessionId(sessionIdValue);		
		return this;
	}
	
	public InsightlyRequestSpecification sessionId(String sessionIdName, String sessionIdValue) {
		spec.sessionId(sessionIdName, sessionIdValue);	
		return this;
	}
	
	public InsightlyRequestSpecification urlEncodingEnabled(boolean isEnabled) {
		spec.urlEncodingEnabled(isEnabled);	
		return this;
	}
	
	public InsightlyRequestSpecification filter(Filter filter) {
		spec.filter(filter);	
		return this;
	}
	
	public InsightlyRequestSpecification filters(List<Filter> filters) {
		spec.filters(filters);	
		return this;
	}
	
	public InsightlyRequestSpecification filters(Filter filter, Filter... additionalFilter) {
		spec.filters(filter, additionalFilter);	
		return this;
	}
	
	public InsightlyRequestSpecification noFilters() {
		spec.noFilters();	
		return this;
	}
	
	public <T extends Filter> InsightlyRequestSpecification noFiltersOfType(Class<T> filterType) {
		spec.noFiltersOfType(filterType);
		return this;
	}
	
	public RequestLogSpecification log() {
		return spec.log();	
	}
	
	public ResponseSpecification response() {
		return spec.response();	
	}
	
	public InsightlyRequestSpecification and() {
		spec.and();	
		return this;
	}
	
	public InsightlyRequestSpecification with() {
		spec.with();
		return this;
	}
	
	public ResponseSpecification then() {
		return spec.then();
	}
	
	public ResponseSpecification expect() {
		return spec.expect();	
	}
	
	public InsightlyRequestSpecification when() {
		spec.when();
		return this;
	}
	
	public InsightlyRequestSpecification given() {
		spec.given();	
		return this;
	}
	
	public InsightlyRequestSpecification that() {
		spec.that();
		return this;
	}
	
	public InsightlyRequestSpecification request() {
		spec.request();	
		return this;
	}
	
	public InsightlyRequestSpecification baseUri(String baseUri) {
		spec.baseUri(baseUri);	
		return this;
	}
	
	public InsightlyRequestSpecification basePath(String basePath) {
		spec.basePath(basePath);
		return this;
	}
	
	public InsightlyRequestSpecification proxy(String host, int port) {
		spec.proxy(host, port);	
		return this;
	}
	
	public InsightlyRequestSpecification proxy(String host) {
		spec.proxy(host);	
		return this;
	}
	
	public InsightlyRequestSpecification proxy(int port) {
		spec.proxy(port);
		return this;
	}
	
	public InsightlyRequestSpecification proxy(String host, int port, String scheme) {
		spec.proxy(host, port, scheme);	
		return this;
	}
	
	public InsightlyRequestSpecification proxy(URI uri) {
		spec.proxy(uri);		
		return this;
	}
	
	public InsightlyRequestSpecification proxy(ProxySpecification proxySpecification) {
		spec.proxy(proxySpecification);
		return this;
	}

	public InsightlyRequestSpecification spec(RequestSpecification requestSpecificationToMerge) {
		spec.specification(requestSpecificationToMerge);
		return this;
	}

	public RequestSpecification specification(RequestSpecification requestSpecificationToMerge) {
		spec.specification(requestSpecificationToMerge);
		return this;
	}

	public InsightlyRequestSpecification acceptType(ContentType acceptType) {
		spec.accept(acceptType);
		return this;
	}
}

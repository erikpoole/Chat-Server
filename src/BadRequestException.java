package hwBasicHTTPServer;

public class BadRequestException extends Exception {
	public BadRequestException() {
		super("Bad Request Received");
	}
}

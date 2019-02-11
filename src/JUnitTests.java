package hwBasicHTTPServer;

import static org.junit.jupiter.api.Assertions.*;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

class JUnitTests {

	@Test
	public void test() throws NoSuchAlgorithmException {
		String testString = "dGhlIHNhbXBsZSBub25jZQ==";
		assertEquals("s3pPLMBiTxaQ9kYGzzhZRbK+xOo=", Server.calculateHash(testString));
	}

}

package jmeter;

import java.util.logging.Logger;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class JPetStoreJMeterTest implements JavaSamplerClient {
	
	private static final Logger LOGGER = Logger.getLogger("simple");
	
	public void setupTest(JavaSamplerContext context) {
		LOGGER.info("set up test");
	}
	
	public void teardownTest(JavaSamplerContext context) {
		LOGGER.info("tear down test");
	}
	
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult sampleResult = new SampleResult();
		sampleResult.sampleStart();
		
		
		sampleResult.sampleEnd();
		return sampleResult;
	}
	
	public Arguments getDefaultParameters() {
		return null;
	}

}

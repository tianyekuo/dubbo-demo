import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.knight.demo.CalService;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class TestConsumer extends AbstractJavaSamplerClient {
    private static String label = "jmeter_client";
    private String ID;
    private String URL;
    private String VERSION;
    private String SERVICE_NAME;
    private Object object;

    public TestConsumer() {
    }

    private void init() {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("jmeter_consumer");
        ReferenceConfig reference = new ReferenceConfig();
        reference.setApplication(application);
        reference.setId(this.ID);
        reference.setVersion(this.VERSION);
        reference.setInterface(this.SERVICE_NAME);
        reference.setUrl(this.URL);
        this.object = reference.get();
    }

    public void setupTest() {
        System.out.println("setupTest");
    }

    public SampleResult runTest(JavaSamplerContext arg0) {
        SampleResult sr = new SampleResult();

        try {
            this.ID = arg0.getParameter("ID");
            this.URL = arg0.getParameter("URL");
            this.VERSION = arg0.getParameter("VERSION");
            this.SERVICE_NAME = arg0.getParameter("SERVICE_NAME");
            this.init();
            sr.setSampleLabel(label);
            sr.sampleStart();
            CalService e = (CalService)this.object;
            int hello = e.add(1,2);
            sr.setResponseCode("00000");
            sr.setResponseMessage(String.valueOf(hello));
            sr.setSuccessful(true);
            sr.sampleEnd();
        } catch (Exception var5) {
            var5.printStackTrace();
            sr.setResponseCode("999");
            sr.setResponseMessage(var5.getMessage());
            sr.setSuccessful(false);
        }

        return sr;
    }

    public Arguments getDefaultParameters() {
        Arguments params = new Arguments();
        params.addArgument("ID", "");
        params.addArgument("URL", "");
        params.addArgument("VERSION", "");
        params.addArgument("SERVICE_NAME", "");
        return params;
    }

    public void teardownTest(JavaSamplerContext arg0) {
        super.teardownTest(arg0);
    }
}


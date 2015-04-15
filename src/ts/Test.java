package ts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		String xml = "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\">";
		xml+= "  <s:Body>";
		xml+= "    <SubmitSingleResponse xmlns=\"http://ThinkServer.Com/\">";
		xml+= "      <SubmitSingleResult>";
		xml+= "        <?xml version=\"1.0\" encoding=\"utf-8\"?>";
		xml+= "        <CommandResponse batchIdentity=\"f89bcfdb-ea36-4132-938f-c88f214ae887\" seq=\"0\" xmlns=\"http://thinkserver.presalesadvisor.com/userservices/BatchResponseSchema.xsd\">";
		xml+= "          <CommandResponseStatus>FailedUnkownRegion</CommandResponseStatus>";
		xml+= "          <ResponseErrorDetail>UpdateUser command requires a valid RegionId if specified</ResponseErrorDetail>";
		xml+= "        </CommandResponse>";
		xml+= "      </SubmitSingleResult>";
		xml+= "    </SubmitSingleResponse>";
		xml+= "  </s:Body>";
		xml+= "</s:Envelope>";
		
		System.out.println(xml.substring(xml.lastIndexOf("<CommandResponseStatus"), xml.lastIndexOf("</CommandResponseStatus")));
		System.out.println(xml.substring(xml.lastIndexOf("<ResponseErrorDetail"), xml.lastIndexOf("</ResponseErrorDetail")));
	}

}

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GettingIpAddress {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress myIP=InetAddress.getLocalHost();
	      System.out.println("My IP Address is:");
	      System.out.println(myIP.getHostAddress());

	}

}

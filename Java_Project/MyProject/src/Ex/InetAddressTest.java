package Ex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) {
		String urlstr = "www.naver.com";
		
		try {
			InetAddress ip = InetAddress.getByName(urlstr);
			
			System.out.println("호스트 이름은 : " + ip.getHostName());
			System.out.println("IP address : " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

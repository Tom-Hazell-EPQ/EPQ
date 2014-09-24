import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {

		try {

			DatagramSocket datagramSocket = new DatagramSocket();

			byte[] buffer = new byte[1024];
			int inter = 1;
			buffer = Integer.toString(inter).getBytes();
			InetAddress receiverAddress = InetAddress.getByName("192.168.0.9");

			DatagramPacket packet = new DatagramPacket(buffer, buffer.length,
					receiverAddress, 40506);

			datagramSocket.send(packet);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
}

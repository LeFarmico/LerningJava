package Unit13_InOutFilesDates;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Unit_13_4 {
    public static void main(String[] args) throws IOException {
        getMyIP();
        getIpByAddress("www.psu.by");
        byte ip[] = {
                (byte) 185,
                (byte) 66,
                (byte) 68,
                (byte) 85
        };
        try{
            InetAddress inetAddress = InetAddress.getByAddress(ip);
            System.out.println(inetAddress.getHostAddress() + " -> cоединение: " + inetAddress.isReachable(1000)
            + " Домен " + inetAddress.getHostName());
        }catch (UnknownHostException e){
            System.out.println("Адресс недоступенЙ! " + e);
        }catch (IOException e){
            System.out.println("Ошибка порта " + e);
        }

    }
    public static void getMyIP() throws  UnknownHostException{
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("My IP address: " + address.getHostAddress());
    }
    public static void getIpByAddress (String URL) throws UnknownHostException {
        InetAddress address = InetAddress.getByName(URL);
        System.out.println("IP address " + address.getHostName() + ": " + address.getHostAddress());
    }
}

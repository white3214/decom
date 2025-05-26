package top.tntok.autobot;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/* renamed from: top.tntok.autobot.o0o00Oo0  reason: case insensitive filesystem */
public class C0507o0o00Oo0 extends Thread {
    public static final int i1LIL11l = 18080;
    public static final int illlI1lLIL = 1000;
    public iiIliillii iiI1L1iI;

    public C0507o0o00Oo0(iiIliillii iiiliillii) {
        this.iiI1L1iI = iiiliillii;
    }

    public void run() {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(i1LIL11l);
            datagramSocket.setBroadcast(true);
            while (true) {
                DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
                datagramSocket.receive(datagramPacket);
                new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                C0387o0OOoO0o.iiI1L1iI("2k4696kMhvTjUwj2mAWO9Q==\n", "jSdcnupg75E=\n");
                String iiI1L1iI2 = C0387o0OOoO0o.iiI1L1iI("Hak=\n", "csI0b/N5hqI=\n");
                datagramSocket.send(new DatagramPacket(iiI1L1iI2.getBytes(), iiI1L1iI2.length(), datagramPacket.getAddress(), datagramPacket.getPort()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

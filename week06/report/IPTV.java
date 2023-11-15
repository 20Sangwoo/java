package reports6;
class IPTV extends ColorTV {
	   String IP;
	   IPTV(String IP, int size, int resolution) {
	      super(size, resolution);
	      this.IP = IP;
	   }
	   public void printProperty() {
	      System.out.print("나의 IPTV는 "+IP+" 주소의 ");
	      super.printProperty();
	   }
	   public static void main(String[] args) {
		   IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		   iptv.printProperty();
		}
	}

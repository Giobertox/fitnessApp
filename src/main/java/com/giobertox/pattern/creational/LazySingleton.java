package com.giobertox.pattern.creational;

public class LazySingleton {
	private static final long serialVersionUID = 1L;

	private LazySingleton() {
		// private constructor
	}

	private static class SingletonHolder {
		public static final LazySingleton INSTANCE = new LazySingleton();
	}

	public static LazySingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 * @return single instance even when using the serialization and
	 *         deserialization we override readResolve
	 */
	protected Object readResolve() {
		return getInstance();
	}
}
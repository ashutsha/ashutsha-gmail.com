package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {
	// make property as static
	public static Properties pro;
	// public static Properties pro;

	// make method as static
	public static void ConfigFileReader() {
		try {
			File src = new File("./src/main/java/properties/config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			System.out.println("Property class loaded");
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	/*
	 * protected InputStream input = null; protected Properties prop = null;
	 *
	 * public ReadConfigFile() { try { input =
	 * ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.
	 * CONFIG_PROPERTIES_DIRECTORY); prop = new Properties(); prop.load(input); }
	 * catch (IOException e) { e.printStackTrace(); }
	 */

	public String getBrowser() {
		if (pro.getProperty("browser") == null) {
			return "";
		}
		return pro.getProperty("browser");
	}
}

package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
		
		private static final Logger logger = LogManager.getLogger();
		
		public static void info(String message) {   //General Information.
			logger.info(message);
		}
		
		public static void warn(String message) {    //Warnings.
			logger.warn(message);
		}
		
		public static void error(String message) {   //Errors.
			logger.error(message);
		}
		
		public static void debug(String message) {     //Debugging details.
			logger.debug(message);
		}

}	
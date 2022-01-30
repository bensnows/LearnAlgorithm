package common.util;

public class PrintUtil {

	public static final String printArray(int[] randomArray) {
		StringBuffer sb = new StringBuffer();

		for (int num : randomArray) {
			sb.append(num + " ");
		}
		return sb.toString();
	}
}

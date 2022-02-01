package common.util;

public class PrintUtil {

	public static final void printArray(final String template, final Integer[] randomArray) {
		System.out.println(String.format(template, printArray(randomArray)));
	}

	public static final String printArray(Integer[] randomArray) {
		StringBuffer sb = new StringBuffer();

		for (int num : randomArray) {
			sb.append(num + " ");
		}
		return sb.toString();
	}
}

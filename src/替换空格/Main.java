package 替换空格;

import java.util.Scanner;

public class Main {
	public static String replaceSpace(StringBuffer str) {
        String content = str.toString();
		return content.replaceAll("\\s", "%20");
    }
	public static void main(String[] args) {
		System.out.println(replaceSpace(new StringBuffer("We are happy")));
	}
}

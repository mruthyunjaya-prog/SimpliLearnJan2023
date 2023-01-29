package mypackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileAppendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data="Hey, We are going for append option";
		Files.write(Paths.get("D://JavaPrograms//Demo.txt"), data.getBytes());
		List<String> lines=Arrays.asList("1st line","2nd line","3rd line");
		Files.write(Paths.get("D://JavaPrograms//Demo.txt"), lines,
				StandardCharsets.UTF_8,StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}

}

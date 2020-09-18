package ibm.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo2 {
	public static void copyFile(String src, String dest) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(src));
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
		char[] chs = new char[1024];
		int len;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
			bw.flush();
		}
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		String fileSrc = "E:\\school\\IBM培训\\作业\\第四天\\Demo\\CopyFileDemo1\\myfile.txt";
		String fileDes = "E:\\school\\IBM培训\\作业\\第四天\\Demo\\CopyFileDemo1\\myfile_cp.txt";
		copyFile(fileSrc, fileDes);
		System.out.println("文件复制成功");

	}

}

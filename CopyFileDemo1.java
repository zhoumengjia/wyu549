package ibm.com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//使用字节流复制文件内容

public class CopyFileDemo1 {
	public static void copyFile(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while ((c = in.read(buffer)) != -1) {
			for (int i = 0; i < c; i++)
				out.write(buffer[i]);
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		String fileSrc = "E:\\school\\IBM培训\\作业\\第四天\\Demo\\CopyFileDemo1\\myfile.txt";
		String fileDes = "E:\\school\\IBM培训\\作业\\第四天\\Demo\\CopyFileDemo1\\myfile_cp.txt";
		copyFile(fileSrc, fileDes);
		System.out.println("文件复制成功");

	}

}

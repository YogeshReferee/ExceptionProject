package Exception;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CompileTimePractice {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\YOGESH\\Desktop\\text.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.err  .print((char)(temp));
		}
	}

}
 
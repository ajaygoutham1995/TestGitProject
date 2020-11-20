import java.io.IOException;

public class CommandPromptPrograms {

	
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("cmd /c mstsc");
	}
	
}

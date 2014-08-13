package function;

import java.io.File;

public interface UploadFile {
	public String uploadFile(String email, File file, String fileName, int width, int height);
}

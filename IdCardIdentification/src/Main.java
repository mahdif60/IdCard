import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.loadLibrary( Core.NATIVE_LIBRARY_NAME );  // Loading OpenCV core library
	      
		// The following codes read an IdCard from image and saving it in a Matrix 
	      String file ="C:\\Users\\MF_PC\\git\\repository5\\IdCardIdentification\\src\\idcards\\1.jpg";
	      Mat src = Imgcodecs.imread(file);
	      System.out.print("Image loaded .......");  // write in Console if image loaded
	      
	}

}

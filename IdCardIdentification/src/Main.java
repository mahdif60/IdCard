import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.objdetect.CascadeClassifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.loadLibrary( Core.NATIVE_LIBRARY_NAME );  // Loading OpenCV core library
	      
		// The following codes read an IdCard from image and saving it in a Matrix 
		int j=1;
		for(j=1;j<5;j++){
	      String file ="C:\\Users\\MF_PC\\git\\repository5\\IdCardIdentification\\src\\idcards\\"+j+".jpg";
	      Mat src = Imgcodecs.imread(file);
	      System.out.println("Image Number:"+j);  // write "Image Loaded ..." in Console if image loaded
	      // Instantiating the CascadeClassifier for Face Detection
	      String xmlClassifier = "C:\\Users\\MF_PC\\eclipse-workspace\\OCV\\src\\fxml\\lbpcascade_frontalface.xml";
	      CascadeClassifier classifier = new CascadeClassifier(xmlClassifier);
	      
	   // Detecting the face in the snap
	      MatOfRect faceDetections = new MatOfRect();
	      classifier.detectMultiScale(src, faceDetections);
	      int i=faceDetections.toArray().length;
	      System.out.println(String.format("Number of Detected faces: %s",i));
          
	      if (i<2) {
	    	  System.out.println("This is a Fake IdCard");
	    	  System.out.println("***************************");
	      }else {
	    	  System.out.println("This is an Original IdCard");
	    	  System.out.println("***************************");
	      }
	      
	}
	}
}

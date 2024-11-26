import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.net.URL;

/**
 * Write a description of class PictureFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageReader 
{
	private static JFileChooser fileChooser = null;

	/**
	 * Read a gif file from disk and return it in Monash Image format.
	 * The file is interactively chosen by the user.
	 */
	public static short[][] getImage()
	{
		if(fileChooser == null)
			fileChooser = new JFileChooser("select a picture");

	    int returnVal = fileChooser.showOpenDialog(null);

		if(returnVal != JFileChooser.APPROVE_OPTION) 
			return null;

		String fileName = fileChooser.getSelectedFile().getPath();
		Image image = new ImageIcon(fileName).getImage();
		BufferedImage bimage = toBufferedImage(image);

		return toByteArray(bimage);		
	}


	/**
	 * Read a gif file from disk and return it in Monash image format.
     * The image is found if it is anywhere in the CLASSPATH. This includes
	 * the project directory.
	 */
	public static short[][] getImage(String fileName)
	{
		Image image;

		URL imageURL = new ImageReader().getClass().getClassLoader().getResource(fileName);
		if(imageURL == null)
			return null;

		image = new ImageIcon(imageURL).getImage();
// 		Image image = new ImageIcon(fileName).getImage();
		BufferedImage bimage = toBufferedImage(image);

		return toByteArray(bimage);		
	}


	private static BufferedImage toBufferedImage(Image image) 
	{
		// This code ensures that all the pixels in 
		// the image are loaded.
		image = new ImageIcon(image).getImage();
                            
		// Create the buffered image.
		BufferedImage bufferedImage = new BufferedImage(
			image.getWidth(null), image.getHeight(null), 
			BufferedImage.TYPE_INT_RGB);
                            
		// Copy image to buffered image.
		Graphics g = bufferedImage.createGraphics();
                           
		// Clear background and paint the image.
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(null), 	image.getHeight(null));
 		g.drawImage(image, 0, 0, null);
		g.dispose();
                          
		return bufferedImage;
	}

	private static short[][] toByteArray(BufferedImage image) 
	{
		Raster raster = image.getData();
		int width = raster.getWidth();
		int height = raster.getHeight();

		short[][] bytes = new short[height][width];

		int[] intarr = new int[3];  // rgb values
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				raster.getPixel(x ,y , intarr);
				bytes[y][x] = (short)((intarr[0] + intarr[1] + intarr[2]) / 3);
			}
		}
		return bytes;
	}

	/**
	 * Constructor for objects of class PictureFactory
	 */
	public ImageReader()
	{
	}

}

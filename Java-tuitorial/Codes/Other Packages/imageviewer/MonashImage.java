import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 * MonashImage is a class that defines greyscale images that can be manipulated
 * and represented on screen. It is implemented with a very simple image
 * format: the image data is stored in a two dimensional array of 'short' 
 * values. Every array entry may have a value in the range (0..255) (other 
 * values are illegal). Each value represents a grey scale value (0 is black,
 * 255 is white, everything inbetween is shades of grey).
 *
 * Images may be constructed from gif files (they will be automatically
 * converted to grey scale).
 * 
 * @author  mik
 * @version 0.1
 */
public class MonashImage
{
	private short[][] data;		// the actual image data
	private int width;			// width of this image
	private int height;			// height of this image


	/**
	 * Create an image from a 'gif' file. The user can choose a file interactively.
	 */
	public MonashImage()
	{
		data = ImageReader.getImage();
		updateImageSize();
	}

	/**
	 * Create an image from a 'gif' file. The file name is specified as a parameter.
	 * We will search several directories for the image file, including the project
	 * directory and an "images" directory within the project directory.
	 */
	public MonashImage(String imageFileName)
	{
		// try to find the image
		data = ImageReader.getImage(imageFileName);

		// if we didn't find it yet, look in "images" subdirectory
		if(data == null)
			data = ImageReader.getImage("images/" + imageFileName);

		// if still not found, give up
		if(data == null)
			System.out.println("Image not found: " + imageFileName);
		else
			updateImageSize();
	}

	/**
	 * Create an image with given size that is completely black.
	 */
	public MonashImage(int width, int height)
	{
		data = new short[height][width];
		this.width = width;
		this.height = height;
	}

	/**
	 * Make this image a bit darker.
	 */
	public void darker()
	{
		// go through all pixels and reduce the grey scale value by 30
		for(int y = 0; y < height; y++)
		{
			for(int x = 0; x < width; x++)
			{
				if(data[y][x] > 30)
					data[y][x] -= 30;
				else
					data[y][x] = 0;
			}
		}
	}


	//  ==== below are private helper methods used by methods above ====

    /**
     * Recompute height and width values after image data has changed.
     */
    private void updateImageSize()
    {
		height = data.length;
		if(height == 0)
			width = 0;
		else
			width = data[0].length;
    }

}

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture {
	public int[] pixels;
	private String loc;
	public final int SIZE;

    // Constructor
    public Texture(String location, int size) {
		loc = location;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}

    // Load texture from file
    private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    // Static textures
    public static Texture wood = new Texture("assets/wood.png", 64);
	public static Texture brick = new Texture("assets/brick.png", 64);
	public static Texture bluestone = new Texture("assets/bluestone.png", 64);
	public static Texture stone = new Texture("assets/greystone.png", 64);
}
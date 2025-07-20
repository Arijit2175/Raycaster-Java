import java.util.ArrayList;
import java.awt.Color;

public class Screen {
	public int[][] map;
	public int mapWidth, mapHeight, width, height;
	public ArrayList<Texture> textures;
	
	public Screen(int[][] m, int mapW, int mapH, ArrayList<Texture> tex, int w, int h) {
		map = m;
		mapWidth = mapW;
		mapHeight = mapH;
		textures = tex;
		width = w;
		height = h;
	}

    public int[] update(Camera camera, int[] pixels) {
        
    }
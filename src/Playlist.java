import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void play() {
		
	}

	public void setPlaybackSpeed(float speed) {
		for (IComponent component: playlist) {   //righthand side is collection
												 //lefthand side is datatype
			component.setPlaybackSpeed(speed);
		}
	}
	
	public String getName() {
		return playlistName;
	}
	
	public void add(IComponent component) {
		playlist.add(component);
	}
	
	public void remove(IComponent component) {
		playlist.remove(component);
	}
}

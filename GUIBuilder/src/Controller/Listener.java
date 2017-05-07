package Controller;

public interface Listener {
	public void save(String name);
	public void open(String name);
	public void makeNew();
	public void makeFile(String name);
	public void exit();
}

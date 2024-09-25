public class FileIcon implements Icon{

    private String type;
    private String image;

    public FileIcon(String type, String image) {
        this.type = type;
        this.image = image;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + type + "icon at postion " + x+ " and "+ y);
    }
}

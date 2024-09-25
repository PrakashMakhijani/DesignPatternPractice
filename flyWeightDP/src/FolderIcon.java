public class FolderIcon implements Icon{

    private String color;
    private String image;

    public FolderIcon(String color, String image) {
        this.color = color;
        this.image = image;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing Folder icon "+ color +" at position "+ x + " " +y  );
    }
}

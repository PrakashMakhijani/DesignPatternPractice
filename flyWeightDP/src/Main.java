import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        IconFactory iconFactory = new IconFactory();

        // Draw file icons at different positions
        Icon fileIcon1 = iconFactory.getIcon("file");
        fileIcon1.draw(100, 100);

        Icon fileIcon2 = iconFactory.getIcon("file");
        fileIcon2.draw(150, 150);

        // Draw folder icons at different positions
        Icon folderIcon1 = iconFactory.getIcon("folder");
        folderIcon1.draw(200, 200);

        Icon folderIcon2 = iconFactory.getIcon("folder");
        folderIcon2.draw(250, 250);



    }

    public static class IconFactory {

        private Map<String, Icon> iconCache = new HashMap<>();

        public Icon getIcon(String key) {
            // Check if the icon already exists in the cache
            if (iconCache.containsKey(key)) {
                return iconCache.get(key);
            } else {
                // Create a new icon based on the key (type of icon)
                Icon icon;
                if (key.equals("file")) {
                    icon = new FileIcon("document", "document.png");
                } else if (key.equals("folder")) {
                    icon = new FolderIcon("blue", "folder.png");
                } else {
                    throw new IllegalArgumentException("Unsupported icon type: " + key);
                }
                // Store the created icon in the cache
                iconCache.put(key, icon);
                return icon;
            }
        }


    }

    }

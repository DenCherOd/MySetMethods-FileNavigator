package fileNavigator;

public class FileData {
    private String name;
    private byte size;
    private String path;

    public FileData(String name, byte size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + "\'" +
                ", size=" + size +
                ", path='" + path + "\'" +
                "} \n";
    }
}
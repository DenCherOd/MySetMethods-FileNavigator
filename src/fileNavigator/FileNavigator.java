package fileNavigator;

import java.util.*;

public class FileNavigator {
    private HashMap<String, ArrayList<FileData>> filesByPath = new HashMap<>();

    public void add(String userPath, FileData fileData) {
//        if (!userPath.contains(fileData.getPath())) {
//            System.out.println("Pathes does not much: '" + userPath + "' and '" + fileData.getPath() + "'");
//            return;
//        }
        if (!filesByPath.containsKey(userPath)) {
            ArrayList<FileData> files = new ArrayList<>();
            files.add(fileData);
            filesByPath.put(userPath, files);
        } else {
            filesByPath.get(userPath).add(fileData);
        }
    }

    public ArrayList<FileData> find(String searchingPath) {
        return filesByPath.get(searchingPath);
    }

    public ArrayList<FileData> filterBySize(byte maxSize) {
        ArrayList<FileData> resultList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> entry : filesByPath.entrySet()) {
            for (FileData data : entry.getValue()) {
                if (data.getSize() <= maxSize) {
                    resultList.add(data);
                }
            }
        }
//        ArrayList<FileData> resultList = (ArrayList<FileData>) filesByPath.entrySet().stream().flatMap(arr -> arr.getValue().stream()
//                .filter(v -> v.getSize() <= maxSize)).collect(Collectors.toList());
        return resultList;
    }

    public void remove(String deletePath) {
        filesByPath.remove(deletePath);
    }

    public ArrayList<FileData> sortBySize() {
//        ArrayList<FileData> resultList = (ArrayList<FileData>) filesByPath.entrySet().stream().flatMap(arr -> arr.getValue().stream())
//                .collect(Collectors.toList());
        ArrayList<FileData> resultList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<FileData>> entry : filesByPath.entrySet()) {
            resultList.addAll(entry.getValue());
        }
        resultList.sort(Comparator.comparing(FileData::getSize));
        return resultList;
    }
}
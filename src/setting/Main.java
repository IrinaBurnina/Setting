package setting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        File scr = new File("E://Games/scr");
        createDir(scr);
        File res = new File("E://Games/res");
        createDir(res);
        File saveGames = new File("E://Games/saveGames");
        createDir(saveGames);
        File temp = new File("E://Games/temp");
        createDir(temp);
        File main = new File(scr, "main");
        File test = new File(scr, "test");
        createDir(main);
        createDir(test);
        File fileMain = new File(main, "Main.java");
        File fileUtils = new File(main, "Utils.java");
        createFile(fileMain);
        createFile(fileUtils);
        File drawables = new File(res, "drawables");
        File vectors = new File(res, "vectors");
        File icons = new File(res, "icons");
        createDir(drawables);
        createDir(vectors);
        createDir(icons);
        File fileTemp = new File(temp, "temp.txt");
        createFile(fileTemp);
        String ss = sb.toString();
        try (FileWriter fileWriter = new FileWriter(fileTemp, false)) {
            fileWriter.write(ss);
            fileWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void createDir(File file) {
        if (!file.exists() && file.mkdir()) {
            sb.append("Каталог " + file + " добавлен.\n");
        } else {
            sb.append("Что-то пошло не так.\n");
        }
    }

    public static void createFile(File file) {
        try {
            if (!file.exists() && file.createNewFile()) {
                sb.append("Файл " + file + " добавлен.\n");
            } else {
                sb.append("Что-то пошло не так.\n");
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage() + "  Файл не был создан. Ошибка!");
        }
    }
}

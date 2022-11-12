package com.borymskyi.patterns.bihavioral.observer;

import java.io.*;
import java.util.stream.Collectors;

/**
 * Конкретный издатель, изменение которого хотят отслеживать наблюдатели
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Editor {
    public EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager("open", "save");
    }

    public void openFile(String filePath) throws IOException {
        this.file = new File(filePath);
        eventManager.notify("open", file);

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String collect = fileReader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);
        }
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            eventManager.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

}

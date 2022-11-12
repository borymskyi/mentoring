package com.borymskyi.patterns.bihavioral.observer;

import java.io.File;

/**
 * Интерфейс подписчиков
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public interface EventListener {
    void update(String eventType, File file);
}

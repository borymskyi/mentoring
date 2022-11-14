package com.borymskyi.patterns.bihavioral.observer2;

import java.util.List;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public interface Observer {
    void handleEvent(List<String> vacanсies);
}

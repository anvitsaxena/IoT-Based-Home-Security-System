

package com.sjsu.proj.musk;

import java.util.Map;

/**
 * Model class for Firebase data entries
 */
public class HSEntry {

    Long timestamp;
    String image;
    Map<String, Float> annotations;

    public HSEntry() {
    }

    public HSEntry(Long timestamp, String image, Map<String, Float> annotations) {
        this.timestamp = timestamp;
        this.image = image;
        this.annotations = annotations;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getImage() {
        return image;
    }

    public Map<String, Float> getAnnotations() {
        return annotations;
    }
}
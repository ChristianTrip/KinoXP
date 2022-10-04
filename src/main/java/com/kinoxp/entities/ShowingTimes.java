package com.kinoxp.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public enum ShowingTimes {

    MORNING,
    NOON,
    AFTER_NOON,
    EVENING,
    NIGHT;


    private LocalDateTime startTime;

    private LocalDateTime endTime;

}

package ru.splendidpdf.event;

import lombok.Builder;
import lombok.Value;
import ru.splendidpdf.model.TaskStatus;

@Value
@Builder
public class UpdatedTaskEvent implements Event {
    String taskId;
    String resultUrl;
    TaskStatus taskStatus;
}
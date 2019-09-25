package top.weeki;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserSource {
    String OUTPUT_USER_PROJECT = "user_project";
    String OUTPUT_USER_TASK = "user_task";

    @Output(UserSource.OUTPUT_USER_PROJECT)
    MessageChannel outputUserProject();

    @Output(UserSource.OUTPUT_USER_TASK)
    MessageChannel outputUserTask();
}

package top.weeki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding({ Source.class, UserSource.class })
public class SendService {
    @Autowired
    private Source source;
    @Autowired
    private UserSource userSource;

    public void sendMsg(
        String msg) {
        source.output().send(MessageBuilder.withPayload(msg).build());
    }

    public void sendUserProjectMsg(
        String msg) {
        userSource.outputUserProject()
            .send(MessageBuilder.withPayload(msg).build());
    }

    public void sendUserTaskMsg(
        String msg) {
        userSource.outputUserTask()
            .send(MessageBuilder.withPayload(msg).build());
    }
}

package top.weeki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/producer")
public class ProducerController {

    @Autowired
    private SendService sendService;

    @GetMapping("send")
    public void send(
        @RequestParam String msg) {
        sendService.sendMsg(msg);
    }
}

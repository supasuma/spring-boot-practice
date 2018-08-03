package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);

    }



    https://www.youtube.com/watch?v=AI2oBJkPK3c&list=PLmbC-xnvykcghOSOJ1ZF6ja3aOgZAgaMO&index=19
}

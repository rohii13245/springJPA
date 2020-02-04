package com.example.daimond1.controller;


import com.example.daimond1.Topic;
import com.example.daimond1.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String sayHi() {
        return "hiii";
    }

    @Autowired
    public TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
            return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping (method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
   /* @RequestMapping("/alltopics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring","framework","describe"),
                new Topic("java","java_framework","SCJP"),
                new Topic("javaScript","Script","ocjp")

                );
    }*/

}

package com.example.demo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import static com.example.demo.Parser.readRssFeed;
@org.springframework.stereotype.Controller
//Controller class

public class AppController {
    @GetMapping(value = "/")
    public String rssForm(Model model) throws Exception {
        //read RSS Feed for ynet url
        String readFeed = readRssFeed("http://www.ynet.co.il/Integration/StoryRss2.xml");
        //method that adds an readFeed to all models defined in the controller class.
        model.addAttribute("feedParsed",readFeed);
        return "index";
    }
}

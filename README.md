# Jenkins Closing Task

![](https://miro.medium.com/max/665/1*8UiQIv0OWGSB7cn9eFWa4g.png)

## Requirements of the task:
1- Create a Java Application (Managed by Gradle or Maven) with the following features:
- Reads the“Breaking News”from YNet new service:
[http://www.ynet.co.il/Integration/StoryRss2.xml]
- When connecting to your Web App, the App parses and Presents the Breaking
News XML in an HTML Table Format.

2- Create a Jenkins CI/CD pipeline Job to Build and Deploy (Run) the application on a new
instance (the Job must send a Slack).

------------
## APP DEVELOPING
![](http://4.bp.blogspot.com/-4VKuqvU_Wgw/VoHfZm4IJ4I/AAAAAAAABZE/SU2Q20d7GAo/s1600/spring_framwork.png)

This is a Spring Boot web app (Managed by Gradle). The project consists of 3 classes :
1. DemoApplication: the main class.
2. AppController: a web controller.
3. Parser: 
- this class reads the RSS Feed from the given URL 
- parse the content into html table (As string)
- returns the html table as string by the variable parsedFeed

The project also has dirctory of resourses which includes:
1. Template of the html file (index.html).
2. Css file (main.css).

![](http://westonganger.com/system/categories/images/000/000/004/original/html-css.png?1570689942)

------------


## Run the app:
To run the application, run the following command in a terminal:
```shell
git clone https://github.com/MaryamWahbi1/Jenkins-Closing-Task.git
cd  Jenkins-Closing-Task/
./gradlew build
java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```

You can then access the app here: http://localhost:8180

[![](https://github.com/MaryamWahbi1/JenkinsHW/blob/master/htmlll.PNG?raw=true)](https://github.com/MaryamWahbi1/JenkinsHW/blob/master/htmlll.PNG?raw=true)

## Jenkins Part:
![](https://www.jenkins.io/images/logo-title-opengraph.png)

Use Jenkins to automate development workflow.

1. Git clone
2. Build
3. Run the app

[![](https://github.com/MaryamWahbi1/JenkinsHW/blob/master/pipline.PNG?raw=true)](https://github.com/MaryamWahbi1/JenkinsHW/blob/master/pipline.PNG?raw=true)

## Slack Notification :
![](https://i.ytimg.com/vi/TWwvxn2-J7E/maxresdefault.jpg)

[![https://github.com/MaryamWahbi1/Jenkins-Closing-Task/blob/master/slack.PNG?raw=true](https://github.com/MaryamWahbi1/Jenkins-Closing-Task/blob/master/slack.PNG?raw=true "https://github.com/MaryamWahbi1/Jenkins-Closing-Task/blob/master/slack.PNG?raw=true")](https://github.com/MaryamWahbi1/Jenkins-Closing-Task/blob/master/slack.PNG?raw=true "https://github.com/MaryamWahbi1/Jenkins-Closing-Task/blob/master/slack.PNG?raw=true")

package com.example.demo;
import com.rometools.rome.io.XmlReader;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import java.io.IOException;
import java.net.URL;
public class Parser {

    //A function that reads an RSS feed from a ynet URL as xml and parses it to html
    static String readRssFeed(String feedUrl) throws IOException, FeedException {
        URL feedSource = new URL(feedUrl);
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(feedSource));

        String parsedFeed = "<table>"+"<tr align=\"right\">" +"<th>כותרת</th>"
                + "<th>תיאור</th>" + "<th>תאריך</th>" + "<th>קישור</th>"+" </tr>";
        for(Object o: feed.getEntries()) {
            SyndEntry entry = (SyndEntry) o;
            parsedFeed +=
                    "<tr align=\"right\">"
                            + "<th>" + entry.getTitle() + "</th>"
                            + "<td>" + entry.getDescription().getValue() + "</td>"
                            +"<td>" + entry.getPublishedDate() + "</td>"
                            + "<td>" + "<a href=" + entry.getLink() + ">" + "לחץ לכתבה" + "</a>" + "</td>";
        }
        parsedFeed+= "</table>";
        return parsedFeed;
    }
}

package myPackage;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name; // The channel has a name
    private List<Subsciber> subscibers = new ArrayList<>(); // The channel has a list of subscribers
    private String videoTitle; // Channels upload videos which have a title

    public void setName(String channelName) { // Setting the name of the channel from Main
        name = channelName;
    }
    public String getName() { // Getting the name for user display/notification
        return name;
    }

    public void subscribeToChannel(Subsciber s) { //When a user subscribes to channel, user is added to the list of subs
        subscibers.add(s);
    }

    public void unSubscribefromChannel(Subsciber s) { // A user can also unsubscribe from the channel
        subscibers.remove(s);
    }

    public void notifySubscirbers() { // This method loops through the list of subscribers and notifies them of video
        for (Subsciber s : subscibers) { // Using an enhanced loop to go through the list and call the methods
            s.updateUser(); // call the method in subscriber object to notify the user of the uploaded video
        }
    }

    public void uploadVideo(String videoTitle) {//This method is used to enter the video title then calling another method
        this.videoTitle = videoTitle;
        this.notifySubscirbers();
    }

    public String getTitle() {
        return videoTitle;
    }
}

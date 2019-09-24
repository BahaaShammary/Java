package myPackage;

public class Subsciber {
    private String name; // Subscriber has a name
    private Channel channel; // Each subscriber subscribes to a channel

    public Subsciber(String name) { // Setting the name of the subscriber through the constructor. Can also use a setter
        this.name = name;
    }

    public void updateUser() { // This notifies the user of the video uploaded by the channel
        System.out.println("Hello " + name + ", " + channel.getName() + " has uploaded a video titled: " + channel.getTitle());
    }

    public void subscribeToChannel(Channel c) { // Update user's channel
        channel = c;
    }
}


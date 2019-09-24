package myPackage;

public class Youtube {

    public static void main(String[] args) {
        Channel myChannel = new Channel();
        myChannel.setName("Al Shammary");

        Subsciber s0 = new Subsciber("Bahaa");
        Subsciber s1 = new Subsciber("Ahmad");
        Subsciber s2 = new Subsciber("Noor");
        Subsciber s3 = new Subsciber("Katrina");

        myChannel.subscribeToChannel(s0); // Add these subscribers to the channel list of subscribers
        myChannel.subscribeToChannel(s1);
        myChannel.subscribeToChannel(s2);
        myChannel.subscribeToChannel(s3);

        s0.subscribeToChannel(myChannel); // Subscriber the user to channel object
        s1.subscribeToChannel(myChannel);
        s2.subscribeToChannel(myChannel);
        s3.subscribeToChannel(myChannel);

        myChannel.uploadVideo("Learning how to use the Observer Pattern in Java");
    }
}

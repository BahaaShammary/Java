import java.nio.file.*;
import java.util.List;

public class DirectoryWatcher {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\bahaa\\Google Drive\\Year 3\\Semester 1\\Distr. Sys. prog\\Code\\Lab 1");

        try {
            WatchService watcher = path.getFileSystem().newWatchService();
            path.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
            System.out.println("Monitoring directory for changes...");
            WatchKey watchKey;
            do {
                watchKey = watcher.take();
                List<WatchEvent<?>> events = watchKey.pollEvents();

                for (WatchEvent event : events) {
                    // check if the event refers to a new file created
                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                        //print file name which is newly created
                        System.out.println("Created: " + event.context().toString());
                    }
                    if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                        //print file name which is deleted
                        System.out.println("DELETED: " + event.context().toString());
                    }
                    if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                        //print file name which is modified
                        System.out.println("MODIFIED: " + event.context().toString());
                    }
                }

            }
            while (watchKey.reset());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

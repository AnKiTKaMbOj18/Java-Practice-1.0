package JavaInterview;

import java.io.IOException;

public class LaunchExtFiles {

    public static void main(String[] args) {

        Runtime runtime=Runtime.getRuntime();
        try {
            runtime.exec("open -a TextEdit");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

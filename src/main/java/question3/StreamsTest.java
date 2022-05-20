package question3;

import java.util.stream.Stream;

public class StreamsTest {

    public static Stream<String> processStream(Stream<User> input) {

        return input.filter(user -> user.items >= 3).map(user -> user.name);

    }
}

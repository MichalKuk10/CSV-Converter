package View;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface OutputFormatter {
    void printToConsole(List<Map<String,String>>  Data) throws IOException;
}

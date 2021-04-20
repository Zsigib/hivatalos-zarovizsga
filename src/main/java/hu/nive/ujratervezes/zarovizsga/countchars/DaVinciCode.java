package hu.nive.ujratervezes.zarovizsga.countchars;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String path, char c)
    {
        if(c != '0' && c != '1' && c != 'x')
        {
            throw new IllegalArgumentException( "Wrong character!");
        }
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(path)))
        {
            int counter = 0;
            String line;
            while ((line = bufferedReader.readLine()) !=null)
            {
                counter += countCharacters(line, c);
            }
            return counter;
        }
        catch (IOException e) {
            throw new IllegalArgumentException("Cannot find file!");
        }
     }

    private int countCharacters(String line, char c) {

        int count = 0;
        for (char a : line.toCharArray())
        {
            if (a == c)
            {
                count++;
            }
        }
        return count;
    }

}

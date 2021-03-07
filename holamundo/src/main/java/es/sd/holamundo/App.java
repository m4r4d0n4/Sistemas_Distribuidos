package es.sd.holamundo;
import com.google.common.base.Joiner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Joiner commaJoiner = Joiner.on(",");
        System.out.println( commaJoiner.join("text1","text2") );
        
    }
}

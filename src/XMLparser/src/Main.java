import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newDefaultInstance();
                    SAXParser saxParser = factory.newSAXParser();

                    StudentHandler handler = new StudentHandler();
                    saxParser.parse("Resource/Student.xml",handler);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
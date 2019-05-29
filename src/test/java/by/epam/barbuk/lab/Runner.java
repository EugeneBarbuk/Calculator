package by.epam.barbuk.lab;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Runner {
    public static void main(String[] args) throws AWTException, IOException {
        TestNG testNg = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Collections.singletonList("./src/test/resources/testng.xml"));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNg.setXmlSuites(suites);
        testNg.run();

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File("./target/screen.png"));
    }
}


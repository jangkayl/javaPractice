package WEATHERAPP;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class WeatherApp extends JFrame {
    public WeatherApp (){
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 650);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        addGuiComponents();
    }

    private void addGuiComponents(){

        // Input field
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15, 15, 351, 45);
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(searchTextField);

        // Search button
        JButton searchButton = new JButton(loadImage("./assets/search.png"));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);

        // Weather image
        JLabel weatherConditionImage = new JLabel(loadImage("./assets/cloudy.png"));
        weatherConditionImage.setBounds(0, 125, 450, 217);
        add(weatherConditionImage);
    
        // Temperature text
        JLabel temperatureText = new JLabel("10 C");
        temperatureText.setBounds(0, 350, 450, 54);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));

        // Center Text
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);
    
        // Weather description
        JLabel weatherDesc = new JLabel("Cloudy");
        weatherDesc.setBounds(0, 405, 450, 36);
        weatherDesc.setFont(new Font("Dialog", Font.PLAIN, 32));
        weatherDesc.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherDesc);

        // Humidity image
        JLabel humidityImage = new JLabel(loadImage("./assets/humidity.png"));
        humidityImage.setBounds(15, 500, 74, 66);
        add(humidityImage);

        // Humidity Text
        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90, 500, 85, 55);
        humidityText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(humidityText);

        // Windspeed image
        JLabel windspeedImage = new JLabel(loadImage("./assets/windspeed.png"));
        windspeedImage.setBounds(220, 500, 74, 66);
        add(windspeedImage);

        // Windspeed text
        JLabel windspeedText = new JLabel("<html><b>Windspeed</b> 15km</html>");
        windspeedText.setBounds(310, 500, 85, 55);
        windspeedText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(windspeedText);

        
    }

    private ImageIcon loadImage(String resourcePath){
        try {
            BufferedImage image = ImageIO.read(getClass().getResourceAsStream(resourcePath));

            return new ImageIcon(image);
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Could not find resource");
        return null;
    }
}

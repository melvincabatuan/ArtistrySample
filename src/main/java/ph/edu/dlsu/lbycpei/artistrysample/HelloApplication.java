package ph.edu.dlsu.lbycpei.artistrysample;

// Author: MKC-Cobalt
// Date created: Aug-17-2022
// Last modified: Aug-17-2022

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    private static Group root;
    private static Stage window;


    @Override
    public void start(Stage stage) {
        // 1. Setup
        window = stage; // stage is the window in JavaFX
        window.setTitle("My Artistry");
        root = new Group(); // JavaFX scene needs a root for the graphic elements
        Scene scene = new Scene(root, 640, 480); // the scene is the actual graphic to be shown

        // 2. Create the shape objects


        // 3. Add objects and show them
        addRectangles();
        addSquare();
        addCircles();
        addName();
        addPicture();

        show(scene);
    }

    private static void addPicture() {
        Image image=new Image("logo-dlsu.jpg");
        ImageView imageView=new ImageView(image);
        imageView.setFitWidth(80);
        imageView.setPreserveRatio(true);
        imageView.setX(310);
        imageView.setY(110);
        add(imageView);
    }

    private void addName() {
        /*
        Constructor and Description
        Label()
            Creates an empty label
        Label(String text)
            Creates Label with supplied text.
        Label(String text, Node graphic)
            Creates a Label with the supplied text and graphic.
        Documentation: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Label.html
         */
        // Create your name
        Label text = new Label("by Firstname Surname");
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 24));
        text.setTextFill(Color.CHOCOLATE);
        text.setLayoutX(180);
        text.setLayoutY(400);
        add(text);
    }

    private static void addSquare() {
        /*
        Constructor and Description:
            Rectangle()
                Creates an empty instance of Rectangle.
            Rectangle(double width, double height)
                Creates a new instance of Rectangle with the given size.
            Rectangle(double x, double y, double width, double height)
                Creates a new instance of Rectangle with the given position and size.
            Rectangle(double width, double height, Paint fill)
                Creates a new instance of Rectangle with the given size and fill.
        Documentation: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Rectangle.html
         */
        Rectangle rectangle = new Rectangle(100, 100);
        rectangle.setX(300);
        rectangle.setY(100);
        rectangle.setFill(Color.WHITE);
        rectangle.setStrokeWidth(4);
        rectangle.setStroke(Color.BLACK);

        add(rectangle);
    }

    private static void addRectangles() {
        // Add Rectangle Objects
        for (int i = 0; i < 20; i++) {
            int dx = 10 * i;
            int dy = 10 * i;
            Rectangle rect = new Rectangle(300 + dx, 100 + dy, 100, 100);
            rect.setFill(Color.BLUE);
            add(rect);
        }
        // Add More Rectangle Objects
        for (int i = 0; i < 20; i++) {
            int dx = 10 * i;
            int dy = 10 * i;
            Rectangle rect = new Rectangle(300 - dx, 100 + dy, 100, 100);
            rect.setFill(Color.RED);
            add(rect);
        }

    }

    public static void addCircles(){
        /*
        Constructor and Description:
            Circle()
                Creates an empty instance of Circle.
            Circle(double radius)
                Creates a new instance of Circle with a specified radius.
            Circle(double centerX, double centerY, double radius)
                Creates a new instance of Circle with a specified position and radius.
            Circle(double centerX, double centerY, double radius, Paint fill)
                Creates a new instance of Circle with a specified position, radius and fill.
            Circle(double radius, Paint fill)
                Creates a new instance of Circle with a specified radius and fill.
        Documentation: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Circle.html
         */
        for (int i = 1; i <= 12; i++) {
            int dx = 50*i;
            int offset = 5;
            Circle circle = new Circle(dx - offset, 40, 40);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.GREEN);
            add(circle);
        }
    }

    /**
     * Adds the object to the group
     *
     * @param node object to be added
     */
    public static void add(Node node) {
        root.getChildren().add(node);
    }

    /**
     * Sets the scene and shows it
     *
     * @param scene to be shown
     */
    public static void show(Scene scene) {
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
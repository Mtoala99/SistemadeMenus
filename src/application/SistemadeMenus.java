package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SistemadeMenus extends Application{

    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");

        MenuItem nuevoArchivo = new MenuItem("Nuevo");
        MenuItem abrirArchivo = new MenuItem("Abrir");
        MenuItem guardarArchivo = new MenuItem("Guardar");
        MenuItem salirArchivo = new MenuItem("Salir");

        nuevoArchivo.setOnAction(e -> System.out.println("Nuevo archivo creado."));
        abrirArchivo.setOnAction(e -> System.out.println("Archivo abierto."));
        guardarArchivo.setOnAction(e -> System.out.println("Archivo guardado."));
        salirArchivo.setOnAction(e -> {
            System.out.println("Saliendo de la aplicación.");
            primaryStage.close();
        });

        menuArchivo.getItems().addAll(nuevoArchivo, abrirArchivo, guardarArchivo, new SeparatorMenuItem(), salirArchivo);
        MenuItem cortar = new MenuItem("Cortar");
        MenuItem copiar = new MenuItem("Copiar");
        MenuItem pegar = new MenuItem("Pegar");
        
        cortar.setOnAction(e -> System.out.println("Texto cortado."));
        copiar.setOnAction(e -> System.out.println("Texto copiado."));
        pegar.setOnAction(e -> System.out.println("Texto pegado."));

        menuEditar.getItems().addAll(cortar, copiar, pegar);

        MenuItem acercaDe = new MenuItem("Acerca de");

        acercaDe.setOnAction(e -> System.out.println("Sistema de menús en JavaFX."));

        menuAyuda.getItems().add(acercaDe);

        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        Scene scene = new Scene(root, 300, 400);

        primaryStage.setTitle("Sistemas de Menus JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

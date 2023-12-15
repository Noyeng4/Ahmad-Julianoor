package praktikum6.prak601_2210817310018_ahmadjulianoor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Ahmad Julianoor");
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("NIM");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("NAMA");
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nim"));

        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);

        tabel.getItems().add(new Mahasiswa(1, "Ahmad Julianoor", "2210817310001"));
        tabel.getItems().add(new Mahasiswa(2, "Ahmad", "2210817310002"));
        tabel.getItems().add(new Mahasiswa(3, "Julianoor", "2210817310003"));
        tabel.getItems().add(new Mahasiswa(4, "Muhammad Agustianoor", "2210817310004"));
        tabel.getItems().add(new Mahasiswa(5, "Muhammad", "2210817310005"));
        tabel.getItems().add(new Mahasiswa(6, "Agustianoor", "2210817310006"));
        tabel.getItems().add(new Mahasiswa(7, "Fadlianoor", "2210817310007"));
        tabel.getItems().add(new Mahasiswa(8, "Zidyah Ahadiyah", "2210817310008"));
        tabel.getItems().add(new Mahasiswa(9, "Zidyah", "2210817310009"));
        tabel.getItems().add(new Mahasiswa(10, "Ahadiyah", "2210817310010"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
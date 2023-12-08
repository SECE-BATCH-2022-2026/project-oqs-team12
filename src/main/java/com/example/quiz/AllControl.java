package com.example.quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class AllControl {
    public Button signup;
    public Button login;
    public Button profile;
    public Button logout;
    public Button signin;
    public Button join;
    public Button next;
    public Button submit;
    public Button finish;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) signup.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onLoginButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home1.fxml"));
            Parent Loginroot = fxmlLoader.load();
            Stage stage = (Stage) login.getScene().getWindow();
            stage.setScene(new Scene(Loginroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onProButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profile.fxml"));
            Parent Proroot = fxmlLoader.load();
            Stage stage = (Stage) profile.getScene().getWindow();
            stage.setScene(new Scene(Proroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onLogButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent Logroot = fxmlLoader.load();
            Stage stage = (Stage) logout.getScene().getWindow();
            stage.setScene(new Scene(Logroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onRegButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home1.fxml"));
            Parent Regroot = fxmlLoader.load();
            Stage stage = (Stage) signin.getScene().getWindow();
            stage.setScene(new Scene(Regroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onJoinButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz.fxml"));
            Parent Joinroot = fxmlLoader.load();
            Stage stage = (Stage) join.getScene().getWindow();
            stage.setScene(new Scene(Joinroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onQuizButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz1.fxml"));
            Parent Joinroot = fxmlLoader.load();
            Stage stage = (Stage) next.getScene().getWindow();
            stage.setScene(new Scene(Joinroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onQuiz1ButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz2.fxml"));
            Parent Joinroot = fxmlLoader.load();
            Stage stage = (Stage) next.getScene().getWindow();
            stage.setScene(new Scene(Joinroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onQuiz2ButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz3.fxml"));
            Parent Joinroot = fxmlLoader.load();
            Stage stage = (Stage) next.getScene().getWindow();
            stage.setScene(new Scene(Joinroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onQuiz3ButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz4.fxml"));
            Parent Joinroot = fxmlLoader.load();
            Stage stage = (Stage) next.getScene().getWindow();
            stage.setScene(new Scene(Joinroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onQuiz4ButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
            Parent Joinroot = fxmlLoader.load();
            Stage stage = (Stage) submit.getScene().getWindow();
            stage.setScene(new Scene(Joinroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onSubButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home1.fxml"));
            Parent Joinroot = fxmlLoader.load();
            Stage stage = (Stage) finish.getScene().getWindow();
            stage.setScene(new Scene(Joinroot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

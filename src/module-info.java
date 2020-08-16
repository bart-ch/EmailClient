/**
 * Created by "Bartosz Chodyla" on 2020-08-13.
 */module JavaFxEmailClient {
     requires javafx.fxml;
     requires javafx.controls;
     requires javafx.graphics;
     requires javafx.web;

     opens barosanu;
     opens barosanu.view;
     opens barosanu.controller;
}
package com.jallen.blue.milk.controller;

import com.jallen.blue.milk.config.AppConfig;
import com.jallen.blue.milk.entity.User;
import com.jallen.blue.milk.service.UserService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jallen.blue.milk.service.UserService;
import com.jallen.blue.milk.dao.UserDao;

import java.sql.Date;
import java.sql.SQLException;

public class UserController {

    @FXML
    private TextField firstNameText;
    @FXML
    private TextField lastNameText;
    @FXML
    private TextField emailText;
    @FXML
    private TextArea resultText;

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    private UserService userService = context.getBean(UserService.class);

    //Insert User to the DB
    @FXML
    private void insertUser (ActionEvent actionEvent) {
        userService.save(new User(firstNameText.getText(), lastNameText.getText(), emailText.getText()));
        resultText.setText("Employee inserted! \n");
    }
}

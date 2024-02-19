package com.example.documentcreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.docx4j.openpackaging.exceptions.Docx4JException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;

public class MainWindowController {
    @FXML
    private TextField apartmentField;

    @FXML
    private TextField birthdateField;

    @FXML
    private TextField birthplaceField;

    @FXML
    private TextField buildingField;

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonRun;

    @FXML
    private TextField cityField;

    @FXML
    private TextField codewordField;

    @FXML
    private TextField costField;

    @FXML
    private TextField costFullField;

    @FXML
    private TextField countryPassportExpiryDateField;

    @FXML
    private TextField countryPassportField;

    @FXML
    private TextField countryPassportGivenDateField;

    @FXML
    private TextField countryPassportGivenPlaceField;

    @FXML
    private TextField dealCreationDateField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField familyStatusField;

    @FXML
    private TextField firstnameField;

    @FXML
    private TextField firstnameLatinField;

    @FXML
    private TextField fullAddressField;

    @FXML
    private TextField houseField;

    @FXML
    private TextField housingField;

    @FXML
    private TextField individualCodeField;

    @FXML
    private TextField lastnameField;

    @FXML
    private TextField lastnameLatinField;

    @FXML
    private TextField passportCodeField;

    @FXML
    private TextField passportGivenDateField;

    @FXML
    private TextField passportGivenPlaceField;

    @FXML
    private TextField passportNumField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private TextField sexField;

    @FXML
    private TextField streetField;

    @FXML
    private TextField surnameField;

    @FXML
    private TextField workjobField;

    @FXML
    private TextField workplaceField;

    @FXML
    private TextField worksphereField;

    @FXML
    void clearFields(ActionEvent event) {
        for (Node node : ((Node)event.getSource()).getScene().getRoot().lookupAll(".text-field"))
        {
            if (node instanceof TextField)
                ((TextField)node).clear();
        }
    }

    @FXML
    void createDocuments(ActionEvent event) {
        Map<String, String> personalData = new ConcurrentHashMap<>();
        personalData.put("{PASSPORTNUM}", passportNumField.getText());
        personalData.put("{PASSPORTSERIE}", (passportNumField.getText().length()==11) ? passportNumField.getText().substring(0,4) : "");
        personalData.put("{PASSPORTNOMER}", (passportNumField.getText().length()==11) ? passportNumField.getText().substring(5,11) : "" );
        personalData.put("{LASTNAME}", lastnameField.getText());
        personalData.put("{FIRSTNAME}",firstnameField.getText());
        personalData.put("{FNAME1SYM.}", !firstnameField.getText().isBlank()  ? (firstnameField.getText().charAt(0) +".") : "");
        personalData.put("{SURNAME}", surnameField.getText());
        personalData.put("{SNAME1SYM.}", !surnameField.getText().isBlank() ? (surnameField.getText().charAt(0) +".") : "");
        personalData.put("{SEX}", sexField.getText());

        personalData.put("{BIRTHDATE}", birthdateField.getText());
        personalData.put("{BDAY}", (birthdateField.getText().length()==10) ? birthdateField.getText().substring(0,2) : "");
        personalData.put("{BMONTH}", (birthdateField.getText().length()==10) ?
                DocumentUtils.getMonthName(birthdateField.getText().substring(3,5)): "");
        personalData.put("{BYEAR}", (birthdateField.getText().length()==10) ? birthdateField.getText().substring(6,10) : "");
        personalData.put("{BPLACE}", birthplaceField.getText());

        personalData.put("{PASSPORTGIVENPLACE}", passportGivenPlaceField.getText());
        personalData.put("{PASSPORTGIVENDATE}", passportGivenDateField.getText());
        personalData.put("{PGIVENDAY}", (passportGivenDateField.getText().length()==10) ? passportGivenDateField.getText().substring(0,2) : "");
        personalData.put("{PGIVENMONTH}", (passportGivenDateField.getText().length()==10) ? DocumentUtils.getMonthName(passportGivenDateField.getText().substring(3,5)) : "");
        personalData.put("{PGIVENYEAR}", (passportGivenDateField.getText().length()==10) ? passportGivenDateField.getText().substring(6,10) : "");
        personalData.put("{PASSPORTCODE}", passportCodeField.getText());

        personalData.put("{CITYNAME}", cityField.getText());
        personalData.put("{STREETNAME}", streetField.getText());
        personalData.put("{HOUSENUM}", houseField.getText());
        personalData.put("{BUILDINGNUM}", buildingField.getText());
        personalData.put("{HOUSINGNUM}", housingField.getText());
        personalData.put("{APARTMENTNUM}", apartmentField.getText());
        personalData.put("{FULLADDRESS}", fullAddressField.getText());
        personalData.put("{POSTALCODE}", postalCodeField.getText());

        personalData.put("{COUNTRYPASSNUM}", countryPassportField.getText());
        personalData.put("{LASTLATINNAME}", lastnameLatinField.getText());
        personalData.put("{FIRSTLATINNAME}", firstnameLatinField.getText());
        personalData.put("{COUNTRYPASSGIVENPLACE}", countryPassportGivenPlaceField.getText());
        personalData.put("{COUNTRYPASSGIVENDATE}", countryPassportGivenDateField.getText());
        personalData.put("{COUNTRYPASSGIVENDAY}", (countryPassportGivenDateField.getText().length()==10) ? countryPassportGivenDateField.getText().substring(0,2): "");
        personalData.put("{COUNTRYPASSGIVENMONTH}", (countryPassportGivenDateField.getText().length()==10) ? DocumentUtils.getMonthName(countryPassportGivenDateField.getText().substring(3,5)): "");
        personalData.put("{COUNTRYPASSGIVENYEAR}", (countryPassportGivenDateField.getText().length()==10) ? countryPassportGivenDateField.getText().substring(6,10) : "");
        personalData.put("{COUNTRYPASSEXPIRYDATE}", countryPassportExpiryDateField.getText());
        personalData.put("{COUNTRYPASSEXPIRYDAY}", (countryPassportExpiryDateField.getText().length()==10) ? countryPassportExpiryDateField.getText().substring(0,2) : "");
        personalData.put("{COUNTRYPASSEXPIRYMONTH}", (countryPassportExpiryDateField.getText().length()==10) ? DocumentUtils.getMonthName(countryPassportExpiryDateField.getText().substring(3,5)): "");
        personalData.put("{COUNTRYPASSEXPIRYYEAR}", (countryPassportExpiryDateField.getText().length()==10) ? countryPassportExpiryDateField.getText().substring(6,10) : "");

        personalData.put("{INDIVIDUALNUM}", individualCodeField.getText());
        personalData.put("{WORKPLACE}", workplaceField.getText());
        personalData.put("{WORKJOB}", workjobField.getText());
        personalData.put("{JOBSPHERE}", worksphereField.getText());
        personalData.put("{CODEWORD}", codewordField.getText());
        personalData.put("{PHONENUM}", phoneField.getText());
        personalData.put("{FAMILYSTATUS}", familyStatusField.getText());
        personalData.put("{EMAIL}", emailField.getText());

        personalData.put("{DEALCREATIONDATE}", dealCreationDateField.getText());
        personalData.put("{DEALCREATIONDAY}", (dealCreationDateField.getText().length()==10) ? dealCreationDateField.getText().substring(0,2) : "");
        personalData.put("{DEALCREATIONMONTH}", (dealCreationDateField.getText().length()==10) ? DocumentUtils.getMonthName(dealCreationDateField.getText().substring(3,5)) : "");
        personalData.put("{DEALCREATIONYEAR}", (dealCreationDateField.getText().length()==10) ? dealCreationDateField.getText().substring(6,10) : "");
        personalData.put("{SUMNUM}", costField.getText());
        personalData.put("{SUMFULL}", costFullField.getText());

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Future<Void>> futureList = Collections.synchronizedList(new ArrayList<>());
        for (int i=1;;i++) {
            final int index = i;
            File f = new File("template" + i + ".docx");

            if (f.exists())
            {
                Callable<Void> task = ()-> DocumentUtils.parseDoc(personalData, Paths.get("template" + index + ".docx"));
                futureList.add(executorService.submit(task));
            }
            else
                break;
        }
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException ex) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
        for (Future future : futureList)
        {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException | CancellationException e) {
                Throwable info = e.getCause();
                if (info instanceof IOException)
                {
                    Alert alert = new Alert(Alert.AlertType.ERROR);

                    alert.setTitle("Ошибка");
                    alert.setContentText("Произошла ошибка ввода-вывода: " + info);

                    alert.showAndWait();
                }
                else if (info instanceof Docx4JException)
                {
                    Alert alert = new Alert(Alert.AlertType.ERROR);

                    alert.setTitle("Ошибка");
                    alert.setHeaderText(null);
                    alert.setContentText(info.toString());

                    alert.showAndWait();
                }
                else
                {
                    Alert alert = new Alert(Alert.AlertType.ERROR);

                    alert.setTitle("Ошибка");
                    alert.setHeaderText(null);
                    alert.setContentText("Произошла необрабатываемая ошибка:" + info);

                    alert.showAndWait();
                }
            }
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Работа выполнена!");
        alert.setHeaderText("Работа выполнена");
        alert.setContentText("Обязательно проверьте документ(ы)!");
        alert.showAndWait();
    }
}
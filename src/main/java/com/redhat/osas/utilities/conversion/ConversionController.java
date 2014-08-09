package com.redhat.osas.utilities.conversion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.apache.commons.lang3.StringEscapeUtils;


public class ConversionController {
    @FXML
    private TextArea toConvert;
    @FXML
    private TextArea converted;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        converted.setText(StringEscapeUtils.unescapeHtml4(toConvert.getText()));
    }
}

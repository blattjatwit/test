package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;


public class Controller {
    int counter;
    int right;
    @FXML
    Label labela;
    @FXML
    Label labelb;
    @FXML
    Label labeld;
    @FXML
    Label labelc;
    @FXML
    Label labelq;
    int[] questionum = {3,2,1,3,1,4,1,2,4,3};
    answerA a = new answerA();
    AnswerB b = new AnswerB();
    AnswerC c = new AnswerC();
    AnswerD d = new AnswerD();
    questions q = new questions();
    public void buttona(javafx.event.ActionEvent event) {
        if (counter == 0){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 1){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 2){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 3){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            right++;
            counter++;
        }
        else if (counter == 4){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 5){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
            right++;
        }
        else if (counter == 6){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 7){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
            right++;
        }
        else if (counter == 8){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 9){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 10){
            counter++;
        }
        else if (counter == 11) {
            right++;
            labela.setText(" ");
            labelb.setText(" ");
            labelc.setText(" ");
            labeld.setText(" ");
            labelq.setText("you got " + right + "right and " + (10 - right) + " wrong");
        }
    }
    public void buttonb(javafx.event.ActionEvent event) {
        if (counter == 0){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 1){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 2){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
            right++;
        }
        else if (counter == 3){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 4){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 5){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 6){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 7){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 8){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
            right++;
        }
        else if (counter == 9){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 10){
           counter++;
        }
        else if (counter == 11) {
            right++;
            labela.setText(" ");
            labelb.setText(" ");
            labelc.setText(" ");
            labeld.setText(" ");
            labelq.setText("you got " + right + "right and " + (10 - right) + " wrong");
        }
    }
    public void buttonc(javafx.event.ActionEvent event) {
        if (counter == 0){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 1){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
            right++;
        }
        else if (counter == 2){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 3){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 4){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            right++;
            counter++;
        }
        else if (counter == 5){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 6){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 7){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 8){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 9){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));

            counter++;
        }
        else if (counter == 10) {
            right++;
            counter++;
        }
            else if (counter == 11) {
                right++;
                labela.setText(" ");
                labelb.setText(" ");
                labelc.setText(" ");
                labeld.setText(" ");
                labelq.setText("you got " + right + "right and " + (10 - right) + " wrong");
            }

    }
    public void buttond(javafx.event.ActionEvent event) {
        if (counter == 0){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 1){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 2){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 3){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 4){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 5){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
            right++;
        }
        else if (counter == 6){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 7){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
        }
        else if (counter == 8){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;
            right++;
        }
        else if (counter == 9){
            labela.setText(a.answers(counter));
            labelb.setText(b.answers(counter));
            labelc.setText(c.answers(counter));
            labeld.setText(d.answers(counter));
            labelq.setText(q.question(counter));
            counter++;

        }
        else if (counter == 10){
            right++;
            labela.setText(" ");
            labelb.setText(" ");
            labelc.setText(" ");
            labeld.setText(" ");
            labelq.setText("you got " + right + "right and " + (10-right) + " wrong");
        }
    }

}

package case_study.view;

import case_study.controller.FuramaController;

import java.io.IOException;

public class View {
    public static void main(String[] args) {
        try {
            FuramaController.display();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

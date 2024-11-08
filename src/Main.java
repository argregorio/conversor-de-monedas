import com.conversor.models.ConsultAPI;
import com.conversor.models.Country;
import com.conversor.models.CurrencyPairConversion;
import com.conversor.models.Menu;
import com.conversor.models.utils.Validator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AppHandler app = new AppHandler();
        String options = app.getMenuItems();
        Scanner userInput = app.getInput();

        try {
            System.out.println("Bienvenid@ al conversor de monedas");
            while (app.getOption() != 7) {
                System.out.println(options);
                System.out.println("Selecciona una opción valida: ");
                app.setOption(userInput.nextInt());
                switch (app.getOption()) {
                    case 1:
                        app.firstOption();
                        break;
                    case 2:
                        app.secondOption();
                        break;
                    case 3:
                        app.thirdOption();
                        break;
                    case 4:
                        app.fourthOption();
                        break;
                    case 5:
                        app.fiveOption();
                        break;
                    case 7:
                        app.appFinalMessage();
                        break;
                    default:
                        System.out.println("Opcion invalida, intenta ingresando alguna que figure en el menu");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
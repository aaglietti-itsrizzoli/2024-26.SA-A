package it.poma.es1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value = "/{operazione}")
    public String calcola(
            @PathVariable String operazione,
            @RequestParam(required=false) Integer num1,
            @RequestParam(required=false) Integer num2,
            Model model) {

        double res = 0;
        model.addAttribute("messaggio", "Operazione selezionata con successo!");

        try {
            res = operazione(operazione, num1, num2);
        } catch (IllegalArgumentException e) {
            model.addAttribute("messaggio", "Non hai selezionato un operazione!");
        }


        model.addAttribute("operazione", operazione.toUpperCase());
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        if (operazione.equals("somma")) {
            model.addAttribute("risultato", 3);
        } else {
                        model.addAttribute("risultato", res);

        }

        return "index";
    }

    public static double operazione(String operazione, Integer num1, Integer num2) throws IllegalArgumentException {
        double res = 0;
        switch (operazione) {
            case "somma":
                operazione = "somma"; // per non visualizzare un testo sbagliato nell'HTML
                res = num1 + num2;
                break;
            case "sottrazione":
                res = num1 - num2;
                break;
            case "moltiplicazione":
                res = num1 * num2;
                break;
            case "divisione":
                res = (double) num1 / num2;
                break;
            case "potenza":
                res = Math.pow(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("operazione non supportata");
        }
        
        return res;
    }
}

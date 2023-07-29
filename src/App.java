import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World desde #LaOficinaDePalito si señor esta vez
        // en vivo por twitch!!!!");

        Object[] options = { "Convertir Divisas", "Convertir Temoeratura", "Salir" };
        int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        } else if (elige == 1) {
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String[] opciones = { "Celcius a Fhahrenheit", "Fhahrenheit a Celcius" };

                int opcion = JOptionPane.showOptionDialog(null, "Elija una Opcion: ", "Conversor de Temperatura",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese La Temperatura a Convertir");

                double valor = 0.00;

                try {
                    valor = Double.parseDouble(valorNominal);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor No valido!");
                    System.exit(0);
                }

                double resultado = 0;

                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null, valor + "El Resultado es  " + resultado + "  °F.");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null, valor + " El Resultado Es  " + resultado + "  °C");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar el Programa?", "",
                        JOptionPane.YES_NO_OPTION);

                if (continuar == JOptionPane.NO_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finaizado");
                }
                ;
            }
            ;
        } else if (elige == 0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Pesos a Euros", "Pesos a Dolares", "Pesos a Libras Esterlinas", "Pesos a Yen",
                        "Pesos a Won" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Forma de Convercion:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese la Cantidad de Pesos: ");
                double pesos = 0.00;

                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no Valido");
                }

                if (cambio.equals("Pesos a Euros")) {
                    double euros = pesos / 4388.04;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos Colombianos son: " + formatearDivisa.format(euros) + " Euros. ");
                } else if (cambio.equals("Pesos a Dolares")) {
                    double dolares = pesos / 3949.19;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos Colombianos son: " + formatearDivisa.format(dolares) + " Dolares. ");
                } else if (cambio.equals("Pesos a Libras Esterlinas")) {
                    double libras = pesos / 5121.72;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos Colombianos son: " + formatearDivisa.format(libras)
                                    + " Libras Esterlinas. ");
                } else if (cambio.equals("Pesos a Yen")) {
                    double yen = pesos / 28.19;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos Colombianos son: " + formatearDivisa.format(yen) + " Yen. ");
                } else {
                    double won = pesos / 3.09;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos Colombianos son: " + formatearDivisa.format(won) + " Won.");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar el Programa?", "Conformar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finaizado");
                }
            }

        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Usuario
 */
public class ValidarTarjeta {
    private static boolean validarNumeroTarjeta(String numeroTarjeta) {
        int sum = 0;
        boolean alternate = false;
        for (int i = numeroTarjeta.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(numeroTarjeta.substring(i, i + 1));
            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit = (digit % 10) + 1;
                }
            }
            sum += digit;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
    
    private static boolean validarCCV(String ccv) {
        return ccv.matches("\\d{3}");
    }
    
    public static boolean validarTarjeta(String numeroTarjeta, String ccv) {
        if (!validarNumeroTarjeta(numeroTarjeta)) {
            return false;
        }
        if (!validarCCV(ccv)) {
            return false;
        }
        return true;
    }
}


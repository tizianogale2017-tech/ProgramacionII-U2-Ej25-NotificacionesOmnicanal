package Ejercicio25_notificacionesOmnicanal;

public class NotificadorSMS implements CanalNotificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        if (!destinatario.matches("\\d{10,13}")) {
            System.out.println("[SMS] Número inválido: " + destinatario);
            return;
        }
        if (mensaje.length() > 160) {
            System.out.println("[SMS] El mensaje supera los 160 caracteres.");
            return;
        }
        System.out.println("[SMS] Al " + destinatario + ": " + mensaje);
    }
}

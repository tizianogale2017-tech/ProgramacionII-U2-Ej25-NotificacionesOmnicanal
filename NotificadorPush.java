package Ejercicio25_notificacionesOmnicanal;

public class NotificadorPush implements CanalNotificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        if (destinatario.isEmpty()) {
            System.out.println("[Push] Token de dispositivo vacío.");
            return;
        }
        System.out.println("[Push] Dispositivo " + destinatario + ": " + mensaje);
    }
}

package Ejercicio25_notificacionesOmnicanal;

public class NotificadorEmail implements CanalNotificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        if (!destinatario.contains("@")) {
            System.out.println("[Email] Dirección inválida: " + destinatario);
            return;
        }
        System.out.println("[Email] Para " + destinatario + ": " + mensaje);
    }
}

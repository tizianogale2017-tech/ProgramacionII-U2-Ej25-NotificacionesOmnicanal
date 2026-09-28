package Ejercicio25_notificacionesOmnicanal;

public class Main {
    public static void main(String[] args) {
        GestorAlertas gestor = new GestorAlertas();
        gestor.agregarCanal(new NotificadorEmail(), "gerencia@empresa.com");
        gestor.agregarCanal(new NotificadorSMS(), "5491155667788");
        gestor.agregarCanal(new NotificadorPush(), "device-token-4f9a");

        System.out.println("--- Difusión masiva ---");
        gestor.difundirATodos("Mantenimiento programado esta noche a las 23:00.");

        System.out.println("--- Envío selectivo (solo SMS) ---");
        gestor.enviarPorCanal(1, "Recordatorio: reunión mañana 9:00.");
    }
}

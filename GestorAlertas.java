package Ejercicio25_notificacionesOmnicanal;

import java.util.ArrayList;
import java.util.List;

public class GestorAlertas {
    private List<CanalNotificacion> canales = new ArrayList<>();
    private List<String> destinatarios = new ArrayList<>();

    public void agregarCanal(CanalNotificacion canal, String destinatario) {
        canales.add(canal);
        destinatarios.add(destinatario);
    }

    public void difundirATodos(String mensaje) {
        for (int i = 0; i < canales.size(); i++) {
            canales.get(i).enviar(destinatarios.get(i), mensaje);
        }
    }

    public void enviarPorCanal(int indice, String mensaje) {
        if (indice < 0 || indice >= canales.size()) {
            System.out.println("Canal inexistente: " + indice);
            return;
        }
        canales.get(indice).enviar(destinatarios.get(indice), mensaje);
    }
}

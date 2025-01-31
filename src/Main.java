import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class Main{
    public static void main(String[] args) {
        // Création d'un pool de threads de taille 4
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Liste pour stocker les tâches
        List<Callable<String>> taches = new ArrayList<>();

        // Ajout de plusieurs tâches au pool
        for (int i = 1; i <= 4; i++) {
            int numeroTache = i;
            Callable<String> tache = () -> {
                // Simulation d'un traitement
                Thread.sleep(2000); // Pause de 2 secondes
                return "Résultat de la tâche " + numeroTache;
            };
            taches.add(tache);
        }

        try {
            // Exécution des tâches simultanément
            List<Future<String>> resultats = executorService.invokeAll(taches);

            // Récupération et affichage des résultats
            for (Future<String> future : resultats) {
                System.out.println(future.get());
            }
        } catch (Exception ignored) {
            // Pas de gestion des exceptions dans cet exemple
        } finally {
            // Fermeture de l'ExecutorService
            executorService.shutdown();
        }
    }
}

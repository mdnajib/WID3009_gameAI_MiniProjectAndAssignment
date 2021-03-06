package pacman.entries.pacman.wiba.ga;

public abstract class GAExecutor
{

    public static void main(String[] args)
    {
        int numberOfThreads = Runtime.getRuntime().availableProcessors();

        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(numberOfThreads, "");
        geneticAlgorithm.startEvolution();

        System.out.println(geneticAlgorithm.getChampion().toString());
    }
}

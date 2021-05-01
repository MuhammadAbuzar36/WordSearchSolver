/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearchsolver;

/**
 *
 * @author abuza
 */
public class WordSearchSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] grid = {
            {'v', 'n', 'y', 'b', 'k', 'g', 's'},
            {'r', 'o', 'r', 'a', 'n', 'g', 'k'},
            {'e', 't', 'r', 'n', 'x', 'w', 'p'},
            {'l', 'a', 'e', 'a', 'l', 'k', 'a'},
            {'p', 'm', 'h', 'n', 'n', 'm', 'r'},
            {'p', 'o', 'c', 'a', 'x', 'g', 'g'},
            {'a', 't', 'n', 'o', 'm', 'e', 'e'}
        };

        String[] words = {
            "apple", "banana", "cherry", "grapes",
            "lemon", "orange", "tomato", "ham"
        };

        Solver solver = new Solver(grid, words);
        solver.solve();

        System.out.println(solver);
    }
    
}

package esercizi_in_lezione.week2.day5.other;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class BFSPathfinding extends JPanel {
    private static final int SIZE = 50;
    private static final int CELL_SIZE = 20;
    private static final int[][] GRID = new int[SIZE][SIZE];
    private static final Point START = new Point(0, 0);
    private static final Point END = new Point(SIZE - 1, SIZE - 1);
    private static final List<Point> path = new ArrayList<>();

    public static void main(String[] args) {
        generateMaze();
        bfs();
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BFS Pathfinding");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new BFSPathfinding());
            frame.setSize(SIZE * CELL_SIZE, SIZE * CELL_SIZE);
            frame.setVisible(true);
        });
    }

    private static void generateMaze() {
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                GRID[i][j] = rand.nextDouble() < 0.2 ? 1 : 0; // 20% obstacles
            }
        }
        GRID[START.x][START.y] = 0;
        GRID[END.x][END.y] = 0;
    }

    private static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        Map<Point, Point> parentMap = new HashMap<>();
        queue.add(START);
        parentMap.put(START, null);

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            if (current.equals(END)) {
                reconstructPath(parentMap);
                return;
            }
            for (int[] d : directions) {
                Point next = new Point(current.x + d[0], current.y + d[1]);
                if (isValid(next) && !parentMap.containsKey(next)) {
                    queue.add(next);
                    parentMap.put(next, current);
                }
            }
        }
    }

    private static void reconstructPath(Map<Point, Point> parentMap) {
        Point current = END;
        while (current != null) {
            path.add(current);
            current = parentMap.get(current);
        }
        Collections.reverse(path);
    }

    private static boolean isValid(Point p) {
        return p.x >= 0 && p.x < SIZE && p.y >= 0 && p.y < SIZE && GRID[p.x][p.y] == 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                g.setColor(GRID[i][j] == 1 ? Color.BLACK : Color.WHITE);
                g.fillRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                g.setColor(Color.GRAY);
                g.drawRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }

        g.setColor(Color.BLUE);
        g.fillRect(START.y * CELL_SIZE, START.x * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        g.setColor(Color.RED);
        g.fillRect(END.y * CELL_SIZE, END.x * CELL_SIZE, CELL_SIZE, CELL_SIZE);

        g.setColor(Color.GREEN);
        for (Point p : path) {
            g.fillRect(p.y * CELL_SIZE, p.x * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }
    }
}

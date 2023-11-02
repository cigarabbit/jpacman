package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    /**
     * Test create a board.
     */
    @Test
    void testBoard() {
        Square s1 = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = s1;
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }

    /**
     * Test a null square
     */
    @Test
    void testBoardOneNullSquare(){
        Square s1 = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = s1;
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isEqualTo(grid[0][0]);
    }
}
